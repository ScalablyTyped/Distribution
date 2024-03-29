package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseProduct extends StObject {
  
  var can_see_insights_for_viewer: Boolean
  
  var can_share_to_story: Boolean
  
  var checkout_style: String
  
  var compound_product_id: String
  
  var current_price: String
  
  var current_price_stripped: String
  
  var description: String
  
  var external_url: String
  
  var full_price: String
  
  var full_price_stripped: String
  
  var has_viewer_saved: Boolean
  
  var launch_information: js.UndefOr[TopicalExploreFeedResponseLaunchInformation] = js.undefined
  
  var main_image: TopicalExploreFeedResponseMainImage
  
  var merchant: TopicalExploreFeedResponseMerchant
  
  var name: String
  
  var price: String
  
  var product_id: String
  
  var retailer_id: String
  
  var review_status: String
  
  var rich_text_description: js.UndefOr[js.Array[TopicalExploreFeedResponseRichTextDescriptionItem]] = js.undefined
  
  var thumbnail_image: TopicalExploreFeedResponseThumbnailImage
}
object TopicalExploreFeedResponseProduct {
  
  inline def apply(
    can_see_insights_for_viewer: Boolean,
    can_share_to_story: Boolean,
    checkout_style: String,
    compound_product_id: String,
    current_price: String,
    current_price_stripped: String,
    description: String,
    external_url: String,
    full_price: String,
    full_price_stripped: String,
    has_viewer_saved: Boolean,
    main_image: TopicalExploreFeedResponseMainImage,
    merchant: TopicalExploreFeedResponseMerchant,
    name: String,
    price: String,
    product_id: String,
    retailer_id: String,
    review_status: String,
    thumbnail_image: TopicalExploreFeedResponseThumbnailImage
  ): TopicalExploreFeedResponseProduct = {
    val __obj = js.Dynamic.literal(can_see_insights_for_viewer = can_see_insights_for_viewer.asInstanceOf[js.Any], can_share_to_story = can_share_to_story.asInstanceOf[js.Any], checkout_style = checkout_style.asInstanceOf[js.Any], compound_product_id = compound_product_id.asInstanceOf[js.Any], current_price = current_price.asInstanceOf[js.Any], current_price_stripped = current_price_stripped.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], full_price = full_price.asInstanceOf[js.Any], full_price_stripped = full_price_stripped.asInstanceOf[js.Any], has_viewer_saved = has_viewer_saved.asInstanceOf[js.Any], main_image = main_image.asInstanceOf[js.Any], merchant = merchant.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], retailer_id = retailer_id.asInstanceOf[js.Any], review_status = review_status.asInstanceOf[js.Any], thumbnail_image = thumbnail_image.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseProduct]
  }
  
  extension [Self <: TopicalExploreFeedResponseProduct](x: Self) {
    
    inline def setCan_see_insights_for_viewer(value: Boolean): Self = StObject.set(x, "can_see_insights_for_viewer", value.asInstanceOf[js.Any])
    
    inline def setCan_share_to_story(value: Boolean): Self = StObject.set(x, "can_share_to_story", value.asInstanceOf[js.Any])
    
    inline def setCheckout_style(value: String): Self = StObject.set(x, "checkout_style", value.asInstanceOf[js.Any])
    
    inline def setCompound_product_id(value: String): Self = StObject.set(x, "compound_product_id", value.asInstanceOf[js.Any])
    
    inline def setCurrent_price(value: String): Self = StObject.set(x, "current_price", value.asInstanceOf[js.Any])
    
    inline def setCurrent_price_stripped(value: String): Self = StObject.set(x, "current_price_stripped", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
    
    inline def setFull_price(value: String): Self = StObject.set(x, "full_price", value.asInstanceOf[js.Any])
    
    inline def setFull_price_stripped(value: String): Self = StObject.set(x, "full_price_stripped", value.asInstanceOf[js.Any])
    
    inline def setHas_viewer_saved(value: Boolean): Self = StObject.set(x, "has_viewer_saved", value.asInstanceOf[js.Any])
    
    inline def setLaunch_information(value: TopicalExploreFeedResponseLaunchInformation): Self = StObject.set(x, "launch_information", value.asInstanceOf[js.Any])
    
    inline def setLaunch_informationUndefined: Self = StObject.set(x, "launch_information", js.undefined)
    
    inline def setMain_image(value: TopicalExploreFeedResponseMainImage): Self = StObject.set(x, "main_image", value.asInstanceOf[js.Any])
    
    inline def setMerchant(value: TopicalExploreFeedResponseMerchant): Self = StObject.set(x, "merchant", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
    
    inline def setRetailer_id(value: String): Self = StObject.set(x, "retailer_id", value.asInstanceOf[js.Any])
    
    inline def setReview_status(value: String): Self = StObject.set(x, "review_status", value.asInstanceOf[js.Any])
    
    inline def setRich_text_description(value: js.Array[TopicalExploreFeedResponseRichTextDescriptionItem]): Self = StObject.set(x, "rich_text_description", value.asInstanceOf[js.Any])
    
    inline def setRich_text_descriptionUndefined: Self = StObject.set(x, "rich_text_description", js.undefined)
    
    inline def setRich_text_descriptionVarargs(value: TopicalExploreFeedResponseRichTextDescriptionItem*): Self = StObject.set(x, "rich_text_description", js.Array(value :_*))
    
    inline def setThumbnail_image(value: TopicalExploreFeedResponseThumbnailImage): Self = StObject.set(x, "thumbnail_image", value.asInstanceOf[js.Any])
  }
}
