package typings.instagramPrivateApi.igtvSearchResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgtvSearchResponseUser extends js.Object {
  
  var biography: js.UndefOr[String] = js.native
  
  var biography_with_entities: js.UndefOr[IgtvSearchResponseBiographyWithEntities] = js.native
  
  var external_lynx_url: js.UndefOr[String] = js.native
  
  var external_url: js.UndefOr[String] = js.native
  
  var friendship_status: js.UndefOr[IgtvSearchResponseFriendshipStatus] = js.native
  
  var full_name: js.UndefOr[String] = js.native
  
  var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.native
  
  var has_biography_translation: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[Double] = js.native
  
  var is_private: js.UndefOr[Boolean] = js.native
  
  var is_verified: js.UndefOr[Boolean] = js.native
  
  var latest_reel_media: js.UndefOr[Double] = js.native
  
  var mutual_followers_count: js.UndefOr[Double] = js.native
  
  var pk: js.UndefOr[Double] = js.native
  
  var profile_pic_id: js.UndefOr[String] = js.native
  
  var profile_pic_url: js.UndefOr[String] = js.native
  
  var username: String = js.native
}
object IgtvSearchResponseUser {
  
  @scala.inline
  def apply(username: String): IgtvSearchResponseUser = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvSearchResponseUser]
  }
  
  @scala.inline
  implicit class IgtvSearchResponseUserOps[Self <: IgtvSearchResponseUser] (val x: Self) extends AnyVal {
    
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
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiography(value: String): Self = this.set("biography", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBiography: Self = this.set("biography", js.undefined)
    
    @scala.inline
    def setBiography_with_entities(value: IgtvSearchResponseBiographyWithEntities): Self = this.set("biography_with_entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBiography_with_entities: Self = this.set("biography_with_entities", js.undefined)
    
    @scala.inline
    def setExternal_lynx_url(value: String): Self = this.set("external_lynx_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal_lynx_url: Self = this.set("external_lynx_url", js.undefined)
    
    @scala.inline
    def setExternal_url(value: String): Self = this.set("external_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal_url: Self = this.set("external_url", js.undefined)
    
    @scala.inline
    def setFriendship_status(value: IgtvSearchResponseFriendshipStatus): Self = this.set("friendship_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriendship_status: Self = this.set("friendship_status", js.undefined)
    
    @scala.inline
    def setFull_name(value: String): Self = this.set("full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFull_name: Self = this.set("full_name", js.undefined)
    
    @scala.inline
    def setHas_anonymous_profile_picture(value: Boolean): Self = this.set("has_anonymous_profile_picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_anonymous_profile_picture: Self = this.set("has_anonymous_profile_picture", js.undefined)
    
    @scala.inline
    def setHas_biography_translation(value: Boolean): Self = this.set("has_biography_translation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_biography_translation: Self = this.set("has_biography_translation", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIs_private(value: Boolean): Self = this.set("is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_private: Self = this.set("is_private", js.undefined)
    
    @scala.inline
    def setIs_verified(value: Boolean): Self = this.set("is_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_verified: Self = this.set("is_verified", js.undefined)
    
    @scala.inline
    def setLatest_reel_media(value: Double): Self = this.set("latest_reel_media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatest_reel_media: Self = this.set("latest_reel_media", js.undefined)
    
    @scala.inline
    def setMutual_followers_count(value: Double): Self = this.set("mutual_followers_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutual_followers_count: Self = this.set("mutual_followers_count", js.undefined)
    
    @scala.inline
    def setPk(value: Double): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePk: Self = this.set("pk", js.undefined)
    
    @scala.inline
    def setProfile_pic_id(value: String): Self = this.set("profile_pic_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile_pic_id: Self = this.set("profile_pic_id", js.undefined)
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = this.set("profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile_pic_url: Self = this.set("profile_pic_url", js.undefined)
  }
}
