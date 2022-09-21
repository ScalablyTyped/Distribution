package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderTrackingSignalLineItemDetails extends StObject {
  
  /** Brand of the product. */
  var brand: js.UndefOr[String] = js.undefined
  
  /** The Global Trade Item Number. */
  var gtin: js.UndefOr[String] = js.undefined
  
  /** Required. The ID for this line item. */
  var lineItemId: js.UndefOr[String] = js.undefined
  
  /** The manufacturer part number. */
  var mpn: js.UndefOr[String] = js.undefined
  
  /** Plain text description of this product (deprecated: Please use product_title instead). */
  var productDescription: js.UndefOr[String] = js.undefined
  
  /** Required. The Content API REST ID of the product, in the form channel:contentLanguage:targetCountry:offerId. */
  var productId: js.UndefOr[String] = js.undefined
  
  /** Plain text title of this product. */
  var productTitle: js.UndefOr[String] = js.undefined
  
  /** The quantity of the line item in the order. */
  var quantity: js.UndefOr[String] = js.undefined
  
  /** Merchant SKU for this item (deprecated). */
  var sku: js.UndefOr[String] = js.undefined
  
  /** Universal product code for this item (deprecated: Please use GTIN instead). */
  var upc: js.UndefOr[String] = js.undefined
}
object OrderTrackingSignalLineItemDetails {
  
  inline def apply(): OrderTrackingSignalLineItemDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderTrackingSignalLineItemDetails]
  }
  
  extension [Self <: OrderTrackingSignalLineItemDetails](x: Self) {
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setGtin(value: String): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
    
    inline def setGtinUndefined: Self = StObject.set(x, "gtin", js.undefined)
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setMpn(value: String): Self = StObject.set(x, "mpn", value.asInstanceOf[js.Any])
    
    inline def setMpnUndefined: Self = StObject.set(x, "mpn", js.undefined)
    
    inline def setProductDescription(value: String): Self = StObject.set(x, "productDescription", value.asInstanceOf[js.Any])
    
    inline def setProductDescriptionUndefined: Self = StObject.set(x, "productDescription", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setProductTitle(value: String): Self = StObject.set(x, "productTitle", value.asInstanceOf[js.Any])
    
    inline def setProductTitleUndefined: Self = StObject.set(x, "productTitle", js.undefined)
    
    inline def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    inline def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
    
    inline def setUpc(value: String): Self = StObject.set(x, "upc", value.asInstanceOf[js.Any])
    
    inline def setUpcUndefined: Self = StObject.set(x, "upc", js.undefined)
  }
}
