package typings.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightsRepositoryHighlightsTrayResponseUser extends StObject {
  
  var friendship_status: js.UndefOr[HighlightsRepositoryHighlightsTrayResponseFriendshipStatus] = js.undefined
  
  var full_name: String
  
  var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.undefined
  
  var is_favorite: js.UndefOr[Boolean] = js.undefined
  
  var is_private: Boolean
  
  var is_unpublished: js.UndefOr[Boolean] = js.undefined
  
  var is_verified: Boolean
  
  var latest_reel_media: js.UndefOr[Null] = js.undefined
  
  var pk: Double
  
  var profile_pic_id: String
  
  var profile_pic_url: String
  
  var username: String
}
object HighlightsRepositoryHighlightsTrayResponseUser {
  
  inline def apply(
    full_name: String,
    is_private: Boolean,
    is_verified: Boolean,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    username: String
  ): HighlightsRepositoryHighlightsTrayResponseUser = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightsRepositoryHighlightsTrayResponseUser]
  }
  
  extension [Self <: HighlightsRepositoryHighlightsTrayResponseUser](x: Self) {
    
    inline def setFriendship_status(value: HighlightsRepositoryHighlightsTrayResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
    
    inline def setFriendship_statusUndefined: Self = StObject.set(x, "friendship_status", js.undefined)
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
    
    inline def setHas_anonymous_profile_pictureUndefined: Self = StObject.set(x, "has_anonymous_profile_picture", js.undefined)
    
    inline def setIs_favorite(value: Boolean): Self = StObject.set(x, "is_favorite", value.asInstanceOf[js.Any])
    
    inline def setIs_favoriteUndefined: Self = StObject.set(x, "is_favorite", js.undefined)
    
    inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
    
    inline def setIs_unpublished(value: Boolean): Self = StObject.set(x, "is_unpublished", value.asInstanceOf[js.Any])
    
    inline def setIs_unpublishedUndefined: Self = StObject.set(x, "is_unpublished", js.undefined)
    
    inline def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
    
    inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    inline def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
    
    inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
