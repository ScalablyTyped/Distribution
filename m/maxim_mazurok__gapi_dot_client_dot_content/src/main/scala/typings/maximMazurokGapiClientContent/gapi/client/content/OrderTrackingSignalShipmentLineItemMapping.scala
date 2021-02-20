package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderTrackingSignalShipmentLineItemMapping extends StObject {
  
  /** Required. The line item ID. */
  var lineItemId: js.UndefOr[String] = js.native
  
  /** Required. The line item quantity in the shipment. */
  var quantity: js.UndefOr[String] = js.native
  
  /** Required. The shipment ID. */
  var shipmentId: js.UndefOr[String] = js.native
}
object OrderTrackingSignalShipmentLineItemMapping {
  
  @scala.inline
  def apply(): OrderTrackingSignalShipmentLineItemMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderTrackingSignalShipmentLineItemMapping]
  }
  
  @scala.inline
  implicit class OrderTrackingSignalShipmentLineItemMappingMutableBuilder[Self <: OrderTrackingSignalShipmentLineItemMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    @scala.inline
    def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setShipmentId(value: String): Self = StObject.set(x, "shipmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentIdUndefined: Self = StObject.set(x, "shipmentId", js.undefined)
  }
}
