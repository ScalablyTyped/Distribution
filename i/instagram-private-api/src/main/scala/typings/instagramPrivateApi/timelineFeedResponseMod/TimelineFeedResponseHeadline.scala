package typings.instagramPrivateApi.timelineFeedResponseMod

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
    val __obj = js.Dynamic.literal(bit_flags = bit_flags.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], created_at_utc = created_at_utc.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseHeadline]
  }
}

