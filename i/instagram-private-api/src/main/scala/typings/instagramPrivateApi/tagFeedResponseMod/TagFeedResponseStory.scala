package typings.instagramPrivateApi.tagFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFeedResponseStory extends js.Object {
  var can_reply: Boolean
  var can_reshare: Boolean
  var expiring_at: Double
  var id: String
  var items: js.Array[TagFeedResponseItemsItem]
  var latest_reel_media: Double
  var muted: Boolean
  var owner: TagFeedResponseOwner
  var prefetch_count: Double
  var reel_type: String
  var seen: Double
  var unique_integer_reel_id: String
}

object TagFeedResponseStory {
  @scala.inline
  def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    expiring_at: Double,
    id: String,
    items: js.Array[TagFeedResponseItemsItem],
    latest_reel_media: Double,
    muted: Boolean,
    owner: TagFeedResponseOwner,
    prefetch_count: Double,
    reel_type: String,
    seen: Double,
    unique_integer_reel_id: String
  ): TagFeedResponseStory = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], prefetch_count = prefetch_count.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any], unique_integer_reel_id = unique_integer_reel_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagFeedResponseStory]
  }
}

