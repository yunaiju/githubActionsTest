package com.sample.gihubActions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    @ResponseBody
    @GetMapping("")
    public String main() {
        return "success to cicd ?";
    }
}
