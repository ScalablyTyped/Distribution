package typings.hellosignEmbedded.mod.HelloSign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadyEventPayload extends js.Object {
  
  var signatureId: String = js.native
}
object ReadyEventPayload {
  
  @scala.inline
  def apply(signatureId: String): ReadyEventPayload = {
    val __obj = js.Dynamic.literal(signatureId = signatureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadyEventPayload]
  }
  
  @scala.inline
  implicit class ReadyEventPayloadOps[Self <: ReadyEventPayload] (val x: Self) extends AnyVal {
    
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
    def setSignatureId(value: String): Self = this.set("signatureId", value.asInstanceOf[js.Any])
  }
}
