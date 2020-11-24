package typings.instagramPrivateApi.userFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserFeedResponseCarouselMediaItem extends js.Object {
  
  var carousel_parent_id: String = js.native
  
  var fb_user_tags: UserFeedResponseFbUserTags = js.native
  
  var id: String = js.native
  
  var image_versions2: UserFeedResponseImageVersions2 = js.native
  
  var media_type: Double = js.native
  
  var original_height: Double = js.native
  
  var original_width: Double = js.native
  
  var pk: String = js.native
}
object UserFeedResponseCarouselMediaItem {
  
  @scala.inline
  def apply(
    carousel_parent_id: String,
    fb_user_tags: UserFeedResponseFbUserTags,
    id: String,
    image_versions2: UserFeedResponseImageVersions2,
    media_type: Double,
    original_height: Double,
    original_width: Double,
    pk: String
  ): UserFeedResponseCarouselMediaItem = {
    val __obj = js.Dynamic.literal(carousel_parent_id = carousel_parent_id.asInstanceOf[js.Any], fb_user_tags = fb_user_tags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserFeedResponseCarouselMediaItem]
  }
  
  @scala.inline
  implicit class UserFeedResponseCarouselMediaItemOps[Self <: UserFeedResponseCarouselMediaItem] (val x: Self) extends AnyVal {
    
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
    def setCarousel_parent_id(value: String): Self = this.set("carousel_parent_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFb_user_tags(value: UserFeedResponseFbUserTags): Self = this.set("fb_user_tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2(value: UserFeedResponseImageVersions2): Self = this.set("image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_type(value: Double): Self = this.set("media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_height(value: Double): Self = this.set("original_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_width(value: Double): Self = this.set("original_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = this.set("pk", value.asInstanceOf[js.Any])
  }
}
