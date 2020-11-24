package typings.maximMazurokGapiClientAccessapproval.gapi.client.accessapproval

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApproveApprovalRequestMessage extends js.Object {
  
  /** The expiration time of this approval. */
  var expireTime: js.UndefOr[String] = js.native
}
object ApproveApprovalRequestMessage {
  
  @scala.inline
  def apply(): ApproveApprovalRequestMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApproveApprovalRequestMessage]
  }
  
  @scala.inline
  implicit class ApproveApprovalRequestMessageOps[Self <: ApproveApprovalRequestMessage] (val x: Self) extends AnyVal {
    
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
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
  }
}
