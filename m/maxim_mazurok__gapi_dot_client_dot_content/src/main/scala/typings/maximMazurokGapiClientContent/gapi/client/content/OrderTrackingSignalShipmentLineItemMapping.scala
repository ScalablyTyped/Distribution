package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderTrackingSignalShipmentLineItemMapping extends StObject {
  
  /** Required. The line item ID. */
  var lineItemId: js.UndefOr[String] = js.undefined
  
  /** The line item quantity in the shipment. */
  var quantity: js.UndefOr[String] = js.undefined
  
  /** Required. The shipment ID. This field will be hashed in returned OrderTrackingSignal creation response. */
  var shipmentId: js.UndefOr[String] = js.undefined
}
object OrderTrackingSignalShipmentLineItemMapping {
  
  inline def apply(): OrderTrackingSignalShipmentLineItemMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderTrackingSignalShipmentLineItemMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderTrackingSignalShipmentLineItemMapping] (val x: Self) extends AnyVal {
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setShipmentId(value: String): Self = StObject.set(x, "shipmentId", value.asInstanceOf[js.Any])
    
    inline def setShipmentIdUndefined: Self = StObject.set(x, "shipmentId", js.undefined)
  }
}
