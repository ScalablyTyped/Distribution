package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionTerminateOptions extends StObject {
  
  var body: js.UndefOr[String] = js.undefined
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  var reason_phrase: js.UndefOr[String] = js.undefined
  
  var status_code: js.UndefOr[Double] = js.undefined
}
object SessionTerminateOptions {
  
  inline def apply(): SessionTerminateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionTerminateOptions]
  }
  
  extension [Self <: SessionTerminateOptions](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
    
    inline def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
    
    inline def setReason_phrase(value: String): Self = StObject.set(x, "reason_phrase", value.asInstanceOf[js.Any])
    
    inline def setReason_phraseUndefined: Self = StObject.set(x, "reason_phrase", js.undefined)
    
    inline def setStatus_code(value: Double): Self = StObject.set(x, "status_code", value.asInstanceOf[js.Any])
    
    inline def setStatus_codeUndefined: Self = StObject.set(x, "status_code", js.undefined)
  }
}
