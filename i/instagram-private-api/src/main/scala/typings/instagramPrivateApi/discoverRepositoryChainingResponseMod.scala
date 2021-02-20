package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object discoverRepositoryChainingResponseMod {
  
  @js.native
  trait DiscoverRepositoryChainingResponseChainingInfo extends StObject {
    
    var sources: String = js.native
  }
  object DiscoverRepositoryChainingResponseChainingInfo {
    
    @scala.inline
    def apply(sources: String): DiscoverRepositoryChainingResponseChainingInfo = {
      val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiscoverRepositoryChainingResponseChainingInfo]
    }
    
    @scala.inline
    implicit class DiscoverRepositoryChainingResponseChainingInfoMutableBuilder[Self <: DiscoverRepositoryChainingResponseChainingInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSources(value: String): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DiscoverRepositoryChainingResponseRootObject extends StObject {
    
    var available_recommend_count: Double = js.native
    
    var is_backup: Boolean = js.native
    
    var is_recommend_account: Boolean = js.native
    
    var status: String = js.native
    
    var users: js.Array[DiscoverRepositoryChainingResponseUsersItem] = js.native
  }
  object DiscoverRepositoryChainingResponseRootObject {
    
    @scala.inline
    def apply(
      available_recommend_count: Double,
      is_backup: Boolean,
      is_recommend_account: Boolean,
      status: String,
      users: js.Array[DiscoverRepositoryChainingResponseUsersItem]
    ): DiscoverRepositoryChainingResponseRootObject = {
      val __obj = js.Dynamic.literal(available_recommend_count = available_recommend_count.asInstanceOf[js.Any], is_backup = is_backup.asInstanceOf[js.Any], is_recommend_account = is_recommend_account.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiscoverRepositoryChainingResponseRootObject]
    }
    
    @scala.inline
    implicit class DiscoverRepositoryChainingResponseRootObjectMutableBuilder[Self <: DiscoverRepositoryChainingResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailable_recommend_count(value: Double): Self = StObject.set(x, "available_recommend_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_backup(value: Boolean): Self = StObject.set(x, "is_backup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_recommend_account(value: Boolean): Self = StObject.set(x, "is_recommend_account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: js.Array[DiscoverRepositoryChainingResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: DiscoverRepositoryChainingResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DiscoverRepositoryChainingResponseUsersItem extends StObject {
    
    var chaining_info: DiscoverRepositoryChainingResponseChainingInfo = js.native
    
    var full_name: String = js.native
    
    var is_private: Boolean = js.native
    
    var is_verified: Boolean = js.native
    
    var pk: Double = js.native
    
    var profile_chaining_secondary_label: String = js.native
    
    var profile_pic_id: js.UndefOr[String] = js.native
    
    var profile_pic_url: String = js.native
    
    var social_context: String = js.native
    
    var username: String = js.native
  }
  object DiscoverRepositoryChainingResponseUsersItem {
    
    @scala.inline
    def apply(
      chaining_info: DiscoverRepositoryChainingResponseChainingInfo,
      full_name: String,
      is_private: Boolean,
      is_verified: Boolean,
      pk: Double,
      profile_chaining_secondary_label: String,
      profile_pic_url: String,
      social_context: String,
      username: String
    ): DiscoverRepositoryChainingResponseUsersItem = {
      val __obj = js.Dynamic.literal(chaining_info = chaining_info.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_chaining_secondary_label = profile_chaining_secondary_label.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], social_context = social_context.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiscoverRepositoryChainingResponseUsersItem]
    }
    
    @scala.inline
    implicit class DiscoverRepositoryChainingResponseUsersItemMutableBuilder[Self <: DiscoverRepositoryChainingResponseUsersItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChaining_info(value: DiscoverRepositoryChainingResponseChainingInfo): Self = StObject.set(x, "chaining_info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_chaining_secondary_label(value: String): Self = StObject.set(x, "profile_chaining_secondary_label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_idUndefined: Self = StObject.set(x, "profile_pic_id", js.undefined)
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocial_context(value: String): Self = StObject.set(x, "social_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
