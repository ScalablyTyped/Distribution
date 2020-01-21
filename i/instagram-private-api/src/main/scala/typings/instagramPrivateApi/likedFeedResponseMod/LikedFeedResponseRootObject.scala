package typings.instagramPrivateApi.likedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LikedFeedResponseRootObject extends js.Object {
  var auto_load_more_enabled: Boolean
  var items: js.Array[LikedFeedResponseItemsItem]
  var more_available: Boolean
  var next_max_id: String | Double
  var num_results: Double
  var status: String
}

object LikedFeedResponseRootObject {
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    items: js.Array[LikedFeedResponseItemsItem],
    more_available: Boolean,
    next_max_id: String | Double,
    num_results: Double,
    status: String
  ): LikedFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LikedFeedResponseRootObject]
  }
}

