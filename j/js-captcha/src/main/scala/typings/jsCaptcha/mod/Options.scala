package typings.jsCaptcha.mod

import typings.jsCaptcha.anon.FillStyle
import typings.jsCaptcha.jsCaptchaStrings.error
import typings.jsCaptcha.jsCaptchaStrings.success
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the base jCaptcha class. Derived from https://github.com/robiveli/js-captcha#options
  */
@js.native
trait Options extends js.Object {
  
  var callback: js.UndefOr[
    js.Function3[
      /* response */ success | error, 
      /* captcha */ Element, 
      /* numberOfTries */ Double, 
      Unit
    ]
  ] = js.native
  
  var canvasClass: js.UndefOr[String] = js.native
  
  var canvasStyle: FillStyle = js.native
  
  var clearOnSubmit: js.UndefOr[Boolean] = js.native
  
  var el: js.UndefOr[String] = js.native
  
  var focusOnError: js.UndefOr[Boolean] = js.native
  
  var requiredValue: js.UndefOr[String] = js.native
  
  var resetOnError: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(canvasStyle: FillStyle): Options = {
    val __obj = js.Dynamic.literal(canvasStyle = canvasStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCanvasStyle(value: FillStyle): Self = this.set("canvasStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallback(value: (/* response */ success | error, /* captcha */ Element, /* numberOfTries */ Double) => Unit): Self = this.set("callback", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCanvasClass(value: String): Self = this.set("canvasClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvasClass: Self = this.set("canvasClass", js.undefined)
    
    @scala.inline
    def setClearOnSubmit(value: Boolean): Self = this.set("clearOnSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearOnSubmit: Self = this.set("clearOnSubmit", js.undefined)
    
    @scala.inline
    def setEl(value: String): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    
    @scala.inline
    def setFocusOnError(value: Boolean): Self = this.set("focusOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusOnError: Self = this.set("focusOnError", js.undefined)
    
    @scala.inline
    def setRequiredValue(value: String): Self = this.set("requiredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredValue: Self = this.set("requiredValue", js.undefined)
    
    @scala.inline
    def setResetOnError(value: Boolean): Self = this.set("resetOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetOnError: Self = this.set("resetOnError", js.undefined)
  }
}
