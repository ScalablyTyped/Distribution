package typings.instagramPrivateApi.igtvChannelFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgtvChannelFeedResponseUser extends StObject {
  
  var friendship_status: js.UndefOr[IgtvChannelFeedResponseFriendshipStatus] = js.native
  
  var full_name: String = js.native
  
  var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.native
  
  var is_favorite: js.UndefOr[Boolean] = js.native
  
  var is_private: Boolean = js.native
  
  var is_unpublished: js.UndefOr[Boolean] = js.native
  
  var is_verified: Boolean = js.native
  
  var pk: Double = js.native
  
  var profile_pic_id: js.UndefOr[String] = js.native
  
  var profile_pic_url: String = js.native
  
  var username: String = js.native
}
object IgtvChannelFeedResponseUser {
  
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_url: String,
    username: String
  ): IgtvChannelFeedResponseUser = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvChannelFeedResponseUser]
  }
  
  @scala.inline
  implicit class IgtvChannelFeedResponseUserMutableBuilder[Self <: IgtvChannelFeedResponseUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriendship_status(value: IgtvChannelFeedResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendship_statusUndefined: Self = StObject.set(x, "friendship_status", js.undefined)
    
    @scala.inline
    def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_anonymous_profile_pictureUndefined: Self = StObject.set(x, "has_anonymous_profile_picture", js.undefined)
    
    @scala.inline
    def setIs_favorite(value: Boolean): Self = StObject.set(x, "is_favorite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_favoriteUndefined: Self = StObject.set(x, "is_favorite", js.undefined)
    
    @scala.inline
    def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_unpublished(value: Boolean): Self = StObject.set(x, "is_unpublished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_unpublishedUndefined: Self = StObject.set(x, "is_unpublished", js.undefined)
    
    @scala.inline
    def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
    
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
