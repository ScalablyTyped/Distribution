package typings.instagramDashPrivateDashApi.distResponsesLocationDotRepositoryDotStoryDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRepositoryStoryResponseStory extends js.Object {
  var can_reply: Boolean
  var can_reshare: Boolean
  var expiring_at: Double
  var has_pride_media: Boolean
  var id: String
  var items: js.Array[LocationRepositoryStoryResponseItemsItem]
  var latest_reel_media: Double
  var location: LocationRepositoryStoryResponseLocation
  var owner: LocationRepositoryStoryResponseOwner
  var prefetch_count: Double
  var reel_type: String
  var seen: Double
  var unique_integer_reel_id: String
}

object LocationRepositoryStoryResponseStory {
  @scala.inline
  def apply(
    can_reply: Boolean,
    can_reshare: Boolean,
    expiring_at: Double,
    has_pride_media: Boolean,
    id: String,
    items: js.Array[LocationRepositoryStoryResponseItemsItem],
    latest_reel_media: Double,
    location: LocationRepositoryStoryResponseLocation,
    owner: LocationRepositoryStoryResponseOwner,
    prefetch_count: Double,
    reel_type: String,
    seen: Double,
    unique_integer_reel_id: String
  ): LocationRepositoryStoryResponseStory = {
    val __obj = js.Dynamic.literal(can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], expiring_at = expiring_at.asInstanceOf[js.Any], has_pride_media = has_pride_media.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], latest_reel_media = latest_reel_media.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], prefetch_count = prefetch_count.asInstanceOf[js.Any], reel_type = reel_type.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any], unique_integer_reel_id = unique_integer_reel_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocationRepositoryStoryResponseStory]
  }
}

