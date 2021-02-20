package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo extends StObject {
  
  /**
    * The carrier handling the shipment. See shipments[].carrier in the  Orders
    * resource representation for a list of acceptable values.
    */
  var carrier: js.UndefOr[String] = js.native
  
  /**
    * The ID of the shipment. This is assigned by the merchant and is unique to
    * each shipment.
    */
  var shipmentId: js.UndefOr[String] = js.native
  
  /**
    * The tracking ID for the shipment.
    */
  var trackingId: js.UndefOr[String] = js.native
}
object SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo {
  
  @scala.inline
  def apply(): SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]
  }
  
  @scala.inline
  implicit class SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfoMutableBuilder[Self <: SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    @scala.inline
    def setShipmentId(value: String): Self = StObject.set(x, "shipmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentIdUndefined: Self = StObject.set(x, "shipmentId", js.undefined)
    
    @scala.inline
    def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingIdUndefined: Self = StObject.set(x, "trackingId", js.undefined)
  }
}
