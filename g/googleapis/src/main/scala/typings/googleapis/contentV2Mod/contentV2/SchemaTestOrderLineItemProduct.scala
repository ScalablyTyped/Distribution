package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestOrderLineItemProduct extends StObject {
  
  /**
    * Required. Brand of the item.
    */
  var brand: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated. Acceptable values are: - "`online`"
    */
  var channel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Condition or state of the item. Acceptable values are: - "`new`"
    */
  var condition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The two-letter ISO 639-1 language code for the item. Acceptable values are: - "`en`" - "`fr`"
    */
  var contentLanguage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Fees for the item. Optional.
    */
  var fees: js.UndefOr[js.Array[SchemaOrderLineItemProductFee]] = js.undefined
  
  /**
    * Global Trade Item Number (GTIN) of the item. Optional.
    */
  var gtin: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. URL of an image of the item.
    */
  var imageLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Shared identifier for all variants of the same product. Optional.
    */
  var itemGroupId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Manufacturer Part Number (MPN) of the item. Optional.
    */
  var mpn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. An identifier of the item.
    */
  var offerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The price for the product. Tax is automatically calculated for orders where marketplace facilitator tax laws are applicable. Otherwise, tax settings from Merchant Center are applied.
    */
  var price: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Required. The CLDR territory // code of the target country of the product.
    */
  var targetCountry: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The title of the product.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Variant attributes for the item. Optional.
    */
  var variantAttributes: js.UndefOr[js.Array[SchemaOrderLineItemProductVariantAttribute]] = js.undefined
}
object SchemaTestOrderLineItemProduct {
  
  inline def apply(): SchemaTestOrderLineItemProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestOrderLineItemProduct]
  }
  
  extension [Self <: SchemaTestOrderLineItemProduct](x: Self) {
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandNull: Self = StObject.set(x, "brand", null)
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelNull: Self = StObject.set(x, "channel", null)
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionNull: Self = StObject.set(x, "condition", null)
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageNull: Self = StObject.set(x, "contentLanguage", null)
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    inline def setFees(value: js.Array[SchemaOrderLineItemProductFee]): Self = StObject.set(x, "fees", value.asInstanceOf[js.Any])
    
    inline def setFeesUndefined: Self = StObject.set(x, "fees", js.undefined)
    
    inline def setFeesVarargs(value: SchemaOrderLineItemProductFee*): Self = StObject.set(x, "fees", js.Array(value*))
    
    inline def setGtin(value: String): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
    
    inline def setGtinNull: Self = StObject.set(x, "gtin", null)
    
    inline def setGtinUndefined: Self = StObject.set(x, "gtin", js.undefined)
    
    inline def setImageLink(value: String): Self = StObject.set(x, "imageLink", value.asInstanceOf[js.Any])
    
    inline def setImageLinkNull: Self = StObject.set(x, "imageLink", null)
    
    inline def setImageLinkUndefined: Self = StObject.set(x, "imageLink", js.undefined)
    
    inline def setItemGroupId(value: String): Self = StObject.set(x, "itemGroupId", value.asInstanceOf[js.Any])
    
    inline def setItemGroupIdNull: Self = StObject.set(x, "itemGroupId", null)
    
    inline def setItemGroupIdUndefined: Self = StObject.set(x, "itemGroupId", js.undefined)
    
    inline def setMpn(value: String): Self = StObject.set(x, "mpn", value.asInstanceOf[js.Any])
    
    inline def setMpnNull: Self = StObject.set(x, "mpn", null)
    
    inline def setMpnUndefined: Self = StObject.set(x, "mpn", js.undefined)
    
    inline def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    inline def setOfferIdNull: Self = StObject.set(x, "offerId", null)
    
    inline def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    inline def setPrice(value: SchemaPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setTargetCountry(value: String): Self = StObject.set(x, "targetCountry", value.asInstanceOf[js.Any])
    
    inline def setTargetCountryNull: Self = StObject.set(x, "targetCountry", null)
    
    inline def setTargetCountryUndefined: Self = StObject.set(x, "targetCountry", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVariantAttributes(value: js.Array[SchemaOrderLineItemProductVariantAttribute]): Self = StObject.set(x, "variantAttributes", value.asInstanceOf[js.Any])
    
    inline def setVariantAttributesUndefined: Self = StObject.set(x, "variantAttributes", js.undefined)
    
    inline def setVariantAttributesVarargs(value: SchemaOrderLineItemProductVariantAttribute*): Self = StObject.set(x, "variantAttributes", js.Array(value*))
  }
}
