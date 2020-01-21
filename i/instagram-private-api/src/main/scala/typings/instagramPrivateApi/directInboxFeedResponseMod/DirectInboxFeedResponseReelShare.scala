package typings.instagramPrivateApi.directInboxFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectInboxFeedResponseReelShare extends js.Object {
  var is_reel_persisted: Boolean
  var media: DirectInboxFeedResponseMedia
  var reel_owner_id: Double
  var reel_type: String
  var text: String
  var `type`: String
}

object DirectInboxFeedResponseReelShare {
  @scala.inline
  def apply(
    is_reel_persisted: Boolean,
    media: DirectInboxFeedResponseMedia,
    reel_owner_id: Double,
    reel_type: String,
    text: String,
    `type`: String
  ): DirectInboxFeedResponseReelShare = {
    val __obj = js.Dynamic.literal(is_reel_persisted = is_reel_persisted.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], reel_owner_id = reel_owner_id.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponseReelShare]
  }
}

