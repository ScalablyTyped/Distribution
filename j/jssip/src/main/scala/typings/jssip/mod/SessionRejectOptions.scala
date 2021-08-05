package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionRejectOptions extends StObject {
  
  var extraHeaders: js.Array[String]
  
  var reason_phrase: String
  
  var status_code: Double
}
object SessionRejectOptions {
  
  inline def apply(extraHeaders: js.Array[String], reason_phrase: String, status_code: Double): SessionRejectOptions = {
    val __obj = js.Dynamic.literal(extraHeaders = extraHeaders.asInstanceOf[js.Any], reason_phrase = reason_phrase.asInstanceOf[js.Any], status_code = status_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionRejectOptions]
  }
  
  extension [Self <: SessionRejectOptions](x: Self) {
    
    inline def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    inline def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
    
    inline def setReason_phrase(value: String): Self = StObject.set(x, "reason_phrase", value.asInstanceOf[js.Any])
    
    inline def setStatus_code(value: Double): Self = StObject.set(x, "status_code", value.asInstanceOf[js.Any])
  }
}
