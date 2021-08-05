package typings.jssip.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageRejectOptions extends StObject {
  
  var body: js.UndefOr[String] = js.undefined
  
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  var reason_phrase: String
  
  var status_code: js.UndefOr[js.Array[Double]] = js.undefined
}
object MessageRejectOptions {
  
  inline def apply(reason_phrase: String): MessageRejectOptions = {
    val __obj = js.Dynamic.literal(reason_phrase = reason_phrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRejectOptions]
  }
  
  extension [Self <: MessageRejectOptions](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
    
    inline def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
    
    inline def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
    
    inline def setReason_phrase(value: String): Self = StObject.set(x, "reason_phrase", value.asInstanceOf[js.Any])
    
    inline def setStatus_code(value: js.Array[Double]): Self = StObject.set(x, "status_code", value.asInstanceOf[js.Any])
    
    inline def setStatus_codeUndefined: Self = StObject.set(x, "status_code", js.undefined)
    
    inline def setStatus_codeVarargs(value: Double*): Self = StObject.set(x, "status_code", js.Array(value :_*))
  }
}
