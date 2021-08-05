package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseCarouselMediaItem extends StObject {
  
  var can_see_insights_as_brand: Boolean
  
  var carousel_parent_id: String
  
  var id: String
  
  var image_versions2: TopicalExploreFeedResponseImageVersions2
  
  var media_type: Double
  
  var original_height: Double
  
  var original_width: Double
  
  var pk: String
  
  var product_tags: js.UndefOr[TopicalExploreFeedResponseProductTags] = js.undefined
  
  var sharing_friction_info: TopicalExploreFeedResponseSharingFrictionInfo
  
  var usertags: js.UndefOr[TopicalExploreFeedResponseUsertags] = js.undefined
}
object TopicalExploreFeedResponseCarouselMediaItem {
  
  inline def apply(
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
  
  extension [Self <: TopicalExploreFeedResponseCarouselMediaItem](x: Self) {
    
    inline def setCan_see_insights_as_brand(value: Boolean): Self = StObject.set(x, "can_see_insights_as_brand", value.asInstanceOf[js.Any])
    
    inline def setCarousel_parent_id(value: String): Self = StObject.set(x, "carousel_parent_id", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage_versions2(value: TopicalExploreFeedResponseImageVersions2): Self = StObject.set(x, "image_versions2", value.asInstanceOf[js.Any])
    
    inline def setMedia_type(value: Double): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
    
    inline def setOriginal_height(value: Double): Self = StObject.set(x, "original_height", value.asInstanceOf[js.Any])
    
    inline def setOriginal_width(value: Double): Self = StObject.set(x, "original_width", value.asInstanceOf[js.Any])
    
    inline def setPk(value: String): Self = StObject.set(x, "pk", value.asInstanceOf[js.Any])
    
    inline def setProduct_tags(value: TopicalExploreFeedResponseProductTags): Self = StObject.set(x, "product_tags", value.asInstanceOf[js.Any])
    
    inline def setProduct_tagsUndefined: Self = StObject.set(x, "product_tags", js.undefined)
    
    inline def setSharing_friction_info(value: TopicalExploreFeedResponseSharingFrictionInfo): Self = StObject.set(x, "sharing_friction_info", value.asInstanceOf[js.Any])
    
    inline def setUsertags(value: TopicalExploreFeedResponseUsertags): Self = StObject.set(x, "usertags", value.asInstanceOf[js.Any])
    
    inline def setUsertagsUndefined: Self = StObject.set(x, "usertags", js.undefined)
  }
}
