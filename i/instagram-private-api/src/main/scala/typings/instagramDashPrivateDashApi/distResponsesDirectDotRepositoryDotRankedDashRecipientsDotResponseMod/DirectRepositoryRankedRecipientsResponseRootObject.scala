package typings.instagramDashPrivateDashApi.distResponsesDirectDotRepositoryDotRankedDashRecipientsDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectRepositoryRankedRecipientsResponseRootObject extends js.Object {
  var expires: Double
  var filtered: Boolean
  var rank_token: String
  var ranked_recipients: js.Array[DirectRepositoryRankedRecipientsResponseRankedRecipientsItem]
  var request_id: String
  var status: String
}

object DirectRepositoryRankedRecipientsResponseRootObject {
  @scala.inline
  def apply(
    expires: Double,
    filtered: Boolean,
    rank_token: String,
    ranked_recipients: js.Array[DirectRepositoryRankedRecipientsResponseRankedRecipientsItem],
    request_id: String,
    status: String
  ): DirectRepositoryRankedRecipientsResponseRootObject = {
    val __obj = js.Dynamic.literal(expires = expires, filtered = filtered, rank_token = rank_token, ranked_recipients = ranked_recipients, request_id = request_id, status = status)
  
    __obj.asInstanceOf[DirectRepositoryRankedRecipientsResponseRootObject]
  }
}

