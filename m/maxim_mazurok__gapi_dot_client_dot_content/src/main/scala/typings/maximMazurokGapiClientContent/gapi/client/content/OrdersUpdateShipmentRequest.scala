package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersUpdateShipmentRequest extends js.Object {
  
  /** The carrier handling the shipment. Not updated if missing. See `shipments[].carrier` in the Orders resource representation for a list of acceptable values. */
  var carrier: js.UndefOr[String] = js.native
  
  /** Date on which the shipment has been delivered, in ISO 8601 format. Optional and can be provided only if `status` is `delivered`. */
  var deliveryDate: js.UndefOr[String] = js.native
  
  /** Date after which the pickup will expire, in ISO 8601 format. Required only when order is buy-online-pickup-in-store(BOPIS) and `status` is `ready for pickup`. */
  var lastPickupDate: js.UndefOr[String] = js.native
  
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.native
  
  /** Date on which the shipment has been ready for pickup, in ISO 8601 format. Optional and can be provided only if `status` is `ready for pickup`. */
  var readyPickupDate: js.UndefOr[String] = js.native
  
  /** The ID of the shipment. */
  var shipmentId: js.UndefOr[String] = js.native
  
  /** New status for the shipment. Not updated if missing. Acceptable values are: - "`delivered`" - "`undeliverable`" - "`readyForPickup`" */
  var status: js.UndefOr[String] = js.native
  
  /** The tracking ID for the shipment. Not updated if missing. */
  var trackingId: js.UndefOr[String] = js.native
  
  /** Date on which the shipment has been undeliverable, in ISO 8601 format. Optional and can be provided only if `status` is `undeliverable`. */
  var undeliveredDate: js.UndefOr[String] = js.native
}
object OrdersUpdateShipmentRequest {
  
  @scala.inline
  def apply(): OrdersUpdateShipmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersUpdateShipmentRequest]
  }
  
  @scala.inline
  implicit class OrdersUpdateShipmentRequestOps[Self <: OrdersUpdateShipmentRequest] (val x: Self) extends AnyVal {
    
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
    def setDeliveryDate(value: String): Self = this.set("deliveryDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryDate: Self = this.set("deliveryDate", js.undefined)
    
    @scala.inline
    def setLastPickupDate(value: String): Self = this.set("lastPickupDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastPickupDate: Self = this.set("lastPickupDate", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    
    @scala.inline
    def setReadyPickupDate(value: String): Self = this.set("readyPickupDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadyPickupDate: Self = this.set("readyPickupDate", js.undefined)
    
    @scala.inline
    def setShipmentId(value: String): Self = this.set("shipmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentId: Self = this.set("shipmentId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTrackingId(value: String): Self = this.set("trackingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackingId: Self = this.set("trackingId", js.undefined)
    
    @scala.inline
    def setUndeliveredDate(value: String): Self = this.set("undeliveredDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndeliveredDate: Self = this.set("undeliveredDate", js.undefined)
  }
}
