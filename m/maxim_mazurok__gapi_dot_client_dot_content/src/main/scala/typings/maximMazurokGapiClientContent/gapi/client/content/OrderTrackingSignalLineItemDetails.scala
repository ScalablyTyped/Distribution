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
  
  @scala.inline
  def apply(): OrderTrackingSignalLineItemDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderTrackingSignalLineItemDetails]
  }
  
  @scala.inline
  implicit class OrderTrackingSignalLineItemDetailsMutableBuilder[Self <: OrderTrackingSignalLineItemDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGtin(value: String): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGtinUndefined: Self = StObject.set(x, "gtin", js.undefined)
    
    @scala.inline
    def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    @scala.inline
    def setMpn(value: String): Self = StObject.set(x, "mpn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpnUndefined: Self = StObject.set(x, "mpn", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
