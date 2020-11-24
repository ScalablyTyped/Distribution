package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettlementTransactionIdentifiers extends js.Object {
  
  /** The identifier of the adjustments, if it is available. */
  var adjustmentId: js.UndefOr[String] = js.native
  
  /** The merchant provided order ID. */
  var merchantOrderId: js.UndefOr[String] = js.native
  
  /** The identifier of the item. */
  var orderItemId: js.UndefOr[String] = js.native
  
  /** The unique ID of the settlement transaction entry. */
  var settlementEntryId: js.UndefOr[String] = js.native
  
  /** The shipment ids for the item. */
  var shipmentIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The Google transaction ID. */
  var transactionId: js.UndefOr[String] = js.native
}
object SettlementTransactionIdentifiers {
  
  @scala.inline
  def apply(): SettlementTransactionIdentifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettlementTransactionIdentifiers]
  }
  
  @scala.inline
  implicit class SettlementTransactionIdentifiersOps[Self <: SettlementTransactionIdentifiers] (val x: Self) extends AnyVal {
    
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
    def setAdjustmentId(value: String): Self = this.set("adjustmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustmentId: Self = this.set("adjustmentId", js.undefined)
    
    @scala.inline
    def setMerchantOrderId(value: String): Self = this.set("merchantOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantOrderId: Self = this.set("merchantOrderId", js.undefined)
    
    @scala.inline
    def setOrderItemId(value: String): Self = this.set("orderItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderItemId: Self = this.set("orderItemId", js.undefined)
    
    @scala.inline
    def setSettlementEntryId(value: String): Self = this.set("settlementEntryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettlementEntryId: Self = this.set("settlementEntryId", js.undefined)
    
    @scala.inline
    def setShipmentIdsVarargs(value: String*): Self = this.set("shipmentIds", js.Array(value :_*))
    
    @scala.inline
    def setShipmentIds(value: js.Array[String]): Self = this.set("shipmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentIds: Self = this.set("shipmentIds", js.undefined)
    
    @scala.inline
    def setTransactionId(value: String): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionId: Self = this.set("transactionId", js.undefined)
  }
}
