package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestOrderLineItemProduct extends StObject {
  
  /** Required. Brand of the item. */
  var brand: js.UndefOr[String] = js.undefined
  
  /** Required. Condition or state of the item. Acceptable values are: - "`new`" */
  var condition: js.UndefOr[String] = js.undefined
  
  /** Required. The two-letter ISO 639-1 language code for the item. Acceptable values are: - "`en`" - "`fr`" */
  var contentLanguage: js.UndefOr[String] = js.undefined
  
  /** Fees for the item. Optional. */
  var fees: js.UndefOr[js.Array[OrderLineItemProductFee]] = js.undefined
  
  /** Global Trade Item Number (GTIN) of the item. Optional. */
  var gtin: js.UndefOr[String] = js.undefined
  
  /** Required. URL of an image of the item. */
  var imageLink: js.UndefOr[String] = js.undefined
  
  /** Shared identifier for all variants of the same product. Optional. */
  var itemGroupId: js.UndefOr[String] = js.undefined
  
  /** Manufacturer Part Number (MPN) of the item. Optional. */
  var mpn: js.UndefOr[String] = js.undefined
  
  /** Required. An identifier of the item. */
  var offerId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The price for the product. Tax is automatically calculated for orders where marketplace facilitator tax laws are applicable. Otherwise, tax settings from Merchant Center
    * are applied.
    */
  var price: js.UndefOr[Price] = js.undefined
  
  /** Required. The CLDR territory // code of the target country of the product. */
  var targetCountry: js.UndefOr[String] = js.undefined
  
  /** Required. The title of the product. */
  var title: js.UndefOr[String] = js.undefined
  
  /** Variant attributes for the item. Optional. */
  var variantAttributes: js.UndefOr[js.Array[OrderLineItemProductVariantAttribute]] = js.undefined
}
object TestOrderLineItemProduct {
  
  inline def apply(): TestOrderLineItemProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOrderLineItemProduct]
  }
  
  extension [Self <: TestOrderLineItemProduct](x: Self) {
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    inline def setFees(value: js.Array[OrderLineItemProductFee]): Self = StObject.set(x, "fees", value.asInstanceOf[js.Any])
    
    inline def setFeesUndefined: Self = StObject.set(x, "fees", js.undefined)
    
    inline def setFeesVarargs(value: OrderLineItemProductFee*): Self = StObject.set(x, "fees", js.Array(value :_*))
    
    inline def setGtin(value: String): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
    
    inline def setGtinUndefined: Self = StObject.set(x, "gtin", js.undefined)
    
    inline def setImageLink(value: String): Self = StObject.set(x, "imageLink", value.asInstanceOf[js.Any])
    
    inline def setImageLinkUndefined: Self = StObject.set(x, "imageLink", js.undefined)
    
    inline def setItemGroupId(value: String): Self = StObject.set(x, "itemGroupId", value.asInstanceOf[js.Any])
    
    inline def setItemGroupIdUndefined: Self = StObject.set(x, "itemGroupId", js.undefined)
    
    inline def setMpn(value: String): Self = StObject.set(x, "mpn", value.asInstanceOf[js.Any])
    
    inline def setMpnUndefined: Self = StObject.set(x, "mpn", js.undefined)
    
    inline def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    inline def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setTargetCountry(value: String): Self = StObject.set(x, "targetCountry", value.asInstanceOf[js.Any])
    
    inline def setTargetCountryUndefined: Self = StObject.set(x, "targetCountry", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVariantAttributes(value: js.Array[OrderLineItemProductVariantAttribute]): Self = StObject.set(x, "variantAttributes", value.asInstanceOf[js.Any])
    
    inline def setVariantAttributesUndefined: Self = StObject.set(x, "variantAttributes", js.undefined)
    
    inline def setVariantAttributesVarargs(value: OrderLineItemProductVariantAttribute*): Self = StObject.set(x, "variantAttributes", js.Array(value :_*))
  }
}
