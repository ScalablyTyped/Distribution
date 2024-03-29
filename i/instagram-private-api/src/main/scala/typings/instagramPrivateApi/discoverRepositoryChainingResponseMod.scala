package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object discoverRepositoryChainingResponseMod {
  
  trait DiscoverRepositoryChainingResponseChainingInfo extends StObject {
    
    var sources: String
  }
  object DiscoverRepositoryChainingResponseChainingInfo {
    
    inline def apply(sources: String): DiscoverRepositoryChainingResponseChainingInfo = {
      val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiscoverRepositoryChainingResponseChainingInfo]
    }
    
    extension [Self <: DiscoverRepositoryChainingResponseChainingInfo](x: Self) {
      
      inline def setSources(value: String): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    }
  }
  
  trait DiscoverRepositoryChainingResponseRootObject extends StObject {
    
    var available_recommend_count: Double
    
    var is_backup: Boolean
    
    var is_recommend_account: Boolean
    
    var status: String
    
    var users: js.Array[DiscoverRepositoryChainingResponseUsersItem]
  }
  object DiscoverRepositoryChainingResponseRootObject {
    
    inline def apply(
      available_recommend_count: Double,
      is_backup: Boolean,
      is_recommend_account: Boolean,
      status: String,
      users: js.Array[DiscoverRepositoryChainingResponseUsersItem]
    ): DiscoverRepositoryChainingResponseRootObject = {
      val __obj = js.Dynamic.literal(available_recommend_count = available_recommend_count.asInstanceOf[js.Any], is_backup = is_backup.asInstanceOf[js.Any], is_recommend_account = is_recommend_account.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiscoverRepositoryChainingResponseRootObject]
    }
    
    extension [Self <: DiscoverRepositoryChainingResponseRootObject](x: Self) {
      
      inline def setAvailable_recommend_count(value: Double): Self = StObject.set(x, "available_recommend_count", value.asInstanceOf[js.Any])
      
      inline def setIs_backup(value: Boolean): Self = StObject.set(x, "is_backup", value.asInstanceOf[js.Any])
      
      inline def setIs_recommend_account(value: Boolean): Self = StObject.set(x, "is_recommend_account", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: js.Array[DiscoverRepositoryChainingResponseUsersItem]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersVarargs(value: DiscoverRepositoryChainingResponseUsersItem*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
  
  trait DiscoverRepositoryChainingResponseUsersItem extends StObject {
    
    var chaining_info: DiscoverRepositoryChainingResponseChainingInfo
    
    var full_name: String
    
    var is_private: Boolean
    
    var is_verified: Boolean
    
    var pk: Double
    
    var profile_chaining_secondary_label: String
    
    var profile_pic_id: js.UndefOr[String] = js.undefined
    
    var profile_pic_url: String
    
    var social_context: String
    
    var username: String
  }
  object DiscoverRepositoryChainingResponseUsersItem {
    
    inline def apply(
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
    
    extension [Self <: DiscoverRepositoryChainingResponseUsersItem](x: Self) {
      
      inline def setChaining_info(value: DiscoverRepositoryChainingResponseChainingInfo): Self = StObject.set(x, "chaining_info", value.asInstanceOf[js.Any])
      
      inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
      
      inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
      
      inline def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
      
      inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
      
      inline def setProfile_chaining_secondary_label(value: String): Self = StObject.set(x, "profile_chaining_secondary_label", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
      
      inline def setProfile_pic_idUndefined: Self = StObject.set(x, "profile_pic_id", js.undefined)
      
      inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      inline def setSocial_context(value: String): Self = StObject.set(x, "social_context", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
