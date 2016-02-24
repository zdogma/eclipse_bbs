package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@EnableAutoConfiguration
public class RootController {
    @RequestMapping("/")
    public String welcome(@RequestParam(value="name", required=false, defaultValue="ゲスト") String name, Model model) {
      model.addAttribute("name", name);

      return "root/welcome";
    }
}
