package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo extends js.Object {
  
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
  implicit class SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfoOps[Self <: SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCarrier(value: String): Self = this.set("carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrier: Self = this.set("carrier", js.undefined)
    
    @scala.inline
    def setShipmentId(value: String): Self = this.set("shipmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentId: Self = this.set("shipmentId", js.undefined)
    
    @scala.inline
    def setTrackingId(value: String): Self = this.set("trackingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackingId: Self = this.set("trackingId", js.undefined)
  }
}
