package typings.instagramPrivateApi.igtvSearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgtvSearchResponseUserDict extends js.Object {
  
  var biography: String = js.native
  
  var biography_with_entities: IgtvSearchResponseBiographyWithEntities = js.native
  
  var external_lynx_url: js.UndefOr[String] = js.native
  
  var external_url: String = js.native
  
  var follower_count: Double = js.native
  
  var following_count: Double = js.native
  
  var following_tag_count: Double = js.native
  
  var friendship_status: IgtvSearchResponseFriendshipStatus = js.native
  
  var full_name: String = js.native
  
  var geo_media_count: js.UndefOr[Double] = js.native
  
  var has_anonymous_profile_picture: Boolean = js.native
  
  var has_biography_translation: js.UndefOr[Boolean] = js.native
  
  var has_igtv_series: Boolean = js.native
  
  var is_private: Boolean = js.native
  
  var is_verified: Boolean = js.native
  
  var media_count: Double = js.native
  
  var pk: Double = js.native
  
  var profile_pic_id: String = js.native
  
  var profile_pic_url: String = js.native
  
  var total_igtv_videos: Double = js.native
  
  var username: String = js.native
}
object IgtvSearchResponseUserDict {
  
  @scala.inline
  def apply(
    biography: String,
    biography_with_entities: IgtvSearchResponseBiographyWithEntities,
    external_url: String,
    follower_count: Double,
    following_count: Double,
    following_tag_count: Double,
    friendship_status: IgtvSearchResponseFriendshipStatus,
    full_name: String,
    has_anonymous_profile_picture: Boolean,
    has_igtv_series: Boolean,
    is_private: Boolean,
    is_verified: Boolean,
    media_count: Double,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    total_igtv_videos: Double,
    username: String
  ): IgtvSearchResponseUserDict = {
    val __obj = js.Dynamic.literal(biography = biography.asInstanceOf[js.Any], biography_with_entities = biography_with_entities.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], follower_count = follower_count.asInstanceOf[js.Any], following_count = following_count.asInstanceOf[js.Any], following_tag_count = following_tag_count.asInstanceOf[js.Any], friendship_status = friendship_status.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], has_anonymous_profile_picture = has_anonymous_profile_picture.asInstanceOf[js.Any], has_igtv_series = has_igtv_series.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], is_verified = is_verified.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], total_igtv_videos = total_igtv_videos.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvSearchResponseUserDict]
  }
  
  @scala.inline
  implicit class IgtvSearchResponseUserDictOps[Self <: IgtvSearchResponseUserDict] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBiography(value: String): Self = this.set("biography", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiography_with_entities(value: IgtvSearchResponseBiographyWithEntities): Self = this.set("biography_with_entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_url(value: String): Self = this.set("external_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollower_count(value: Double): Self = this.set("follower_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowing_count(value: Double): Self = this.set("following_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowing_tag_count(value: Double): Self = this.set("following_tag_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendship_status(value: IgtvSearchResponseFriendshipStatus): Self = this.set("friendship_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull_name(value: String): Self = this.set("full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_anonymous_profile_picture(value: Boolean): Self = this.set("has_anonymous_profile_picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_igtv_series(value: Boolean): Self = this.set("has_igtv_series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_private(value: Boolean): Self = this.set("is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_verified(value: Boolean): Self = this.set("is_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_count(value: Double): Self = this.set("media_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: Double): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_id(value: String): Self = this.set("profile_pic_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = this.set("profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_igtv_videos(value: Double): Self = this.set("total_igtv_videos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_lynx_url(value: String): Self = this.set("external_lynx_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal_lynx_url: Self = this.set("external_lynx_url", js.undefined)
    
    @scala.inline
    def setGeo_media_count(value: Double): Self = this.set("geo_media_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeo_media_count: Self = this.set("geo_media_count", js.undefined)
    
    @scala.inline
    def setHas_biography_translation(value: Boolean): Self = this.set("has_biography_translation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_biography_translation: Self = this.set("has_biography_translation", js.undefined)
  }
}
