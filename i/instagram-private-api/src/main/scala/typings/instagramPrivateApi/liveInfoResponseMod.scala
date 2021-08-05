package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveInfoResponseMod {
  
  trait LiveInfoResponseBroadcastOwner extends StObject {
    
    var friendship_status: LiveInfoResponseFriendshipStatus
    
    var full_name: String
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var pk: Double
    
    var profile_pic_id: String
    
    var profile_pic_url: String
    
    var username: String
  }
  object LiveInfoResponseBroadcastOwner {
    
    inline def apply(
      friendship_status: LiveInfoResponseFriendshipStatus,
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): LiveInfoResponseBroadcastOwner = {
      val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveInfoResponseBroadcastOwner]
    }
    
    extension [Self <: LiveInfoResponseBroadcastOwner](x: Self) {
      
      inline def setFriendship_status(value: LiveInfoResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      inline def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait LiveInfoResponseFriendshipStatus extends StObject {
    
    var blocking: Boolean
    
    var followed_by: Boolean
    
    var following: Boolean
    
    var incoming_request: Boolean
    
    var is_bestie: Boolean
    
    var is_private: Boolean
    
    var is_restricted: Boolean
    
    var muting: Boolean
    
    var outgoing_request: Boolean
  }
  object LiveInfoResponseFriendshipStatus {
    
    inline def apply(
      blocking: Boolean,
      followed_by: Boolean,
      following: Boolean,
      incoming_request: Boolean,
      is_bestie: Boolean,
      is_private: Boolean,
      is_restricted: Boolean,
      muting: Boolean,
      outgoing_request: Boolean
    ): LiveInfoResponseFriendshipStatus = {
      val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], followed_by = followed_by.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], muting = muting.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveInfoResponseFriendshipStatus]
    }
    
    extension [Self <: LiveInfoResponseFriendshipStatus](x: Self) {
      
      inline def setBlocking(value: Boolean): Self = StObject.set(x, "blocking", value.asInstanceOf[js.Any])
      
      inline def setFollowed_by(value: Boolean): Self = StObject.set(x, "followed_by", value.asInstanceOf[js.Any])
      
      inline def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      inline def setIncoming_request(value: Boolean): Self = StObject.set(x, "incoming_request", value.asInstanceOf[js.Any])
      
      inline def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
      
      inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      inline def setIs_restricted(value: Boolean): Self = StObject.set(x, "is_restricted", value.asInstanceOf[js.Any])
      
      inline def setMuting(value: Boolean): Self = StObject.set(x, "muting", value.asInstanceOf[js.Any])
      
      inline def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
    }
  }
  
  trait LiveInfoResponseRootObject extends StObject {
    
    var broadcast_message: String
    
    var broadcast_owner: LiveInfoResponseBroadcastOwner
    
    var broadcast_status: String
    
    var cobroadcasters: js.Array[js.Any]
    
    var dash_abr_playback_url: Null
    
    var dash_live_predictive_playback_url: String
    
    var dash_playback_url: String
    
    var hide_from_feed_unit: Boolean
    
    var id: String
    
    var internal_only: Boolean
    
    var is_gaming_content: Boolean
    
    var is_player_live_trace_enabled: Double
    
    var media_id: String
    
    var organic_tracking_token: String
    
    var published_time: Double
    
    var rtmp_playback_url: String
    
    var status: String
    
    var viewer_count: Double
  }
  object LiveInfoResponseRootObject {
    
    inline def apply(
      broadcast_message: String,
      broadcast_owner: LiveInfoResponseBroadcastOwner,
      broadcast_status: String,
      cobroadcasters: js.Array[js.Any],
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
    
    extension [Self <: LiveInfoResponseRootObject](x: Self) {
      
      inline def setBroadcast_message(value: String): Self = StObject.set(x, "broadcast_message", value.asInstanceOf[js.Any])
      
      inline def setBroadcast_owner(value: LiveInfoResponseBroadcastOwner): Self = StObject.set(x, "broadcast_owner", value.asInstanceOf[js.Any])
      
      inline def setBroadcast_status(value: String): Self = StObject.set(x, "broadcast_status", value.asInstanceOf[js.Any])
      
      inline def setCobroadcasters(value: js.Array[js.Any]): Self = StObject.set(x, "cobroadcasters", value.asInstanceOf[js.Any])
      
      inline def setCobroadcastersVarargs(value: js.Any*): Self = StObject.set(x, "cobroadcasters", js.Array(value :_*))
      
      inline def setDash_abr_playback_url(value: Null): Self = StObject.set(x, "dash_abr_playback_url", value.asInstanceOf[js.Any])
      
      inline def setDash_live_predictive_playback_url(value: String): Self = StObject.set(x, "dash_live_predictive_playback_url", value.asInstanceOf[js.Any])
      
      inline def setDash_playback_url(value: String): Self = StObject.set(x, "dash_playback_url", value.asInstanceOf[js.Any])
      
      inline def setHide_from_feed_unit(value: Boolean): Self = StObject.set(x, "hide_from_feed_unit", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInternal_only(value: Boolean): Self = StObject.set(x, "internal_only", value.asInstanceOf[js.Any])
      
      inline def setIs_gaming_content(value: Boolean): Self = StObject.set(x, "is_gaming_content", value.asInstanceOf[js.Any])
      
      inline def setIs_player_live_trace_enabled(value: Double): Self = StObject.set(x, "is_player_live_trace_enabled", value.asInstanceOf[js.Any])
      
      inline def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
      
      inline def setOrganic_tracking_token(value: String): Self = StObject.set(x, "organic_tracking_token", value.asInstanceOf[js.Any])
      
      inline def setPublished_time(value: Double): Self = StObject.set(x, "published_time", value.asInstanceOf[js.Any])
      
      inline def setRtmp_playback_url(value: String): Self = StObject.set(x, "rtmp_playback_url", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setViewer_count(value: Double): Self = StObject.set(x, "viewer_count", value.asInstanceOf[js.Any])
    }
  }
}
