package typings.jsCaptcha

import typings.jsCaptcha.anon.FillStyle
import typings.jsCaptcha.jsCaptchaStrings.error
import typings.jsCaptcha.jsCaptchaStrings.success
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-captcha", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with jCaptcha {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def validate(): Unit = js.native
  }
  
  /**
    * Options for the base jCaptcha class. Derived from https://github.com/robiveli/js-captcha#options
    */
  trait Options extends StObject {
    
    var callback: js.UndefOr[
        js.Function3[
          /* response */ success | error, 
          /* captcha */ Element, 
          /* numberOfTries */ Double, 
          Unit
        ]
      ] = js.undefined
    
    var canvasClass: js.UndefOr[String] = js.undefined
    
    var canvasStyle: FillStyle
    
    var clearOnSubmit: js.UndefOr[Boolean] = js.undefined
    
    var el: js.UndefOr[String] = js.undefined
    
    var focusOnError: js.UndefOr[Boolean] = js.undefined
    
    var requiredValue: js.UndefOr[String] = js.undefined
    
    var resetOnError: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(canvasStyle: FillStyle): Options = {
      val __obj = js.Dynamic.literal(canvasStyle = canvasStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCallback(value: (/* response */ success | error, /* captcha */ Element, /* numberOfTries */ Double) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCanvasClass(value: String): Self = StObject.set(x, "canvasClass", value.asInstanceOf[js.Any])
      
      inline def setCanvasClassUndefined: Self = StObject.set(x, "canvasClass", js.undefined)
      
      inline def setCanvasStyle(value: FillStyle): Self = StObject.set(x, "canvasStyle", value.asInstanceOf[js.Any])
      
      inline def setClearOnSubmit(value: Boolean): Self = StObject.set(x, "clearOnSubmit", value.asInstanceOf[js.Any])
      
      inline def setClearOnSubmitUndefined: Self = StObject.set(x, "clearOnSubmit", js.undefined)
      
      inline def setEl(value: String): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setFocusOnError(value: Boolean): Self = StObject.set(x, "focusOnError", value.asInstanceOf[js.Any])
      
      inline def setFocusOnErrorUndefined: Self = StObject.set(x, "focusOnError", js.undefined)
      
      inline def setRequiredValue(value: String): Self = StObject.set(x, "requiredValue", value.asInstanceOf[js.Any])
      
      inline def setRequiredValueUndefined: Self = StObject.set(x, "requiredValue", js.undefined)
      
      inline def setResetOnError(value: Boolean): Self = StObject.set(x, "resetOnError", value.asInstanceOf[js.Any])
      
      inline def setResetOnErrorUndefined: Self = StObject.set(x, "resetOnError", js.undefined)
    }
  }
  
  trait jCaptcha extends StObject {
    
    def reset(): Unit
    
    def validate(): Unit
  }
  object jCaptcha {
    
    inline def apply(reset: () => Unit, validate: () => Unit): jCaptcha = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), validate = js.Any.fromFunction0(validate))
      __obj.asInstanceOf[jCaptcha]
    }
    
    extension [Self <: jCaptcha](x: Self) {
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setValidate(value: () => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    }
  }
}
