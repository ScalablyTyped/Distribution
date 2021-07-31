package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveViewerListResponseMod {
  
  trait LiveViewerListResponseRootObject extends StObject {
    
    var status: String
    
    var users: js.Array[LiveViewerListResponseUsersItem]
  }
  object LiveViewerListResponseRootObject {
    
    @scala.inline
    def apply(status: String, users: js.Array[LiveViewerListResponseUsersItem]): LiveViewerListResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveViewerListResponseRootObject]
    }
    
    @scala.inline
    implicit class LiveViewerListResponseRootObjectMutableBuilder[Self <: LiveViewerListResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[LiveViewerListResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: LiveViewerListResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  trait LiveViewerListResponseUsersItem extends StObject {
    
    var full_name: String
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var live_with_eligibility: String
    
    var pk: Double
    
    var profile_pic_id: String
    
    var profile_pic_url: String
    
    var username: String
  }
  object LiveViewerListResponseUsersItem {
    
    @scala.inline
    def apply(
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      live_with_eligibility: String,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): LiveViewerListResponseUsersItem = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], live_with_eligibility = live_with_eligibility.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveViewerListResponseUsersItem]
    }
    
    @scala.inline
    implicit class LiveViewerListResponseUsersItemMutableBuilder[Self <: LiveViewerListResponseUsersItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLive_with_eligibility(value: String): Self = StObject.set(x, "live_with_eligibility", value.asInstanceOf[js.Any])
      
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
}
