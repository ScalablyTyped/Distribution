package typings.hellosignEmbedded.mod.HelloSign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignEventPayload extends StObject {
  
  var signatureId: String = js.native
}
object SignEventPayload {
  
  @scala.inline
  def apply(signatureId: String): SignEventPayload = {
    val __obj = js.Dynamic.literal(signatureId = signatureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignEventPayload]
  }
  
  @scala.inline
  implicit class SignEventPayloadMutableBuilder[Self <: SignEventPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignatureId(value: String): Self = StObject.set(x, "signatureId", value.asInstanceOf[js.Any])
  }
}
