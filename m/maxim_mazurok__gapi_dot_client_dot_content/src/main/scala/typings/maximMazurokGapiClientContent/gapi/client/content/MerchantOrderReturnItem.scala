package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MerchantOrderReturnItem extends js.Object {
  
  /** The reason that the customer chooses to return an item. */
  var customerReturnReason: js.UndefOr[CustomerReturnReason] = js.native
  
  /** Product level item ID. If the returned items are of the same product, they will have the same ID. */
  var itemId: js.UndefOr[String] = js.native
  
  /** The reason that the merchant chose to reject an item return. */
  var merchantRejectionReason: js.UndefOr[MerchantRejectionReason] = js.native
  
  /** The reason that merchant chooses to accept a return item. */
  var merchantReturnReason: js.UndefOr[RefundReason] = js.native
  
  /** Product data from the time of the order placement. */
  var product: js.UndefOr[OrderLineItemProduct] = js.native
  
  /** Maximum amount that can be refunded for this return item. */
  var refundableAmount: js.UndefOr[MonetaryAmount] = js.native
  
  /** Unit level ID for the return item. Different units of the same product will have different IDs. */
  var returnItemId: js.UndefOr[String] = js.native
  
  /** IDs of the return shipments that this return item belongs to. */
  var returnShipmentIds: js.UndefOr[js.Array[String]] = js.native
  
  /** ID of the original shipment group. Provided for shipments with invoice support. */
  var shipmentGroupId: js.UndefOr[String] = js.native
  
  /** ID of the shipment unit assigned by the merchant. Provided for shipments with invoice support. */
  var shipmentUnitId: js.UndefOr[String] = js.native
  
  /** State of the item. Acceptable values are: - "`canceled`" - "`new`" - "`received`" - "`refunded`" - "`rejected`" */
  var state: js.UndefOr[String] = js.native
}
object MerchantOrderReturnItem {
  
  @scala.inline
  def apply(): MerchantOrderReturnItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MerchantOrderReturnItem]
  }
  
  @scala.inline
  implicit class MerchantOrderReturnItemOps[Self <: MerchantOrderReturnItem] (val x: Self) extends AnyVal {
    
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
    def setCustomerReturnReason(value: CustomerReturnReason): Self = this.set("customerReturnReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerReturnReason: Self = this.set("customerReturnReason", js.undefined)
    
    @scala.inline
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    
    @scala.inline
    def setMerchantRejectionReason(value: MerchantRejectionReason): Self = this.set("merchantRejectionReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantRejectionReason: Self = this.set("merchantRejectionReason", js.undefined)
    
    @scala.inline
    def setMerchantReturnReason(value: RefundReason): Self = this.set("merchantReturnReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantReturnReason: Self = this.set("merchantReturnReason", js.undefined)
    
    @scala.inline
    def setProduct(value: OrderLineItemProduct): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setRefundableAmount(value: MonetaryAmount): Self = this.set("refundableAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefundableAmount: Self = this.set("refundableAmount", js.undefined)
    
    @scala.inline
    def setReturnItemId(value: String): Self = this.set("returnItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnItemId: Self = this.set("returnItemId", js.undefined)
    
    @scala.inline
    def setReturnShipmentIdsVarargs(value: String*): Self = this.set("returnShipmentIds", js.Array(value :_*))
    
    @scala.inline
    def setReturnShipmentIds(value: js.Array[String]): Self = this.set("returnShipmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnShipmentIds: Self = this.set("returnShipmentIds", js.undefined)
    
    @scala.inline
    def setShipmentGroupId(value: String): Self = this.set("shipmentGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentGroupId: Self = this.set("shipmentGroupId", js.undefined)
    
    @scala.inline
    def setShipmentUnitId(value: String): Self = this.set("shipmentUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentUnitId: Self = this.set("shipmentUnitId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
