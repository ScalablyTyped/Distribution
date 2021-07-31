package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveFinalViewersResponseMod {
  
  trait LiveFinalViewersResponseRootObject extends StObject {
    
    var status: String
    
    var total_unique_viewer_count: Double
    
    var users: js.Array[LiveFinalViewersResponseUsersItem]
  }
  object LiveFinalViewersResponseRootObject {
    
    @scala.inline
    def apply(
      status: String,
      total_unique_viewer_count: Double,
      users: js.Array[LiveFinalViewersResponseUsersItem]
    ): LiveFinalViewersResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], total_unique_viewer_count = total_unique_viewer_count.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveFinalViewersResponseRootObject]
    }
    
    @scala.inline
    implicit class LiveFinalViewersResponseRootObjectMutableBuilder[Self <: LiveFinalViewersResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_unique_viewer_count(value: Double): Self = StObject.set(x, "total_unique_viewer_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[LiveFinalViewersResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: LiveFinalViewersResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  trait LiveFinalViewersResponseUsersItem extends StObject {
    
    var full_name: String
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var pk: Double
    
    var profile_pic_id: String
    
    var profile_pic_url: String
    
    var username: String
  }
  object LiveFinalViewersResponseUsersItem {
    
    @scala.inline
    def apply(
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): LiveFinalViewersResponseUsersItem = {
      val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiveFinalViewersResponseUsersItem]
    }
    
    @scala.inline
    implicit class LiveFinalViewersResponseUsersItemMutableBuilder[Self <: LiveFinalViewersResponseUsersItem] (val x: Self) extends AnyVal {
      
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
}
