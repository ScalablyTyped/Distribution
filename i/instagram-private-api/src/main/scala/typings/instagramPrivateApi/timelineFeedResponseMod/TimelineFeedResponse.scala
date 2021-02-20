package typings.instagramPrivateApi.timelineFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineFeedResponse extends StObject {
  
  var auto_load_more_enabled: Boolean = js.native
  
  var client_feed_changelist_applied: Boolean = js.native
  
  var client_gap_enforcer_matrix: js.Array[TimelineFeedResponseClientGapEnforcerMatrixItem] = js.native
  
  var client_session_id: String = js.native
  
  var feed_items: js.Array[TimelineFeedResponseFeedItemsItem] = js.native
  
  var feed_pill_text: String = js.native
  
  var is_direct_v2_enabled: Boolean = js.native
  
  var more_available: Boolean = js.native
  
  var next_max_id: String = js.native
  
  var num_results: Double = js.native
  
  var pagination_info: TimelineFeedResponsePaginationInfo = js.native
  
  var status: String = js.native
  
  var view_state_version: String = js.native
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
    pagination_info: TimelineFeedResponsePaginationInfo,
    status: String,
    view_state_version: String
  ): TimelineFeedResponse = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], client_feed_changelist_applied = client_feed_changelist_applied.asInstanceOf[js.Any], client_gap_enforcer_matrix = client_gap_enforcer_matrix.asInstanceOf[js.Any], client_session_id = client_session_id.asInstanceOf[js.Any], feed_items = feed_items.asInstanceOf[js.Any], feed_pill_text = feed_pill_text.asInstanceOf[js.Any], is_direct_v2_enabled = is_direct_v2_enabled.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], pagination_info = pagination_info.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], view_state_version = view_state_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponse]
  }
  
  @scala.inline
  implicit class TimelineFeedResponseMutableBuilder[Self <: TimelineFeedResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto_load_more_enabled(value: Boolean): Self = StObject.set(x, "auto_load_more_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_feed_changelist_applied(value: Boolean): Self = StObject.set(x, "client_feed_changelist_applied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_gap_enforcer_matrix(value: js.Array[TimelineFeedResponseClientGapEnforcerMatrixItem]): Self = StObject.set(x, "client_gap_enforcer_matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_gap_enforcer_matrixVarargs(value: TimelineFeedResponseClientGapEnforcerMatrixItem*): Self = StObject.set(x, "client_gap_enforcer_matrix", js.Array(value :_*))
    
    @scala.inline
    def setClient_session_id(value: String): Self = StObject.set(x, "client_session_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeed_items(value: js.Array[TimelineFeedResponseFeedItemsItem]): Self = StObject.set(x, "feed_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeed_itemsVarargs(value: TimelineFeedResponseFeedItemsItem*): Self = StObject.set(x, "feed_items", js.Array(value :_*))
    
    @scala.inline
    def setFeed_pill_text(value: String): Self = StObject.set(x, "feed_pill_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_direct_v2_enabled(value: Boolean): Self = StObject.set(x, "is_direct_v2_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_results(value: Double): Self = StObject.set(x, "num_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagination_info(value: TimelineFeedResponsePaginationInfo): Self = StObject.set(x, "pagination_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView_state_version(value: String): Self = StObject.set(x, "view_state_version", value.asInstanceOf[js.Any])
  }
}
