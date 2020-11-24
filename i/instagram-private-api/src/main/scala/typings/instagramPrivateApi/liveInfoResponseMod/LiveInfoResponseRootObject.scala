package typings.instagramPrivateApi.liveInfoResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveInfoResponseRootObject extends js.Object {
  
  var broadcast_message: String = js.native
  
  var broadcast_owner: LiveInfoResponseBroadcastOwner = js.native
  
  var broadcast_status: String = js.native
  
  var cobroadcasters: js.Array[_] = js.native
  
  var dash_abr_playback_url: Null = js.native
  
  var dash_live_predictive_playback_url: String = js.native
  
  var dash_playback_url: String = js.native
  
  var hide_from_feed_unit: Boolean = js.native
  
  var id: String = js.native
  
  var internal_only: Boolean = js.native
  
  var is_gaming_content: Boolean = js.native
  
  var is_player_live_trace_enabled: Double = js.native
  
  var media_id: String = js.native
  
  var organic_tracking_token: String = js.native
  
  var published_time: Double = js.native
  
  var rtmp_playback_url: String = js.native
  
  var status: String = js.native
  
  var viewer_count: Double = js.native
}
object LiveInfoResponseRootObject {
  
  @scala.inline
  def apply(
    broadcast_message: String,
    broadcast_owner: LiveInfoResponseBroadcastOwner,
    broadcast_status: String,
    cobroadcasters: js.Array[_],
    dash_abr_playback_url: Null,
    dash_live_predictive_playback_url: String,
    dash_playback_url: String,
    hide_from_feed_unit: Boolean,
    id: String,
    internal_only: Boolean,
    is_gaming_content: Boolean,
    is_player_live_trace_enabled: Double,
    media_id: String,
    organic_tracking_token: String,
    published_time: Double,
    rtmp_playback_url: String,
    status: String,
    viewer_count: Double
  ): LiveInfoResponseRootObject = {
    val __obj = js.Dynamic.literal(broadcast_message = broadcast_message.asInstanceOf[js.Any], broadcast_owner = broadcast_owner.asInstanceOf[js.Any], broadcast_status = broadcast_status.asInstanceOf[js.Any], cobroadcasters = cobroadcasters.asInstanceOf[js.Any], dash_abr_playback_url = dash_abr_playback_url.asInstanceOf[js.Any], dash_live_predictive_playback_url = dash_live_predictive_playback_url.asInstanceOf[js.Any], dash_playback_url = dash_playback_url.asInstanceOf[js.Any], hide_from_feed_unit = hide_from_feed_unit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], internal_only = internal_only.asInstanceOf[js.Any], is_gaming_content = is_gaming_content.asInstanceOf[js.Any], is_player_live_trace_enabled = is_player_live_trace_enabled.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], published_time = published_time.asInstanceOf[js.Any], rtmp_playback_url = rtmp_playback_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], viewer_count = viewer_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveInfoResponseRootObject]
  }
  
  @scala.inline
  implicit class LiveInfoResponseRootObjectOps[Self <: LiveInfoResponseRootObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBroadcast_message(value: String): Self = this.set("broadcast_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadcast_owner(value: LiveInfoResponseBroadcastOwner): Self = this.set("broadcast_owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadcast_status(value: String): Self = this.set("broadcast_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCobroadcastersVarargs(value: js.Any*): Self = this.set("cobroadcasters", js.Array(value :_*))
    
    @scala.inline
    def setCobroadcasters(value: js.Array[_]): Self = this.set("cobroadcasters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDash_abr_playback_url(value: Null): Self = this.set("dash_abr_playback_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDash_live_predictive_playback_url(value: String): Self = this.set("dash_live_predictive_playback_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDash_playback_url(value: String): Self = this.set("dash_playback_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide_from_feed_unit(value: Boolean): Self = this.set("hide_from_feed_unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternal_only(value: Boolean): Self = this.set("internal_only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_gaming_content(value: Boolean): Self = this.set("is_gaming_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_player_live_trace_enabled(value: Double): Self = this.set("is_player_live_trace_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_id(value: String): Self = this.set("media_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganic_tracking_token(value: String): Self = this.set("organic_tracking_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublished_time(value: Double): Self = this.set("published_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtmp_playback_url(value: String): Self = this.set("rtmp_playback_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewer_count(value: Double): Self = this.set("viewer_count", value.asInstanceOf[js.Any])
  }
}
