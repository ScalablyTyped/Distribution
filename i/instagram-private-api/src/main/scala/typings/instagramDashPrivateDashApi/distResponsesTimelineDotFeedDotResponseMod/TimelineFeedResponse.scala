package typings.instagramDashPrivateDashApi.distResponsesTimelineDotFeedDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFeedResponse extends js.Object {
  var auto_load_more_enabled: Boolean
  var client_feed_changelist_applied: Boolean
  var client_gap_enforcer_matrix: js.Array[TimelineFeedResponseClientGapEnforcerMatrixItem]
  var client_session_id: String
  var feed_items: js.Array[TimelineFeedResponseFeedItemsItem]
  var feed_pill_text: String
  var is_direct_v2_enabled: Boolean
  var more_available: Boolean
  var next_max_id: String
  var num_results: Double
  var pagination_info: TimelineFeedResponsePagination_info
  var status: String
  var view_state_version: String
}

object TimelineFeedResponse {
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    client_feed_changelist_applied: Boolean,
    client_gap_enforcer_matrix: js.Array[TimelineFeedResponseClientGapEnforcerMatrixItem],
    client_session_id: String,
    feed_items: js.Array[TimelineFeedResponseFeedItemsItem],
    feed_pill_text: String,
    is_direct_v2_enabled: Boolean,
    more_available: Boolean,
    next_max_id: String,
    num_results: Double,
    pagination_info: TimelineFeedResponsePagination_info,
    status: String,
    view_state_version: String
  ): TimelineFeedResponse = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], client_feed_changelist_applied = client_feed_changelist_applied.asInstanceOf[js.Any], client_gap_enforcer_matrix = client_gap_enforcer_matrix.asInstanceOf[js.Any], client_session_id = client_session_id.asInstanceOf[js.Any], feed_items = feed_items.asInstanceOf[js.Any], feed_pill_text = feed_pill_text.asInstanceOf[js.Any], is_direct_v2_enabled = is_direct_v2_enabled.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], pagination_info = pagination_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], view_state_version = view_state_version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimelineFeedResponse]
  }
}

