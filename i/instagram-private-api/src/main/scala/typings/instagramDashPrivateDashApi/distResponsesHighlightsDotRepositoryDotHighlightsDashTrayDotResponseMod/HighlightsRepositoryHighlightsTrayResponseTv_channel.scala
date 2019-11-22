package typings.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotHighlightsDashTrayDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryHighlightsTrayResponseTv_channel extends js.Object {
  var id: String
  var items: js.Array[HighlightsRepositoryHighlightsTrayResponseItemsItem]
  var max_id: Null
  var more_available: Boolean
  var seen_state: HighlightsRepositoryHighlightsTrayResponseSeen_state
  var title: String
  var `type`: String
  var user_dict: HighlightsRepositoryHighlightsTrayResponseUser_dict
}

object HighlightsRepositoryHighlightsTrayResponseTv_channel {
  @scala.inline
  def apply(
    id: String,
    items: js.Array[HighlightsRepositoryHighlightsTrayResponseItemsItem],
    max_id: Null,
    more_available: Boolean,
    seen_state: HighlightsRepositoryHighlightsTrayResponseSeen_state,
    title: String,
    `type`: String,
    user_dict: HighlightsRepositoryHighlightsTrayResponseUser_dict
  ): HighlightsRepositoryHighlightsTrayResponseTv_channel = {
    val __obj = js.Dynamic.literal(id = id, items = items, max_id = max_id, more_available = more_available, seen_state = seen_state, title = title, user_dict = user_dict)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseTv_channel]
  }
}

