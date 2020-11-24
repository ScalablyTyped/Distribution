package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderShipmentScheduledDeliveryDetails extends js.Object {
  
  /** The phone number of the carrier fulfilling the delivery. The phone number is formatted as the international notation in ITU-T Recommendation E.123 (e.g., "+41 44 668 1800"). */
  var carrierPhoneNumber: js.UndefOr[String] = js.native
  
  /** The date a shipment is scheduled for delivery, in ISO 8601 format. */
  var scheduledDate: js.UndefOr[String] = js.native
}
object OrderShipmentScheduledDeliveryDetails {
  
  @scala.inline
  def apply(): OrderShipmentScheduledDeliveryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderShipmentScheduledDeliveryDetails]
  }
  
  @scala.inline
  implicit class OrderShipmentScheduledDeliveryDetailsOps[Self <: OrderShipmentScheduledDeliveryDetails] (val x: Self) extends AnyVal {
    
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
    def setCarrierPhoneNumber(value: String): Self = this.set("carrierPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrierPhoneNumber: Self = this.set("carrierPhoneNumber", js.undefined)
    
    @scala.inline
    def setScheduledDate(value: String): Self = this.set("scheduledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledDate: Self = this.set("scheduledDate", js.undefined)
  }
}
