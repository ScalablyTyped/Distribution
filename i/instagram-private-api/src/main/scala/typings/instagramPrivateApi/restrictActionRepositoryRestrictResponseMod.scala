package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restrictActionRepositoryRestrictResponseMod {
  
  @js.native
  trait RestrictActionRepositoryRestrictResponseFriendshipStatus extends StObject {
    
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
  object RestrictActionRepositoryRestrictResponseFriendshipStatus {
    
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
    ): RestrictActionRepositoryRestrictResponseFriendshipStatus = {
      val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], followed_by = followed_by.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], incoming_request = incoming_request.asInstanceOf[js.Any], is_bestie = is_bestie.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], muting = muting.asInstanceOf[js.Any], outgoing_request = outgoing_request.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestrictActionRepositoryRestrictResponseFriendshipStatus]
    }
    
    @scala.inline
    implicit class RestrictActionRepositoryRestrictResponseFriendshipStatusMutableBuilder[Self <: RestrictActionRepositoryRestrictResponseFriendshipStatus] (val x: Self) extends AnyVal {
      
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
  trait RestrictActionRepositoryRestrictResponseRootObject extends StObject {
    
    var status: String = js.native
    
    var users: js.Array[RestrictActionRepositoryRestrictResponseUsersItem] = js.native
  }
  object RestrictActionRepositoryRestrictResponseRootObject {
    
    @scala.inline
    def apply(status: String, users: js.Array[RestrictActionRepositoryRestrictResponseUsersItem]): RestrictActionRepositoryRestrictResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestrictActionRepositoryRestrictResponseRootObject]
    }
    
    @scala.inline
    implicit class RestrictActionRepositoryRestrictResponseRootObjectMutableBuilder[Self <: RestrictActionRepositoryRestrictResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[RestrictActionRepositoryRestrictResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: RestrictActionRepositoryRestrictResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RestrictActionRepositoryRestrictResponseUsersItem extends StObject {
    
    var friendship_status: RestrictActionRepositoryRestrictResponseFriendshipStatus = js.native
    
    var full_name: String = js.native
    
    var is_private: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var pk: Double = js.native
    
    var profile_pic_url: String = js.native
    
    var username: String = js.native
  }
  object RestrictActionRepositoryRestrictResponseUsersItem {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class RestrictActionRepositoryRestrictResponseUsersItemMutableBuilder[Self <: RestrictActionRepositoryRestrictResponseUsersItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFriendship_status(value: RestrictActionRepositoryRestrictResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
