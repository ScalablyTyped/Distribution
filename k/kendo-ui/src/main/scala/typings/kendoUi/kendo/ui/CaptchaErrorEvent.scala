package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptchaErrorEvent
  extends StObject
     with CaptchaEvent {
  
  var errorThrown: js.UndefOr[String] = js.undefined
  
  var jqXHR: js.UndefOr[Any] = js.undefined
  
  var textStatus: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object CaptchaErrorEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Captcha): CaptchaErrorEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptchaErrorEvent]
  }
  
  extension [Self <: CaptchaErrorEvent](x: Self) {
    
    inline def setErrorThrown(value: String): Self = StObject.set(x, "errorThrown", value.asInstanceOf[js.Any])
    
    inline def setErrorThrownUndefined: Self = StObject.set(x, "errorThrown", js.undefined)
    
    inline def setJqXHR(value: Any): Self = StObject.set(x, "jqXHR", value.asInstanceOf[js.Any])
    
    inline def setJqXHRUndefined: Self = StObject.set(x, "jqXHR", js.undefined)
    
    inline def setTextStatus(value: String): Self = StObject.set(x, "textStatus", value.asInstanceOf[js.Any])
    
    inline def setTextStatusUndefined: Self = StObject.set(x, "textStatus", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
