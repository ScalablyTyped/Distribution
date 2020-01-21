package typings.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightsRepositoryHighlightsTrayResponseTvChannel extends js.Object {
  var id: String
  var items: js.Array[HighlightsRepositoryHighlightsTrayResponseItemsItem]
  var max_id: Null
  var more_available: Boolean
  var seen_state: HighlightsRepositoryHighlightsTrayResponseSeenState
  var title: String
  var `type`: String
  var user_dict: HighlightsRepositoryHighlightsTrayResponseUserDict
}

object HighlightsRepositoryHighlightsTrayResponseTvChannel {
  @scala.inline
  def apply(
    id: String,
    items: js.Array[HighlightsRepositoryHighlightsTrayResponseItemsItem],
    max_id: Null,
    more_available: Boolean,
    seen_state: HighlightsRepositoryHighlightsTrayResponseSeenState,
    title: String,
    `type`: String,
    user_dict: HighlightsRepositoryHighlightsTrayResponseUserDict
  ): HighlightsRepositoryHighlightsTrayResponseTvChannel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], seen_state = seen_state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], user_dict = user_dict.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseTvChannel]
  }
}

