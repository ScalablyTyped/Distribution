package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo extends StObject {
  
  /**
    * The carrier handling the shipment. See shipments[].carrier in the  Orders
    * resource representation for a list of acceptable values.
    */
  var carrier: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the shipment. This is assigned by the merchant and is unique to
    * each shipment.
    */
  var shipmentId: js.UndefOr[String] = js.undefined
  
  /**
    * The tracking ID for the shipment.
    */
  var trackingId: js.UndefOr[String] = js.undefined
}
object SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo {
  
  inline def apply(): SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]
  }
  
  extension [Self <: SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo](x: Self) {
    
    inline def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    inline def setShipmentId(value: String): Self = StObject.set(x, "shipmentId", value.asInstanceOf[js.Any])
    
    inline def setShipmentIdUndefined: Self = StObject.set(x, "shipmentId", js.undefined)
    
    inline def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    inline def setTrackingIdUndefined: Self = StObject.set(x, "trackingId", js.undefined)
  }
}
