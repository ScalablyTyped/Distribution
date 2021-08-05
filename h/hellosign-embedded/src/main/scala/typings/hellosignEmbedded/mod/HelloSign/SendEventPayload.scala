package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.anon.CcEmailAddresses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendEventPayload extends StObject {
  
  var signatureRequestId: String
  
  var signatureRequestInfo: CcEmailAddresses
}
object SendEventPayload {
  
  inline def apply(signatureRequestId: String, signatureRequestInfo: CcEmailAddresses): SendEventPayload = {
    val __obj = js.Dynamic.literal(signatureRequestId = signatureRequestId.asInstanceOf[js.Any], signatureRequestInfo = signatureRequestInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEventPayload]
  }
  
  extension [Self <: SendEventPayload](x: Self) {
    
    inline def setSignatureRequestId(value: String): Self = StObject.set(x, "signatureRequestId", value.asInstanceOf[js.Any])
    
    inline def setSignatureRequestInfo(value: CcEmailAddresses): Self = StObject.set(x, "signatureRequestInfo", value.asInstanceOf[js.Any])
  }
}
