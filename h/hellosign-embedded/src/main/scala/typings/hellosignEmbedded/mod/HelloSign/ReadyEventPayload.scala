package typings.hellosignEmbedded.mod.HelloSign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadyEventPayload extends StObject {
  
  var signatureId: String
}
object ReadyEventPayload {
  
  inline def apply(signatureId: String): ReadyEventPayload = {
    val __obj = js.Dynamic.literal(signatureId = signatureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadyEventPayload]
  }
  
  extension [Self <: ReadyEventPayload](x: Self) {
    
    inline def setSignatureId(value: String): Self = StObject.set(x, "signatureId", value.asInstanceOf[js.Any])
  }
}
