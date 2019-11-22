package typings.instagramDashPrivateDashApi.distResponsesTagDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFeedResponse extends js.Object {
  var auto_load_more_enabled: Boolean
  var items: js.Array[TagFeedResponseItemsItem]
  var more_available: Boolean
  var next_max_id: String
  var num_results: Double
  var ranked_items: js.Array[TagFeedResponseRankedItemsItem]
  var status: String
  var story: TagFeedResponseStory
}

object TagFeedResponse {
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    items: js.Array[TagFeedResponseItemsItem],
    more_available: Boolean,
    next_max_id: String,
    num_results: Double,
    ranked_items: js.Array[TagFeedResponseRankedItemsItem],
    status: String,
    story: TagFeedResponseStory
  ): TagFeedResponse = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled, items = items, more_available = more_available, next_max_id = next_max_id, num_results = num_results, ranked_items = ranked_items, status = status, story = story)
  
    __obj.asInstanceOf[TagFeedResponse]
  }
}

