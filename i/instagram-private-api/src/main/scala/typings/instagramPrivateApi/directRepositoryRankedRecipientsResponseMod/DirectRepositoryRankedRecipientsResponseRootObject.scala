package typings.instagramPrivateApi.directRepositoryRankedRecipientsResponseMod

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
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], filtered = filtered.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], ranked_recipients = ranked_recipients.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectRepositoryRankedRecipientsResponseRootObject]
  }
}

