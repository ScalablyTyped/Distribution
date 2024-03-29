package typings.instagramPrivateApi.igtvChannelFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgtvChannelFeedResponseUserDict extends StObject {
  
  var biography: String
  
  var biography_with_entities: IgtvChannelFeedResponseBiographyWithEntities
  
  var external_lynx_url: String
  
  var external_url: String
  
  var follower_count: Double
  
  var following_count: Double
  
  var following_tag_count: Double
  
  var friendship_status: IgtvChannelFeedResponseFriendshipStatus
  
  var full_name: String
  
  var geo_media_count: Double
  
  var has_anonymous_profile_picture: Boolean
  
  var has_biography_translation: Boolean
  
  var has_igtv_series: Boolean
  
  var is_private: Boolean
  
  var is_verified: Boolean
  
  var media_count: Double
  
  var pk: Double
  
  var profile_pic_id: String
  
  var profile_pic_url: String
  
  var total_igtv_videos: Double
  
  var username: String
}
object IgtvChannelFeedResponseUserDict {
  
  inline def apply(
    biography: String,
    biography_with_entities: IgtvChannelFeedResponseBiographyWithEntities,
    external_lynx_url: String,
    external_url: String,
    follower_count: Double,
    following_count: Double,
    following_tag_count: Double,
    friendship_status: IgtvChannelFeedResponseFriendshipStatus,
    full_name: String,
    geo_media_count: Double,
    has_anonymous_profile_picture: Boolean,
    has_biography_translation: Boolean,
    has_igtv_series: Boolean,
    is_private: Boolean,
    is_verified: Boolean,
    media_count: Double,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    total_igtv_videos: Double,
    username: String
  ): IgtvChannelFeedResponseUserDict = {
    val __obj = js.Dynamic.literal(biography = biography.asInstanceOf[js.Any], biography_with_entities = biography_with_entities.asInstanceOf[js.Any], external_lynx_url = external_lynx_url.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], follower_count = follower_count.asInstanceOf[js.Any], following_count = following_count.asInstanceOf[js.Any], following_tag_count = following_tag_count.asInstanceOf[js.Any], friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], geo_media_count = geo_media_count.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], has_biography_translation = has_biography_translation.asInstanceOf[js.Any], has_igtv_series = has_igtv_series.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], total_igtv_videos = total_igtv_videos.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvChannelFeedResponseUserDict]
  }
  
  extension [Self <: IgtvChannelFeedResponseUserDict](x: Self) {
    
    inline def setBiography(value: String): Self = StObject.set(x, "biography", value.asInstanceOf[js.Any])
    
    inline def setBiography_with_entities(value: IgtvChannelFeedResponseBiographyWithEntities): Self = StObject.set(x, "biography_with_entities", value.asInstanceOf[js.Any])
    
    inline def setExternal_lynx_url(value: String): Self = StObject.set(x, "external_lynx_url", value.asInstanceOf[js.Any])
    
    inline def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
    
    inline def setFollower_count(value: Double): Self = StObject.set(x, "follower_count", value.asInstanceOf[js.Any])
    
    inline def setFollowing_count(value: Double): Self = StObject.set(x, "following_count", value.asInstanceOf[js.Any])
    
    inline def setFollowing_tag_count(value: Double): Self = StObject.set(x, "following_tag_count", value.asInstanceOf[js.Any])
    
    inline def setFriendship_status(value: IgtvChannelFeedResponseFriendshipStatus): Self = StObject.set(x, "friendship_status", value.asInstanceOf[js.Any])
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setGeo_media_count(value: Double): Self = StObject.set(x, "geo_media_count", value.asInstanceOf[js.Any])
    
    inline def setHas_anonymous_profile_picture(value: Boolean): Self = StObject.set(x, "has_anonymous_profile_picture", value.asInstanceOf[js.Any])
    
    inline def setHas_biography_translation(value: Boolean): Self = StObject.set(x, "has_biography_translation", value.asInstanceOf[js.Any])
    
    inline def setHas_igtv_series(value: Boolean): Self = StObject.set(x, "has_igtv_series", value.asInstanceOf[js.Any])
    
    inline def setIs_private(value: Boolean): Self = StObject.set(x, "is_private", value.asInstanceOf[js.Any])
    
    inline def setIs_verified(value: Boolean): Self = StObject.set(x, "is_verified", value.asInstanceOf[js.Any])
    
    inline def setMedia_count(value: Double): Self = StObject.set(x, "media_count", value.asInstanceOf[js.Any])
    
    inline def setPk(value: Double): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    inline def setProfile_pic_id(value: String): Self = StObject.set(x, "profile_pic_id", value.asInstanceOf[js.Any])
    
    inline def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
    
    inline def setTotal_igtv_videos(value: Double): Self = StObject.set(x, "total_igtv_videos", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
