package typings.instagramPrivateApi.reelsMediaFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReelsMediaFeedResponseUser extends StObject {
  
  var friendship_status: js.UndefOr[ReelsMediaFeedResponseFriendshipStatus] = js.native
  
  var full_name: js.UndefOr[String] = js.native
  
  var is_private: js.UndefOr[Boolean] = js.native
  
  var is_verified: js.UndefOr[Boolean] = js.native
  
  var pk: Double = js.native
  
  var profile_pic_id: js.UndefOr[String] = js.native
  
  var profile_pic_url: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object ReelsMediaFeedResponseUser {
  
  @scala.inline
  def apply(pk: Double): ReelsMediaFeedResponseUser = {
    val __obj = js.Dynamic.literal(pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReelsMediaFeedResponseUser]
  }
  
  @scala.inline
  implicit class ReelsMediaFeedResponseUserMutableBuilder[Self <: ReelsMediaFeedResponseUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriendship_status(value: ReelsMediaFeedResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendship_statusUndefined: Self = StObject.set(x, "friendship_status", js.undefined)
    
    @scala.inline
    def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_nameUndefined: Self = StObject.set(x, "full_name", js.undefined)
    
    @scala.inline
    def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_privateUndefined: Self = StObject.set(x, "is_private", js.undefined)
    
    @scala.inline
    def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_verifiedUndefined: Self = StObject.set(x, "is_verified", js.undefined)
    
    @scala.inline
    def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_idUndefined: Self = StObject.set(x, "profile_pic_id", js.undefined)
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_urlUndefined: Self = StObject.set(x, "profile_pic_url", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
