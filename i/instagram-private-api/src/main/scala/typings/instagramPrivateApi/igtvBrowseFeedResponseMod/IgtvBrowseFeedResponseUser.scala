package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgtvBrowseFeedResponseUser extends StObject {
  
  var friendship_status: IgtvBrowseFeedResponseFriendshipStatus
  
  var full_name: String
  
  var has_anonymous_profile_picture: Boolean
  
  var is_favorite: Boolean
  
  var is_private: Boolean
  
  var is_unpublished: Boolean
  
  var is_verified: Boolean
  
  var pk: Double
  
  var profile_pic_id: String
  
  var profile_pic_url: String
  
  var username: String
}
object IgtvBrowseFeedResponseUser {
  
  @scala.inline
  def apply(
    friendship_status: IgtvBrowseFeedResponseFriendshipStatus,
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    is_favorite: Boolean,
    is_private: Boolean,
    is_unpublished: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    username: String
  ): IgtvBrowseFeedResponseUser = {
    val __obj = js.Dynamic.literal(friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], is_favorite = is_favorite.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_unpublished = is_unpublished.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseUser]
  }
  
  @scala.inline
  implicit class IgtvBrowseFeedResponseUserMutableBuilder[Self <: IgtvBrowseFeedResponseUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriendship_status(value: IgtvBrowseFeedResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_favorite(value: Boolean): Self = StObject.set(x, "is_favorite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_unpublished(value: Boolean): Self = StObject.set(x, "is_unpublished", value.asInstanceOf[js.Any])
    
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
