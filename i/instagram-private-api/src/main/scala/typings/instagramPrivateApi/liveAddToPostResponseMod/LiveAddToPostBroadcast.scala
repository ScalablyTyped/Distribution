package typings.instagramPrivateApi.liveAddToPostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveAddToPostBroadcast extends js.Object {
  var broadcast_message: String
  var broadcast_owner: LiveAddToPostBroadcastOwner
  var broadcast_status: String
  var hide_from_feed_unit: Boolean
  var id: String
  var media_id: String
  var organic_tracking_token: String
  var published_time: Double
}

object LiveAddToPostBroadcast {
  @scala.inline
  def apply(
    broadcast_message: String,
    broadcast_owner: LiveAddToPostBroadcastOwner,
    broadcast_status: String,
    hide_from_feed_unit: Boolean,
    id: String,
    media_id: String,
    organic_tracking_token: String,
    published_time: Double
  ): LiveAddToPostBroadcast = {
    val __obj = js.Dynamic.literal(broadcast_message = broadcast_message.asInstanceOf[js.Any], broadcast_owner = broadcast_owner.asInstanceOf[js.Any], broadcast_status = broadcast_status.asInstanceOf[js.Any], hide_from_feed_unit = hide_from_feed_unit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], published_time = published_time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LiveAddToPostBroadcast]
  }
}

