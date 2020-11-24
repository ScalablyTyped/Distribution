package typings.instagramPrivateApi.directInboxFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectInboxFeedResponse extends js.Object {
  
  var inbox: DirectInboxFeedResponseInbox = js.native
  
  var most_recent_inviter: DirectInboxFeedResponseMostRecentInviter = js.native
  
  var pending_requests_total: Double = js.native
  
  var seq_id: Double = js.native
  
  var snapshot_at_ms: Double = js.native
  
  var status: String = js.native
}
object DirectInboxFeedResponse {
  
  @scala.inline
  def apply(
    inbox: DirectInboxFeedResponseInbox,
    most_recent_inviter: DirectInboxFeedResponseMostRecentInviter,
    pending_requests_total: Double,
    seq_id: Double,
    snapshot_at_ms: Double,
    status: String
  ): DirectInboxFeedResponse = {
    val __obj = js.Dynamic.literal(inbox = inbox.asInstanceOf[js.Any], most_recent_inviter = most_recent_inviter.asInstanceOf[js.Any], pending_requests_total = pending_requests_total.asInstanceOf[js.Any], seq_id = seq_id.asInstanceOf[js.Any], snapshot_at_ms = snapshot_at_ms.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponse]
  }
  
  @scala.inline
  implicit class DirectInboxFeedResponseOps[Self <: DirectInboxFeedResponse] (val x: Self) extends AnyVal {
    
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
    def setInbox(value: DirectInboxFeedResponseInbox): Self = this.set("inbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMost_recent_inviter(value: DirectInboxFeedResponseMostRecentInviter): Self = this.set("most_recent_inviter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending_requests_total(value: Double): Self = this.set("pending_requests_total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeq_id(value: Double): Self = this.set("seq_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshot_at_ms(value: Double): Self = this.set("snapshot_at_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
