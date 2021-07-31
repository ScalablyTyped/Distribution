package typings.instagramPrivateApi.directInboxFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectInboxFeedResponse extends StObject {
  
  var inbox: DirectInboxFeedResponseInbox
  
  var most_recent_inviter: DirectInboxFeedResponseMostRecentInviter
  
  var pending_requests_total: Double
  
  var seq_id: Double
  
  var snapshot_at_ms: Double
  
  var status: String
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
  implicit class DirectInboxFeedResponseMutableBuilder[Self <: DirectInboxFeedResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInbox(value: DirectInboxFeedResponseInbox): Self = StObject.set(x, "inbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMost_recent_inviter(value: DirectInboxFeedResponseMostRecentInviter): Self = StObject.set(x, "most_recent_inviter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending_requests_total(value: Double): Self = StObject.set(x, "pending_requests_total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeq_id(value: Double): Self = StObject.set(x, "seq_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshot_at_ms(value: Double): Self = StObject.set(x, "snapshot_at_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
