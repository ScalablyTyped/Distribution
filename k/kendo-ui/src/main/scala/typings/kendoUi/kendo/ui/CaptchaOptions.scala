package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptchaOptions extends StObject {
  
  var audioButton: js.UndefOr[Boolean] = js.undefined
  
  var audioHandler: js.UndefOr[String | js.Function | Any] = js.undefined
  
  var captcha: js.UndefOr[String] = js.undefined
  
  var captchaId: js.UndefOr[String] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ CaptchaChangeEvent, Unit]] = js.undefined
  
  var dataCaptchaField: js.UndefOr[String] = js.undefined
  
  var dataCaptchaIdField: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* e */ CaptchaErrorEvent, Unit]] = js.undefined
  
  var handler: js.UndefOr[String | js.Function | Any] = js.undefined
  
  var messages: js.UndefOr[CaptchaMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var requestEnd: js.UndefOr[js.Function1[/* e */ CaptchaRequestEndEvent, Unit]] = js.undefined
  
  var requestStart: js.UndefOr[js.Function1[/* e */ CaptchaRequestStartEvent, Unit]] = js.undefined
  
  var resetButton: js.UndefOr[Boolean] = js.undefined
  
  var validateOnBlur: js.UndefOr[Boolean] = js.undefined
  
  var validationHandler: js.UndefOr[String | js.Function | Any] = js.undefined
  
  var volumeControl: js.UndefOr[Boolean] = js.undefined
}
object CaptchaOptions {
  
  inline def apply(): CaptchaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptchaOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaptchaOptions] (val x: Self) extends AnyVal {
    
    inline def setAudioButton(value: Boolean): Self = StObject.set(x, "audioButton", value.asInstanceOf[js.Any])
    
    inline def setAudioButtonUndefined: Self = StObject.set(x, "audioButton", js.undefined)
    
    inline def setAudioHandler(value: String | js.Function | Any): Self = StObject.set(x, "audioHandler", value.asInstanceOf[js.Any])
    
    inline def setAudioHandlerUndefined: Self = StObject.set(x, "audioHandler", js.undefined)
    
    inline def setCaptcha(value: String): Self = StObject.set(x, "captcha", value.asInstanceOf[js.Any])
    
    inline def setCaptchaId(value: String): Self = StObject.set(x, "captchaId", value.asInstanceOf[js.Any])
    
    inline def setCaptchaIdUndefined: Self = StObject.set(x, "captchaId", js.undefined)
    
    inline def setCaptchaUndefined: Self = StObject.set(x, "captcha", js.undefined)
    
    inline def setChange(value: /* e */ CaptchaChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setDataCaptchaField(value: String): Self = StObject.set(x, "dataCaptchaField", value.asInstanceOf[js.Any])
    
    inline def setDataCaptchaFieldUndefined: Self = StObject.set(x, "dataCaptchaField", js.undefined)
    
    inline def setDataCaptchaIdField(value: String): Self = StObject.set(x, "dataCaptchaIdField", value.asInstanceOf[js.Any])
    
    inline def setDataCaptchaIdFieldUndefined: Self = StObject.set(x, "dataCaptchaIdField", js.undefined)
    
    inline def setError(value: /* e */ CaptchaErrorEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setHandler(value: String | js.Function | Any): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    inline def setMessages(value: CaptchaMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestEnd(value: /* e */ CaptchaRequestEndEvent => Unit): Self = StObject.set(x, "requestEnd", js.Any.fromFunction1(value))
    
    inline def setRequestEndUndefined: Self = StObject.set(x, "requestEnd", js.undefined)
    
    inline def setRequestStart(value: /* e */ CaptchaRequestStartEvent => Unit): Self = StObject.set(x, "requestStart", js.Any.fromFunction1(value))
    
    inline def setRequestStartUndefined: Self = StObject.set(x, "requestStart", js.undefined)
    
    inline def setResetButton(value: Boolean): Self = StObject.set(x, "resetButton", value.asInstanceOf[js.Any])
    
    inline def setResetButtonUndefined: Self = StObject.set(x, "resetButton", js.undefined)
    
    inline def setValidateOnBlur(value: Boolean): Self = StObject.set(x, "validateOnBlur", value.asInstanceOf[js.Any])
    
    inline def setValidateOnBlurUndefined: Self = StObject.set(x, "validateOnBlur", js.undefined)
    
    inline def setValidationHandler(value: String | js.Function | Any): Self = StObject.set(x, "validationHandler", value.asInstanceOf[js.Any])
    
    inline def setValidationHandlerUndefined: Self = StObject.set(x, "validationHandler", js.undefined)
    
    inline def setVolumeControl(value: Boolean): Self = StObject.set(x, "volumeControl", value.asInstanceOf[js.Any])
    
    inline def setVolumeControlUndefined: Self = StObject.set(x, "volumeControl", js.undefined)
  }
}
