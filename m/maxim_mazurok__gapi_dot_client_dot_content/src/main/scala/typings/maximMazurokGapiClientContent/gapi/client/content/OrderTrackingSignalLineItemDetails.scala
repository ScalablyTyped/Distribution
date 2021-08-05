package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderTrackingSignalLineItemDetails extends StObject {
  
  /** The Global Trade Item Number. */
  var gtin: js.UndefOr[String] = js.undefined
  
  /** Required. The ID for this line item. */
  var lineItemId: js.UndefOr[String] = js.undefined
  
  /** The manufacturer part number. */
  var mpn: js.UndefOr[String] = js.undefined
  
  /** Required. The Content API REST ID of the product, in the form channel:contentLanguage:targetCountry:offerId. */
  var productId: js.UndefOr[String] = js.undefined
  
  /** Required. The quantity of the line item in the order. */
  var quantity: js.UndefOr[String] = js.undefined
}
object OrderTrackingSignalLineItemDetails {
  
  inline def apply(): OrderTrackingSignalLineItemDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderTrackingSignalLineItemDetails]
  }
  
  extension [Self <: OrderTrackingSignalLineItemDetails](x: Self) {
    
    inline def setGtin(value: String): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
    
    inline def setGtinUndefined: Self = StObject.set(x, "gtin", js.undefined)
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setMpn(value: String): Self = StObject.set(x, "mpn", value.asInstanceOf[js.Any])
    
    inline def setMpnUndefined: Self = StObject.set(x, "mpn", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
