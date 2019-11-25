package typings.instagramDashPrivateDashApi.distResponsesUserDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserFeedResponse extends js.Object {
  var auto_load_more_enabled: Boolean
  var items: js.Array[UserFeedResponseItemsItem]
  var more_available: Boolean
  var next_max_id: String
  var num_results: Double
  var status: String
}

object UserFeedResponse {
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    items: js.Array[UserFeedResponseItemsItem],
    more_available: Boolean,
    next_max_id: String,
    num_results: Double,
    status: String
  ): UserFeedResponse = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserFeedResponse]
  }
}

