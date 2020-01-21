package typings.instagramPrivateApi.usertagsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsertagsFeedResponseRootObject extends js.Object {
  var auto_load_more_enabled: Boolean
  var items: js.Array[UsertagsFeedResponseItemsItem]
  var more_available: Boolean
  var new_photos: js.Array[_]
  var next_max_id: String
  var num_results: Double
  var requires_review: Boolean
  var status: String
  var total_count: Double
}

object UsertagsFeedResponseRootObject {
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    items: js.Array[UsertagsFeedResponseItemsItem],
    more_available: Boolean,
    new_photos: js.Array[_],
    next_max_id: String,
    num_results: Double,
    requires_review: Boolean,
    status: String,
    total_count: Double
  ): UsertagsFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], new_photos = new_photos.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], requires_review = requires_review.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsertagsFeedResponseRootObject]
  }
}

