package typings.instagramDashPrivateDashApi.distResponsesTimelineDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFeedResponseHeadline extends js.Object {
  var bit_flags: Double
  var content_type: String
  var created_at: Double
  var created_at_utc: Double
  var media_id: String
  var pk: String
  var status: String
  var text: String
  var `type`: Double
  var user: TimelineFeedResponseUser
  var user_id: Double
}

object TimelineFeedResponseHeadline {
  @scala.inline
  def apply(
    bit_flags: Double,
    content_type: String,
    created_at: Double,
    created_at_utc: Double,
    media_id: String,
    pk: String,
    status: String,
    text: String,
    `type`: Double,
    user: TimelineFeedResponseUser,
    user_id: Double
  ): TimelineFeedResponseHeadline = {
    val __obj = js.Dynamic.literal(bit_flags = bit_flags, content_type = content_type, created_at = created_at, created_at_utc = created_at_utc, media_id = media_id, pk = pk, status = status, text = text, user = user, user_id = user_id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TimelineFeedResponseHeadline]
  }
}

