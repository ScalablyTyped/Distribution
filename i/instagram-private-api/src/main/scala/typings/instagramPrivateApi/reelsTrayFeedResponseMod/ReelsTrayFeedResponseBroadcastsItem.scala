package typings.instagramPrivateApi.reelsTrayFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsTrayFeedResponseBroadcastsItem extends StObject {
  
  var broadcast_message: String
  
  var broadcast_owner: ReelsTrayFeedResponseBroadcastOwner
  
  var broadcast_status: String
  
  var cobroadcasters: js.Array[js.Any]
  
  var cover_frame_url: String
  
  var dash_abr_playback_url: Null
  
  var dash_live_predictive_playback_url: String
  
  var dash_playback_url: String
  
  var hide_from_feed_unit: Boolean
  
  var id: String
  
  var internal_only: Boolean
  
  var is_gaming_content: Boolean
  
  var is_player_live_trace_enabled: Double
  
  var media_id: String
  
  var muted: Boolean
  
  var organic_tracking_token: String
  
  var published_time: Double
  
  var ranked_position: Double
  
  var rtmp_playback_url: String
  
  var seen_ranked_position: Double
  
  var viewer_count: Double
}
object ReelsTrayFeedResponseBroadcastsItem {
  
  inline def apply(
    broadcast_message: String,
    broadcast_owner: ReelsTrayFeedResponseBroadcastOwner,
    broadcast_status: String,
    cobroadcasters: js.Array[js.Any],
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
  
  extension [Self <: ReelsTrayFeedResponseBroadcastsItem](x: Self) {
    
    inline def setBroadcast_message(value: String): Self = StObject.set(x, "broadcast_message", value.asInstanceOf[js.Any])
    
    inline def setBroadcast_owner(value: ReelsTrayFeedResponseBroadcastOwner): Self = StObject.set(x, "broadcast_owner", value.asInstanceOf[js.Any])
    
    inline def setBroadcast_status(value: String): Self = StObject.set(x, "broadcast_status", value.asInstanceOf[js.Any])
    
    inline def setCobroadcasters(value: js.Array[js.Any]): Self = StObject.set(x, "cobroadcasters", value.asInstanceOf[js.Any])
    
    inline def setCobroadcastersVarargs(value: js.Any*): Self = StObject.set(x, "cobroadcasters", js.Array(value :_*))
    
    inline def setCover_frame_url(value: String): Self = StObject.set(x, "cover_frame_url", value.asInstanceOf[js.Any])
    
    inline def setDash_abr_playback_url(value: Null): Self = StObject.set(x, "dash_abr_playback_url", value.asInstanceOf[js.Any])
    
    inline def setDash_live_predictive_playback_url(value: String): Self = StObject.set(x, "dash_live_predictive_playback_url", value.asInstanceOf[js.Any])
    
    inline def setDash_playback_url(value: String): Self = StObject.set(x, "dash_playback_url", value.asInstanceOf[js.Any])
    
    inline def setHide_from_feed_unit(value: Boolean): Self = StObject.set(x, "hide_from_feed_unit", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInternal_only(value: Boolean): Self = StObject.set(x, "internal_only", value.asInstanceOf[js.Any])
    
    inline def setIs_gaming_content(value: Boolean): Self = StObject.set(x, "is_gaming_content", value.asInstanceOf[js.Any])
    
    inline def setIs_player_live_trace_enabled(value: Double): Self = StObject.set(x, "is_player_live_trace_enabled", value.asInstanceOf[js.Any])
    
    inline def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setOrganic_tracking_token(value: String): Self = StObject.set(x, "organic_tracking_token", value.asInstanceOf[js.Any])
    
    inline def setPublished_time(value: Double): Self = StObject.set(x, "published_time", value.asInstanceOf[js.Any])
    
    inline def setRanked_position(value: Double): Self = StObject.set(x, "ranked_position", value.asInstanceOf[js.Any])
    
    inline def setRtmp_playback_url(value: String): Self = StObject.set(x, "rtmp_playback_url", value.asInstanceOf[js.Any])
    
    inline def setSeen_ranked_position(value: Double): Self = StObject.set(x, "seen_ranked_position", value.asInstanceOf[js.Any])
    
    inline def setViewer_count(value: Double): Self = StObject.set(x, "viewer_count", value.asInstanceOf[js.Any])
  }
}
