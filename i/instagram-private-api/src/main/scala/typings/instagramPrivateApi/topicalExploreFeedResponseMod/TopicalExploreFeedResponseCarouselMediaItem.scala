package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseCarouselMediaItem extends js.Object {
  
  var can_see_insights_as_brand: Boolean = js.native
  
  var carousel_parent_id: String = js.native
  
  var id: String = js.native
  
  var image_versions2: TopicalExploreFeedResponseImageVersions2 = js.native
  
  var media_type: Double = js.native
  
  var original_height: Double = js.native
  
  var original_width: Double = js.native
  
  var pk: String = js.native
  
  var product_tags: js.UndefOr[TopicalExploreFeedResponseProductTags] = js.native
  
  var sharing_friction_info: TopicalExploreFeedResponseSharingFrictionInfo = js.native
  
  var usertags: js.UndefOr[TopicalExploreFeedResponseUsertags] = js.native
}
object TopicalExploreFeedResponseCarouselMediaItem {
  
  @scala.inline
  def apply(
    can_see_insights_as_brand: Boolean,
    carousel_parent_id: String,
    id: String,
    image_versions2: TopicalExploreFeedResponseImageVersions2,
    media_type: Double,
    original_height: Double,
    original_width: Double,
    pk: String,
    sharing_friction_info: TopicalExploreFeedResponseSharingFrictionInfo
  ): TopicalExploreFeedResponseCarouselMediaItem = {
    val __obj = js.Dynamic.literal(can_see_insights_as_brand = can_see_insights_as_brand.asInstanceOf[js.Any], carousel_parent_id = carousel_parent_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image_versions2 = image_versions2.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], original_height = original_height.asInstanceOf[js.Any], original_width = original_width.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], sharing_friction_info = sharing_friction_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseCarouselMediaItem]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseCarouselMediaItemOps[Self <: TopicalExploreFeedResponseCarouselMediaItem] (val x: Self) extends AnyVal {
    
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
    def setCan_see_insights_as_brand(value: Boolean): Self = this.set("can_see_insights_as_brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarousel_parent_id(value: String): Self = this.set("carousel_parent_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_versions2(value: TopicalExploreFeedResponseImageVersions2): Self = this.set("image_versions2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_type(value: Double): Self = this.set("media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_height(value: Double): Self = this.set("original_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal_width(value: Double): Self = this.set("original_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPk(value: String): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharing_friction_info(value: TopicalExploreFeedResponseSharingFrictionInfo): Self = this.set("sharing_friction_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct_tags(value: TopicalExploreFeedResponseProductTags): Self = this.set("product_tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct_tags: Self = this.set("product_tags", js.undefined)
    
    @scala.inline
    def setUsertags(value: TopicalExploreFeedResponseUsertags): Self = this.set("usertags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsertags: Self = this.set("usertags", js.undefined)
  }
}
