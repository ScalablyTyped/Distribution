package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveAddToPostResponseMod {
  
  trait LiveAddToPostBroadcast extends StObject {
    
    var broadcast_message: String
    
    var broadcast_owner: LiveAddToPostBroadcastOwner
    
    var broadcast_status: String
    
    var hide_from_feed_unit: Boolean
    
    var id: String
    
    var media_id: String
    
    var organic_tracking_token: String
    
    var published_time: Double
  }
  object LiveAddToPostBroadcast {
    
    inline def apply(
      broadcast_message: String,
      broadcast_owner: LiveAddToPostBroadcastOwner,
      broadcast_status: String,
      hide_from_feed_unit: Boolean,
      id: String,
      media_id: String,
      organic_tracking_token: String,
      published_time: Double
    ): LiveAddToPostBroadcast = {
      val __obj = js.Dynamic.literal(broadcast_message = broadcast_message.asInstanceOf[js.Any], broadcast_owner = broadcast_owner.asInstanceOf[js.Any], broadcast_status = broadcast_status.asInstanceOf[js.Any], hide_from_feed_unit = hide_from_feed_unit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media_id = media_id.asInstanceOf[js.Any], organic_tracking_token = organic_tracking_token.asInstanceOf[js.Any], published_time = published_time.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveAddToPostBroadcast]
    }
    
    extension [Self <: LiveAddToPostBroadcast](x: Self) {
      
      inline def setBroadcast_message(value: String): Self = StObject.set(x, "broadcast_message", value.asInstanceOf[js.Any])
      
      inline def setBroadcast_owner(value: LiveAddToPostBroadcastOwner): Self = StObject.set(x, "broadcast_owner", value.asInstanceOf[js.Any])
      
      inline def setBroadcast_status(value: String): Self = StObject.set(x, "broadcast_status", value.asInstanceOf[js.Any])
      
      inline def setHide_from_feed_unit(value: Boolean): Self = StObject.set(x, "hide_from_feed_unit", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMedia_id(value: String): Self = StObject.set(x, "media_id", value.asInstanceOf[js.Any])
      
      inline def setOrganic_tracking_token(value: String): Self = StObject.set(x, "organic_tracking_token", value.asInstanceOf[js.Any])
      
      inline def setPublished_time(value: Double): Self = StObject.set(x, "published_time", value.asInstanceOf[js.Any])
    }
  }
  
  trait LiveAddToPostBroadcastOwner extends StObject {
    
    var friendship_status: LiveAddToPostFriendshipstatus
    
    var full_name: String
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var pk: Double
    
    var profile_pic_url: String
    
    var username: String
  }
  object LiveAddToPostBroadcastOwner {
    
    inline def apply(
      friendship_status: LiveAddToPostFriendshipstatus,
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_url: String,
      username: String
    ): LiveAddToPostBroadcastOwner = {
      val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveAddToPostBroadcastOwner]
    }
    
    extension [Self <: LiveAddToPostBroadcastOwner](x: Self) {
      
      inline def setFriendship_status(value: LiveAddToPostFriendshipstatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      inline def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait LiveAddToPostFriendshipstatus extends StObject {
    
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
  object LiveAddToPostFriendshipstatus {
    
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
    ): LiveAddToPostFriendshipstatus = {
      val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], followed_by = followed_by.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], muting = muting.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveAddToPostFriendshipstatus]
    }
    
    extension [Self <: LiveAddToPostFriendshipstatus](x: Self) {
      
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
  
  trait LiveAddToPostResponse extends StObject {
    
    var broadcasts: js.Array[LiveAddToPostBroadcast]
    
    var can_reply: Boolean
    
    var can_reshare: Boolean
    
    var last_seen_broadcast_ts: Double
    
    var pk: String
    
    var status: String
    
    var user: LiveAddToPostUser
  }
  object LiveAddToPostResponse {
    
    inline def apply(
      broadcasts: js.Array[LiveAddToPostBroadcast],
      can_reply: Boolean,
      can_reshare: Boolean,
      last_seen_broadcast_ts: Double,
      pk: String,
      status: String,
      user: LiveAddToPostUser
    ): LiveAddToPostResponse = {
      val __obj = js.Dynamic.literal(broadcasts = broadcasts.asInstanceOf[js.Any], can_reply = can_reply.asInstanceOf[js.Any], can_reshare = can_reshare.asInstanceOf[js.Any], last_seen_broadcast_ts = last_seen_broadcast_ts.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveAddToPostResponse]
    }
    
    extension [Self <: LiveAddToPostResponse](x: Self) {
      
      inline def setBroadcasts(value: js.Array[LiveAddToPostBroadcast]): Self = StObject.set(x, "broadcasts", value.asInstanceOf[js.Any])
      
      inline def setBroadcastsVarargs(value: LiveAddToPostBroadcast*): Self = StObject.set(x, "broadcasts", js.Array(value :_*))
      
      inline def setCan_reply(value: Boolean): Self = StObject.set(x, "can_reply", value.asInstanceOf[js.Any])
      
      inline def setCan_reshare(value: Boolean): Self = StObject.set(x, "can_reshare", value.asInstanceOf[js.Any])
      
      inline def setLast_seen_broadcast_ts(value: Double): Self = StObject.set(x, "last_seen_broadcast_ts", value.asInstanceOf[js.Any])
      
      inline def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUser(value: LiveAddToPostUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait LiveAddToPostUser extends StObject {
    
    var full_name: String
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var pk: Double
    
    var profile_pic_url: String
    
    var username: String
  }
  object LiveAddToPostUser {
    
    inline def apply(
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_url: String,
      username: String
    ): LiveAddToPostUser = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveAddToPostUser]
    }
    
    extension [Self <: LiveAddToPostUser](x: Self) {
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      inline def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
