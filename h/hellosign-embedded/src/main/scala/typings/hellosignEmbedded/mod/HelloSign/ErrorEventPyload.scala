package typings.hellosignEmbedded.mod.HelloSign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorEventPyload extends StObject {
  
  var code: String
  
  var signatureId: String
}
object ErrorEventPyload {
  
  inline def apply(code: String, signatureId: String): ErrorEventPyload = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], signatureId = signatureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEventPyload]
  }
  
  extension [Self <: ErrorEventPyload](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setSignatureId(value: String): Self = StObject.set(x, "signatureId", value.asInstanceOf[js.Any])
  }
}
