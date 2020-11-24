package typings.hellosignEmbedded.mod.HelloSign

import typings.hellosignEmbedded.anon.CcEmailAddresses
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendEventPayload extends js.Object {
  
  var signatureRequestId: String = js.native
  
  var signatureRequestInfo: CcEmailAddresses = js.native
}
object SendEventPayload {
  
  @scala.inline
  def apply(signatureRequestId: String, signatureRequestInfo: CcEmailAddresses): SendEventPayload = {
    val __obj = js.Dynamic.literal(signatureRequestId = signatureRequestId.asInstanceOf[js.Any], signatureRequestInfo = signatureRequestInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEventPayload]
  }
  
  @scala.inline
  implicit class SendEventPayloadOps[Self <: SendEventPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSignatureRequestId(value: String): Self = this.set("signatureRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureRequestInfo(value: CcEmailAddresses): Self = this.set("signatureRequestInfo", value.asInstanceOf[js.Any])
  }
}
