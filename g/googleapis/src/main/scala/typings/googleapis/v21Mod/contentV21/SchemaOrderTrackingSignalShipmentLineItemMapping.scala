package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderTrackingSignalShipmentLineItemMapping extends StObject {
  
  /**
    * Required. The line item ID.
    */
  var lineItemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The line item quantity in the shipment.
    */
  var quantity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The shipment ID. This field will be hashed in returned OrderTrackingSignal creation response.
    */
  var shipmentId: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderTrackingSignalShipmentLineItemMapping {
  
  inline def apply(): SchemaOrderTrackingSignalShipmentLineItemMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderTrackingSignalShipmentLineItemMapping]
  }
  
  extension [Self <: SchemaOrderTrackingSignalShipmentLineItemMapping](x: Self) {
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdNull: Self = StObject.set(x, "lineItemId", null)
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityNull: Self = StObject.set(x, "quantity", null)
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setShipmentId(value: String): Self = StObject.set(x, "shipmentId", value.asInstanceOf[js.Any])
    
    inline def setShipmentIdNull: Self = StObject.set(x, "shipmentId", null)
    
    inline def setShipmentIdUndefined: Self = StObject.set(x, "shipmentId", js.undefined)
  }
}
