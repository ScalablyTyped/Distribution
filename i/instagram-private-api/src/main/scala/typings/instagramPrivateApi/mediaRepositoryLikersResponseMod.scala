package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaRepositoryLikersResponseMod {
  
  trait MediaRepositoryLikersResponseRootObject extends StObject {
    
    var status: String
    
    var user_count: Double
    
    var users: js.Array[MediaRepositoryLikersResponseUsersItem]
  }
  object MediaRepositoryLikersResponseRootObject {
    
    @scala.inline
    def apply(status: String, user_count: Double, users: js.Array[MediaRepositoryLikersResponseUsersItem]): MediaRepositoryLikersResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user_count = user_count.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryLikersResponseRootObject]
    }
    
    @scala.inline
    implicit class MediaRepositoryLikersResponseRootObjectMutableBuilder[Self <: MediaRepositoryLikersResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_count(value: Double): Self = StObject.set(x, "user_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[MediaRepositoryLikersResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: MediaRepositoryLikersResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  trait MediaRepositoryLikersResponseUsersItem extends StObject {
    
    var full_name: String
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var latest_reel_media: js.UndefOr[Double] = js.undefined
    
    var pk: Double
    
    var profile_pic_id: js.UndefOr[String] = js.undefined
    
    var profile_pic_url: String
    
    var username: String
  }
  object MediaRepositoryLikersResponseUsersItem {
    
    @scala.inline
    def apply(
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_url: String,
      username: String
    ): MediaRepositoryLikersResponseUsersItem = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaRepositoryLikersResponseUsersItem]
    }
    
    @scala.inline
    implicit class MediaRepositoryLikersResponseUsersItemMutableBuilder[Self <: MediaRepositoryLikersResponseUsersItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatest_reel_media(value: Double): Self = StObject.set(x, "latest_reel_media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatest_reel_mediaUndefined: Self = StObject.set(x, "latest_reel_media", js.undefined)
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_idUndefined: Self = StObject.set(x, "profile_pic_id", js.undefined)
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
