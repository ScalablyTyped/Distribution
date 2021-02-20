package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestOrderLineItemProduct extends StObject {
  
  /** Required. Brand of the item. */
  var brand: js.UndefOr[String] = js.native
  
  /** Required. Condition or state of the item. Acceptable values are: - "`new`" */
  var condition: js.UndefOr[String] = js.native
  
  /** Required. The two-letter ISO 639-1 language code for the item. Acceptable values are: - "`en`" - "`fr`" */
  var contentLanguage: js.UndefOr[String] = js.native
  
  /** Fees for the item. Optional. */
  var fees: js.UndefOr[js.Array[OrderLineItemProductFee]] = js.native
  
  /** Global Trade Item Number (GTIN) of the item. Optional. */
  var gtin: js.UndefOr[String] = js.native
  
  /** Required. URL of an image of the item. */
  var imageLink: js.UndefOr[String] = js.native
  
  /** Shared identifier for all variants of the same product. Optional. */
  var itemGroupId: js.UndefOr[String] = js.native
  
  /** Manufacturer Part Number (MPN) of the item. Optional. */
  var mpn: js.UndefOr[String] = js.native
  
  /** Required. An identifier of the item. */
  var offerId: js.UndefOr[String] = js.native
  
  /**
    * Required. The price for the product. Tax is automatically calculated for orders where marketplace facilitator tax laws are applicable. Otherwise, tax settings from Merchant Center
    * are applied.
    */
  var price: js.UndefOr[Price] = js.native
  
  /** Required. The CLDR territory // code of the target country of the product. */
  var targetCountry: js.UndefOr[String] = js.native
  
  /** Required. The title of the product. */
  var title: js.UndefOr[String] = js.native
  
  /** Variant attributes for the item. Optional. */
  var variantAttributes: js.UndefOr[js.Array[OrderLineItemProductVariantAttribute]] = js.native
}
object TestOrderLineItemProduct {
  
  @scala.inline
  def apply(): TestOrderLineItemProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOrderLineItemProduct]
  }
  
  @scala.inline
  implicit class TestOrderLineItemProductMutableBuilder[Self <: TestOrderLineItemProduct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    @scala.inline
    def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    @scala.inline
    def setFees(value: js.Array[OrderLineItemProductFee]): Self = StObject.set(x, "fees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeesUndefined: Self = StObject.set(x, "fees", js.undefined)
    
    @scala.inline
    def setFeesVarargs(value: OrderLineItemProductFee*): Self = StObject.set(x, "fees", js.Array(value :_*))
    
    @scala.inline
    def setGtin(value: String): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGtinUndefined: Self = StObject.set(x, "gtin", js.undefined)
    
    @scala.inline
    def setImageLink(value: String): Self = StObject.set(x, "imageLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageLinkUndefined: Self = StObject.set(x, "imageLink", js.undefined)
    
    @scala.inline
    def setItemGroupId(value: String): Self = StObject.set(x, "itemGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemGroupIdUndefined: Self = StObject.set(x, "itemGroupId", js.undefined)
    
    @scala.inline
    def setMpn(value: String): Self = StObject.set(x, "mpn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpnUndefined: Self = StObject.set(x, "mpn", js.undefined)
    
    @scala.inline
    def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    @scala.inline
    def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setTargetCountry(value: String): Self = StObject.set(x, "targetCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCountryUndefined: Self = StObject.set(x, "targetCountry", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVariantAttributes(value: js.Array[OrderLineItemProductVariantAttribute]): Self = StObject.set(x, "variantAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantAttributesUndefined: Self = StObject.set(x, "variantAttributes", js.undefined)
    
    @scala.inline
    def setVariantAttributesVarargs(value: OrderLineItemProductVariantAttribute*): Self = StObject.set(x, "variantAttributes", js.Array(value :_*))
  }
}
