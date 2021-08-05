package typings.instagramPrivateApi.savedFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedFeedResponseProduct extends StObject {
  
  var can_share_to_story: Boolean
  
  var checkout_style: String
  
  var current_price: String
  
  var current_price_stripped: String
  
  var description: String
  
  var external_url: String
  
  var full_price: String
  
  var full_price_stripped: String
  
  var has_viewer_saved: Boolean
  
  var main_image: SavedFeedResponseMainImage
  
  var merchant: SavedFeedResponseMerchant
  
  var name: String
  
  var price: String
  
  var product_id: String
  
  var retailer_id: String
  
  var review_status: String
  
  var thumbnail_image: SavedFeedResponseThumbnailImage
  
  var variant_values: js.UndefOr[js.Array[SavedFeedResponseVariantValuesItem]] = js.undefined
}
object SavedFeedResponseProduct {
  
  inline def apply(
    can_share_to_story: Boolean,
    checkout_style: String,
    current_price: String,
    current_price_stripped: String,
    description: String,
    external_url: String,
    full_price: String,
    full_price_stripped: String,
    has_viewer_saved: Boolean,
    main_image: SavedFeedResponseMainImage,
    merchant: SavedFeedResponseMerchant,
    name: String,
    price: String,
    product_id: String,
    retailer_id: String,
    review_status: String,
    thumbnail_image: SavedFeedResponseThumbnailImage
  ): SavedFeedResponseProduct = {
    val __obj = js.Dynamic.literal(can_share_to_story = can_share_to_story.asInstanceOf[js.Any], checkout_style = checkout_style.asInstanceOf[js.Any], current_price = current_price.asInstanceOf[js.Any], current_price_stripped = current_price_stripped.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], full_price = full_price.asInstanceOf[js.Any], full_price_stripped = full_price_stripped.asInstanceOf[js.Any], has_viewer_saved = has_viewer_saved.asInstanceOf[js.Any], main_image = main_image.asInstanceOf[js.Any], merchant = merchant.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], retailer_id = retailer_id.asInstanceOf[js.Any], review_status = review_status.asInstanceOf[js.Any], thumbnail_image = thumbnail_image.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFeedResponseProduct]
  }
  
  extension [Self <: SavedFeedResponseProduct](x: Self) {
    
    inline def setCan_share_to_story(value: Boolean): Self = StObject.set(x, "can_share_to_story", value.asInstanceOf[js.Any])
    
    inline def setCheckout_style(value: String): Self = StObject.set(x, "checkout_style", value.asInstanceOf[js.Any])
    
    inline def setCurrent_price(value: String): Self = StObject.set(x, "current_price", value.asInstanceOf[js.Any])
    
    inline def setCurrent_price_stripped(value: String): Self = StObject.set(x, "current_price_stripped", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExternal_url(value: String): Self = StObject.set(x, "external_url", value.asInstanceOf[js.Any])
    
    inline def setFull_price(value: String): Self = StObject.set(x, "full_price", value.asInstanceOf[js.Any])
    
    inline def setFull_price_stripped(value: String): Self = StObject.set(x, "full_price_stripped", value.asInstanceOf[js.Any])
    
    inline def setHas_viewer_saved(value: Boolean): Self = StObject.set(x, "has_viewer_saved", value.asInstanceOf[js.Any])
    
    inline def setMain_image(value: SavedFeedResponseMainImage): Self = StObject.set(x, "main_image", value.asInstanceOf[js.Any])
    
    inline def setMerchant(value: SavedFeedResponseMerchant): Self = StObject.set(x, "merchant", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setProduct_id(value: String): Self = StObject.set(x, "product_id", value.asInstanceOf[js.Any])
    
    inline def setRetailer_id(value: String): Self = StObject.set(x, "retailer_id", value.asInstanceOf[js.Any])
    
    inline def setReview_status(value: String): Self = StObject.set(x, "review_status", value.asInstanceOf[js.Any])
    
    inline def setThumbnail_image(value: SavedFeedResponseThumbnailImage): Self = StObject.set(x, "thumbnail_image", value.asInstanceOf[js.Any])
    
    inline def setVariant_values(value: js.Array[SavedFeedResponseVariantValuesItem]): Self = StObject.set(x, "variant_values", value.asInstanceOf[js.Any])
    
    inline def setVariant_valuesUndefined: Self = StObject.set(x, "variant_values", js.undefined)
    
    inline def setVariant_valuesVarargs(value: SavedFeedResponseVariantValuesItem*): Self = StObject.set(x, "variant_values", js.Array(value :_*))
  }
}
