package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressBookRepositoryLinkResponseMod {
  
  trait AddressBookRepositoryLinkResponseRootObject extends StObject {
    
    var status: String
    
    var users: js.Array[AddressBookRepositoryLinkResponseUsersItem]
    
    var warning: String
  }
  object AddressBookRepositoryLinkResponseRootObject {
    
    @scala.inline
    def apply(status: String, users: js.Array[AddressBookRepositoryLinkResponseUsersItem], warning: String): AddressBookRepositoryLinkResponseRootObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressBookRepositoryLinkResponseRootObject]
    }
    
    @scala.inline
    implicit class AddressBookRepositoryLinkResponseRootObjectMutableBuilder[Self <: AddressBookRepositoryLinkResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[AddressBookRepositoryLinkResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: AddressBookRepositoryLinkResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
      
      @scala.inline
      def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  trait AddressBookRepositoryLinkResponseUsersItem extends StObject {
    
    var addressbook_name: String
    
    var full_name: String
    
    var has_anonymous_profile_picture: Boolean
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var pk: Double
    
    var profile_pic_id: String
    
    var profile_pic_url: String
    
    var username: String
  }
  object AddressBookRepositoryLinkResponseUsersItem {
    
    @scala.inline
    def apply(
      addressbook_name: String,
      full_name: String,
      has_anonymous_profile_picture: Boolean,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_pic_id: String,
      profile_pic_url: String,
      username: String
    ): AddressBookRepositoryLinkResponseUsersItem = {
      val __obj = js.Dynamic.literal(addressbook_name = addressbook_name.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressBookRepositoryLinkResponseUsersItem]
    }
    
    @scala.inline
    implicit class AddressBookRepositoryLinkResponseUsersItemMutableBuilder[Self <: AddressBookRepositoryLinkResponseUsersItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddressbook_name(value: String): Self = StObject.set(x, "addressbook_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
      
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
