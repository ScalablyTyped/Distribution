package typings.instagramPrivateApi.mediaRepositoryConfigureSidecarResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaRepositoryConfigureSidecarResponseUser extends js.Object {
  
  var allowed_commenter_type: js.UndefOr[String] = js.native
  
  var can_boost_post: js.UndefOr[Boolean] = js.native
  
  var can_see_organic_insights: js.UndefOr[Boolean] = js.native
  
  var full_name: String = js.native
  
  var has_anonymous_profile_picture: js.UndefOr[Boolean] = js.native
  
  var is_private: Boolean = js.native
  
  var is_unpublished: js.UndefOr[Boolean] = js.native
  
  var is_verified: js.UndefOr[Boolean] = js.native
  
  var latest_reel_media: js.UndefOr[Null] = js.native
  
  var pk: Double = js.native
  
  var profile_pic_id: String = js.native
  
  var profile_pic_url: String = js.native
  
  var reel_auto_archive: js.UndefOr[String] = js.native
  
  var show_insights_terms: js.UndefOr[Boolean] = js.native
  
  var username: String = js.native
}
object MediaRepositoryConfigureSidecarResponseUser {
  
  @scala.inline
  def apply(
    full_name: String,
    is_private: Boolean,
    pk: Double,
    profile_pic_id: String,
    profile_pic_url: String,
    username: String
  ): MediaRepositoryConfigureSidecarResponseUser = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], is_private = is_private.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], profile_pic_id = profile_pic_id.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRepositoryConfigureSidecarResponseUser]
  }
  
  @scala.inline
  implicit class MediaRepositoryConfigureSidecarResponseUserOps[Self <: MediaRepositoryConfigureSidecarResponseUser] (val x: Self) extends AnyVal {
    
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
    def setFull_name(value: String): Self = this.set("full_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_private(value: Boolean): Self = this.set("is_private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: Double): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_id(value: String): Self = this.set("profile_pic_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_pic_url(value: String): Self = this.set("profile_pic_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowed_commenter_type(value: String): Self = this.set("allowed_commenter_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowed_commenter_type: Self = this.set("allowed_commenter_type", js.undefined)
    
    @scala.inline
    def setCan_boost_post(value: Boolean): Self = this.set("can_boost_post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_boost_post: Self = this.set("can_boost_post", js.undefined)
    
    @scala.inline
    def setCan_see_organic_insights(value: Boolean): Self = this.set("can_see_organic_insights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCan_see_organic_insights: Self = this.set("can_see_organic_insights", js.undefined)
    
    @scala.inline
    def setHas_anonymous_profile_picture(value: Boolean): Self = this.set("has_anonymous_profile_picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_anonymous_profile_picture: Self = this.set("has_anonymous_profile_picture", js.undefined)
    
    @scala.inline
    def setIs_unpublished(value: Boolean): Self = this.set("is_unpublished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_unpublished: Self = this.set("is_unpublished", js.undefined)
    
    @scala.inline
    def setIs_verified(value: Boolean): Self = this.set("is_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_verified: Self = this.set("is_verified", js.undefined)
    
    @scala.inline
    def setReel_auto_archive(value: String): Self = this.set("reel_auto_archive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReel_auto_archive: Self = this.set("reel_auto_archive", js.undefined)
    
    @scala.inline
    def setShow_insights_terms(value: Boolean): Self = this.set("show_insights_terms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow_insights_terms: Self = this.set("show_insights_terms", js.undefined)
  }
}
