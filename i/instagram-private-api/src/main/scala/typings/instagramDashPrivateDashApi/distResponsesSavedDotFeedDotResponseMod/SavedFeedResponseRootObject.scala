package typings.instagramDashPrivateDashApi.distResponsesSavedDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedFeedResponseRootObject extends js.Object {
  var auto_load_more_enabled: Boolean
  var items: js.Array[SavedFeedResponseItemsItem]
  var more_available: Boolean
  var next_max_id: String
  var num_results: Double
  var status: String
}

object SavedFeedResponseRootObject {
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    items: js.Array[SavedFeedResponseItemsItem],
    more_available: Boolean,
    next_max_id: String,
    num_results: Double,
    status: String
  ): SavedFeedResponseRootObject = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled, items = items, more_available = more_available, next_max_id = next_max_id, num_results = num_results, status = status)
  
    __obj.asInstanceOf[SavedFeedResponseRootObject]
  }
}

