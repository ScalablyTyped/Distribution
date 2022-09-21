package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptchaMessages extends StObject {
  
  var audio: js.UndefOr[String] = js.undefined
  
  var imageAlt: js.UndefOr[String] = js.undefined
  
  var reset: js.UndefOr[String] = js.undefined
  
  var success: js.UndefOr[String] = js.undefined
}
object CaptchaMessages {
  
  inline def apply(): CaptchaMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptchaMessages]
  }
  
  extension [Self <: CaptchaMessages](x: Self) {
    
    inline def setAudio(value: String): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setImageAlt(value: String): Self = StObject.set(x, "imageAlt", value.asInstanceOf[js.Any])
    
    inline def setImageAltUndefined: Self = StObject.set(x, "imageAlt", js.undefined)
    
    inline def setReset(value: String): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
