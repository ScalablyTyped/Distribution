package typings.instagramPrivateApi.directInboxFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectInboxFeedResponse extends js.Object {
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
}

