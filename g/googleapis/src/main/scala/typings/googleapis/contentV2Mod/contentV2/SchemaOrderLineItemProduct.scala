package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderLineItemProduct extends StObject {
  
  /**
    * Brand of the item.
    */
  var brand: js.UndefOr[String] = js.undefined
  
  /**
    * The item&#39;s channel (online or local).
    */
  var channel: js.UndefOr[String] = js.undefined
  
  /**
    * Condition or state of the item.
    */
  var condition: js.UndefOr[String] = js.undefined
  
  /**
    * The two-letter ISO 639-1 language code for the item.
    */
  var contentLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * Associated fees at order creation time.
    */
  var fees: js.UndefOr[js.Array[SchemaOrderLineItemProductFee]] = js.undefined
  
  /**
    * Global Trade Item Number (GTIN) of the item.
    */
  var gtin: js.UndefOr[String] = js.undefined
  
  /**
    * The REST ID of the product.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * URL of an image of the item.
    */
  var imageLink: js.UndefOr[String] = js.undefined
  
  /**
    * Shared identifier for all variants of the same product.
    */
  var itemGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Manufacturer Part Number (MPN) of the item.
    */
  var mpn: js.UndefOr[String] = js.undefined
  
  /**
    * An identifier of the item.
    */
  var offerId: js.UndefOr[String] = js.undefined
  
  /**
    * Price of the item.
    */
  var price: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * URL to the cached image shown to the user when order was placed.
    */
  var shownImage: js.UndefOr[String] = js.undefined
  
  /**
    * The CLDR territory code of the target country of the product.
    */
  var targetCountry: js.UndefOr[String] = js.undefined
  
  /**
    * The title of the product.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Variant attributes for the item. These are dimensions of the product,
    * such as color, gender, material, pattern, and size. You can find a
    * comprehensive list of variant attributes here.
    */
  var variantAttributes: js.UndefOr[js.Array[SchemaOrderLineItemProductVariantAttribute]] = js.undefined
}
object SchemaOrderLineItemProduct {
  
  inline def apply(): SchemaOrderLineItemProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItemProduct]
  }
  
  extension [Self <: SchemaOrderLineItemProduct](x: Self) {
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    inline def setFees(value: js.Array[SchemaOrderLineItemProductFee]): Self = StObject.set(x, "fees", value.asInstanceOf[js.Any])
    
    inline def setFeesUndefined: Self = StObject.set(x, "fees", js.undefined)
    
    inline def setFeesVarargs(value: SchemaOrderLineItemProductFee*): Self = StObject.set(x, "fees", js.Array(value :_*))
    
    inline def setGtin(value: String): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
    
    inline def setGtinUndefined: Self = StObject.set(x, "gtin", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImageLink(value: String): Self = StObject.set(x, "imageLink", value.asInstanceOf[js.Any])
    
    inline def setImageLinkUndefined: Self = StObject.set(x, "imageLink", js.undefined)
    
    inline def setItemGroupId(value: String): Self = StObject.set(x, "itemGroupId", value.asInstanceOf[js.Any])
    
    inline def setItemGroupIdUndefined: Self = StObject.set(x, "itemGroupId", js.undefined)
    
    inline def setMpn(value: String): Self = StObject.set(x, "mpn", value.asInstanceOf[js.Any])
    
    inline def setMpnUndefined: Self = StObject.set(x, "mpn", js.undefined)
    
    inline def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    inline def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    inline def setPrice(value: SchemaPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setShownImage(value: String): Self = StObject.set(x, "shownImage", value.asInstanceOf[js.Any])
    
    inline def setShownImageUndefined: Self = StObject.set(x, "shownImage", js.undefined)
    
    inline def setTargetCountry(value: String): Self = StObject.set(x, "targetCountry", value.asInstanceOf[js.Any])
    
    inline def setTargetCountryUndefined: Self = StObject.set(x, "targetCountry", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVariantAttributes(value: js.Array[SchemaOrderLineItemProductVariantAttribute]): Self = StObject.set(x, "variantAttributes", value.asInstanceOf[js.Any])
    
    inline def setVariantAttributesUndefined: Self = StObject.set(x, "variantAttributes", js.undefined)
    
    inline def setVariantAttributesVarargs(value: SchemaOrderLineItemProductVariantAttribute*): Self = StObject.set(x, "variantAttributes", js.Array(value :_*))
  }
}
