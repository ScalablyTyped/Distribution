package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReelsMediaFeedResponseUser extends StObject {
  
  var friendship_status: js.UndefOr[ReelsMediaFeedResponseFriendshipStatus] = js.undefined
  
  var full_name: js.UndefOr[String] = js.undefined
  
  var is_private: js.UndefOr[Boolean] = js.undefined
  
  var is_verified: js.UndefOr[Boolean] = js.undefined
  
  var pk: Double
  
  var profile_pic_id: js.UndefOr[String] = js.undefined
  
  var profile_pic_url: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object ReelsMediaFeedResponseUser {
  
  inline def apply(pk: Double): ReelsMediaFeedResponseUser = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseUser]
  }
  
  extension [Self <: ReelsMediaFeedResponseUser](x: Self) {
    
    inline def setFriendship_status(value: ReelsMediaFeedResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
    
    inline def setFriendship_statusUndefined: Self = StObject.set(x, "friendship_status", js.undefined)
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setFull_nameUndefined: Self = StObject.set(x, "full_name", js.undefined)
    
    inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
    
    inline def setIs_privateUndefined: Self = StObject.set(x, "is_private", js.undefined)
    
    inline def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
    
    inline def setIs_verifiedUndefined: Self = StObject.set(x, "is_verified", js.undefined)
    
    inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    inline def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
    
    inline def setProfile_pic_idUndefined: Self = StObject.set(x, "profile_pic_id", js.undefined)
    
    inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
    
    inline def setProfile_pic_urlUndefined: Self = StObject.set(x, "profile_pic_url", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
