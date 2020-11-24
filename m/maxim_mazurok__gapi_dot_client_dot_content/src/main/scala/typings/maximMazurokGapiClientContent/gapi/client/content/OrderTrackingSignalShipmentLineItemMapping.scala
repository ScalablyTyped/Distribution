package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderTrackingSignalShipmentLineItemMapping extends js.Object {
  
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
  implicit class OrderTrackingSignalShipmentLineItemMappingOps[Self <: OrderTrackingSignalShipmentLineItemMapping] (val x: Self) extends AnyVal {
    
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
    def setLineItemId(value: String): Self = this.set("lineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItemId: Self = this.set("lineItemId", js.undefined)
    
    @scala.inline
    def setQuantity(value: String): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setShipmentId(value: String): Self = this.set("shipmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentId: Self = this.set("shipmentId", js.undefined)
  }
}
