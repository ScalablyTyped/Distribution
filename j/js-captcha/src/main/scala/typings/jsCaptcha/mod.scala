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
  class ^ ()
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
    
    @scala.inline
    def apply(canvasStyle: FillStyle): Options = {
      val __obj = js.Dynamic.literal(canvasStyle = canvasStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: (/* response */ success | error, /* captcha */ Element, /* numberOfTries */ Double) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setCanvasClass(value: String): Self = StObject.set(x, "canvasClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanvasClassUndefined: Self = StObject.set(x, "canvasClass", js.undefined)
      
      @scala.inline
      def setCanvasStyle(value: FillStyle): Self = StObject.set(x, "canvasStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearOnSubmit(value: Boolean): Self = StObject.set(x, "clearOnSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearOnSubmitUndefined: Self = StObject.set(x, "clearOnSubmit", js.undefined)
      
      @scala.inline
      def setEl(value: String): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      @scala.inline
      def setFocusOnError(value: Boolean): Self = StObject.set(x, "focusOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusOnErrorUndefined: Self = StObject.set(x, "focusOnError", js.undefined)
      
      @scala.inline
      def setRequiredValue(value: String): Self = StObject.set(x, "requiredValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredValueUndefined: Self = StObject.set(x, "requiredValue", js.undefined)
      
      @scala.inline
      def setResetOnError(value: Boolean): Self = StObject.set(x, "resetOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetOnErrorUndefined: Self = StObject.set(x, "resetOnError", js.undefined)
    }
  }
  
  trait jCaptcha extends StObject {
    
    def reset(): Unit
    
    def validate(): Unit
  }
  object jCaptcha {
    
    @scala.inline
    def apply(reset: () => Unit, validate: () => Unit): jCaptcha = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset), validate = js.Any.fromFunction0(validate))
      __obj.asInstanceOf[jCaptcha]
    }
    
    @scala.inline
    implicit class jCaptchaMutableBuilder[Self <: jCaptcha] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValidate(value: () => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    }
  }
}
