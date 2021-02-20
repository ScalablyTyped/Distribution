package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsTrayFeedResponseBroadcastsItem extends StObject {
  
  var broadcast_message: String = js.native
  
  var broadcast_owner: ReelsTrayFeedResponseBroadcastOwner = js.native
  
  var broadcast_status: String = js.native
  
  var cobroadcasters: js.Array[_] = js.native
  
  var cover_frame_url: String = js.native
  
  var dash_abr_playback_url: Null = js.native
  
  var dash_live_predictive_playback_url: String = js.native
  
  var dash_playback_url: String = js.native
  
  var hide_from_feed_unit: Boolean = js.native
  
  var id: String = js.native
  
  var internal_only: Boolean = js.native
  
  var is_gaming_content: Boolean = js.native
  
  var is_player_live_trace_enabled: Double = js.native
  
  var media_id: String = js.native
  
  var muted: Boolean = js.native
  
  var organic_tracking_token: String = js.native
  
  var published_time: Double = js.native
  
  var ranked_position: Double = js.native
  
  var rtmp_playback_url: String = js.native
  
  var seen_ranked_position: Double = js.native
  
  var viewer_count: Double = js.native
}
object ReelsTrayFeedResponseBroadcastsItem {
  
  @scala.inline
  def apply(
    broadcast_message: String,
    broadcast_owner: ReelsTrayFeedResponseBroadcastOwner,
    broadcast_status: String,
    cobroadcasters: js.Array[_],
    cover_frame_url: String,
    dash_abr_playback_url: Null,
    dash_live_predictive_playback_url: String,
    dash_playback_url: String,
    hide_from_feed_unit: Boolean,
    id: String,
    internal_only: Boolean,
    is_gaming_content: Boolean,
    is_player_live_trace_enabled: Double,
    media_id: String,
    muted: Boolean,
    organic_tracking_token: String,
    published_time: Double,
    ranked_position: Double,
    rtmp_playback_url: String,
    seen_ranked_position: Double,
    viewer_count: Double
  ): ReelsTrayFeedResponseBroadcastsItem = {
    val __obj = js.Dynamic.literal(broadcast_message = broadcast_message.asInstanceOf[js.Any], broadcast_owner = broadcast_owner.asInstanceOf[js.Any], broadcast_status = broadcast_status.asInstanceOf[js.Any], cobroadcasters = cobroadcasters.asInstanceOf[js.Any], cover_frame_url = cover_frame_url.asInstanceOf[js.Any], dash_abr_playback_url = dash_abr_playback_url.asInstanceOf[js.Any], dash_live_predictive_playback_url = dash_live_predictive_playback_url.asInstanceOf[js.Any], dash_playback_url = dash_playback_url.asInstanceOf[js.Any], hide_from_feed_unit = hide_from_feed_unit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], internal_only = internal_only.asInstanceOf[js.Any], is_gaming_content = is_gaming_content.asInstanceOf[js.Any], is_player_live_trace_enabled = is_player_live_trace_enabled.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], published_time = published_time.asInstanceOf[js.Any], ranked_position = ranked_position.asInstanceOf[js.Any], rtmp_playback_url = rtmp_playback_url.asInstanceOf[js.Any], seen_ranked_position = seen_ranked_position.asInstanceOf[js.Any], viewer_count = viewer_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsTrayFeedResponseBroadcastsItem]
  }
  
  @scala.inline
  implicit class ReelsTrayFeedResponseBroadcastsItemMutableBuilder[Self <: ReelsTrayFeedResponseBroadcastsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBroadcast_message(value: String): Self = StObject.set(x, "broadcast_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadcast_owner(value: ReelsTrayFeedResponseBroadcastOwner): Self = StObject.set(x, "broadcast_owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadcast_status(value: String): Self = StObject.set(x, "broadcast_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCobroadcasters(value: js.Array[_]): Self = StObject.set(x, "cobroadcasters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCobroadcastersVarargs(value: js.Any*): Self = StObject.set(x, "cobroadcasters", js.Array(value :_*))
    
    @scala.inline
    def setCover_frame_url(value: String): Self = StObject.set(x, "cover_frame_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDash_abr_playback_url(value: Null): Self = StObject.set(x, "dash_abr_playback_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDash_live_predictive_playback_url(value: String): Self = StObject.set(x, "dash_live_predictive_playback_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDash_playback_url(value: String): Self = StObject.set(x, "dash_playback_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide_from_feed_unit(value: Boolean): Self = StObject.set(x, "hide_from_feed_unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternal_only(value: Boolean): Self = StObject.set(x, "internal_only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_gaming_content(value: Boolean): Self = StObject.set(x, "is_gaming_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_player_live_trace_enabled(value: Double): Self = StObject.set(x, "is_player_live_trace_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganic_tracking_token(value: String): Self = StObject.set(x, "organic_tracking_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublished_time(value: Double): Self = StObject.set(x, "published_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRanked_position(value: Double): Self = StObject.set(x, "ranked_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtmp_playback_url(value: String): Self = StObject.set(x, "rtmp_playback_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeen_ranked_position(value: Double): Self = StObject.set(x, "seen_ranked_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_count(value: Double): Self = StObject.set(x, "viewer_count", value.asInstanceOf[js.Any])
  }
}
