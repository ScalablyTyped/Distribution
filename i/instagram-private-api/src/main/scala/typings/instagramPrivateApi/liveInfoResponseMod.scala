package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveInfoResponseMod {
  
  @js.native
  trait LiveInfoResponseBroadcastOwner extends StObject {
    
    var friendship_status: LiveInfoResponseFriendshipStatus = js.native
    
    var full_name: String = js.native
    
    var is_private: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var pk: Double = js.native
    
    var profile_pic_id: String = js.native
    
    var profile_pic_url: String = js.native
    
    var username: String = js.native
  }
  object LiveInfoResponseBroadcastOwner {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class LiveInfoResponseBroadcastOwnerMutableBuilder[Self <: LiveInfoResponseBroadcastOwner] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFriendship_status(value: LiveInfoResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LiveInfoResponseFriendshipStatus extends StObject {
    
    var blocking: Boolean = js.native
    
    var followed_by: Boolean = js.native
    
    var following: Boolean = js.native
    
    var incoming_request: Boolean = js.native
    
    var is_bestie: Boolean = js.native
    
    var is_private: Boolean = js.native
    
    var is_restricted: Boolean = js.native
    
    var muting: Boolean = js.native
    
    var outgoing_request: Boolean = js.native
  }
  object LiveInfoResponseFriendshipStatus {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class LiveInfoResponseFriendshipStatusMutableBuilder[Self <: LiveInfoResponseFriendshipStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocking(value: Boolean): Self = StObject.set(x, "blocking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowed_by(value: Boolean): Self = StObject.set(x, "followed_by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncoming_request(value: Boolean): Self = StObject.set(x, "incoming_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_bestie(value: Boolean): Self = StObject.set(x, "is_bestie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_restricted(value: Boolean): Self = StObject.set(x, "is_restricted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMuting(value: Boolean): Self = StObject.set(x, "muting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutgoing_request(value: Boolean): Self = StObject.set(x, "outgoing_request", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LiveInfoResponseRootObject extends StObject {
    
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
    implicit class LiveInfoResponseRootObjectMutableBuilder[Self <: LiveInfoResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBroadcast_message(value: String): Self = StObject.set(x, "broadcast_message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBroadcast_owner(value: LiveInfoResponseBroadcastOwner): Self = StObject.set(x, "broadcast_owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBroadcast_status(value: String): Self = StObject.set(x, "broadcast_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCobroadcasters(value: js.Array[_]): Self = StObject.set(x, "cobroadcasters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCobroadcastersVarargs(value: js.Any*): Self = StObject.set(x, "cobroadcasters", js.Array(value :_*))
      
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
      def setOrganic_tracking_token(value: String): Self = StObject.set(x, "organic_tracking_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublished_time(value: Double): Self = StObject.set(x, "published_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtmp_playback_url(value: String): Self = StObject.set(x, "rtmp_playback_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewer_count(value: Double): Self = StObject.set(x, "viewer_count", value.asInstanceOf[js.Any])
    }
  }
}
