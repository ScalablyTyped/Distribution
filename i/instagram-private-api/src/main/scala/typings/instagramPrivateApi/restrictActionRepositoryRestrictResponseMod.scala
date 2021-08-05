package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restrictActionRepositoryRestrictResponseMod {
  
  trait RestrictActionRepositoryRestrictResponseFriendshipStatus extends StObject {
    
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
  object RestrictActionRepositoryRestrictResponseFriendshipStatus {
    
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
    ): RestrictActionRepositoryRestrictResponseFriendshipStatus = {
      val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], followed_by = followed_by.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], muting = muting.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestrictActionRepositoryRestrictResponseFriendshipStatus]
    }
    
    extension [Self <: RestrictActionRepositoryRestrictResponseFriendshipStatus](x: Self) {
      
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
  
  trait RestrictActionRepositoryRestrictResponseRootObject extends StObject {
    
    var status: String
    
    var users: js.Array[RestrictActionRepositoryRestrictResponseUsersItem]
  }
  object RestrictActionRepositoryRestrictResponseRootObject {
    
    inline def apply(status: String, users: js.Array[RestrictActionRepositoryRestrictResponseUsersItem]): RestrictActionRepositoryRestrictResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestrictActionRepositoryRestrictResponseRootObject]
    }
    
    extension [Self <: RestrictActionRepositoryRestrictResponseRootObject](x: Self) {
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: js.Array[RestrictActionRepositoryRestrictResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: RestrictActionRepositoryRestrictResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  trait RestrictActionRepositoryRestrictResponseUsersItem extends StObject {
    
    var friendship_status: RestrictActionRepositoryRestrictResponseFriendshipStatus
    
    var full_name: String
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var pk: Double
    
    var profile_pic_url: String
    
    var username: String
  }
  object RestrictActionRepositoryRestrictResponseUsersItem {
    
    inline def apply(
      friendship_status: RestrictActionRepositoryRestrictResponseFriendshipStatus,
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_url: String,
      username: String
    ): RestrictActionRepositoryRestrictResponseUsersItem = {
      val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestrictActionRepositoryRestrictResponseUsersItem]
    }
    
    extension [Self <: RestrictActionRepositoryRestrictResponseUsersItem](x: Self) {
      
      inline def setFriendship_status(value: RestrictActionRepositoryRestrictResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      inline def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
