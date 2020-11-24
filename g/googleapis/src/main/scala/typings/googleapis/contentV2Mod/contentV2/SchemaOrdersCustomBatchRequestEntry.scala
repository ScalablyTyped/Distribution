package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrdersCustomBatchRequestEntry extends js.Object {
  
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  
  /**
    * Required for cancel method.
    */
  var cancel: js.UndefOr[SchemaOrdersCustomBatchRequestEntryCancel] = js.native
  
  /**
    * Required for cancelLineItem method.
    */
  var cancelLineItem: js.UndefOr[SchemaOrdersCustomBatchRequestEntryCancelLineItem] = js.native
  
  /**
    * Required for inStoreReturnLineItem method.
    */
  var inStoreRefundLineItem: js.UndefOr[SchemaOrdersCustomBatchRequestEntryInStoreRefundLineItem] = js.native
  
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  
  /**
    * The merchant order ID. Required for updateMerchantOrderId and
    * getByMerchantOrderId methods.
    */
  var merchantOrderId: js.UndefOr[String] = js.native
  
  /**
    * The method to apply.
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * The ID of the operation. Unique across all operations for a given order.
    * Required for all methods beside get and getByMerchantOrderId.
    */
  var operationId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the order. Required for all methods beside
    * getByMerchantOrderId.
    */
  var orderId: js.UndefOr[String] = js.native
  
  /**
    * Required for refund method.
    */
  var refund: js.UndefOr[SchemaOrdersCustomBatchRequestEntryRefund] = js.native
  
  /**
    * Required for rejectReturnLineItem method.
    */
  var rejectReturnLineItem: js.UndefOr[SchemaOrdersCustomBatchRequestEntryRejectReturnLineItem] = js.native
  
  /**
    * Required for returnLineItem method.
    */
  var returnLineItem: js.UndefOr[SchemaOrdersCustomBatchRequestEntryReturnLineItem] = js.native
  
  /**
    * Required for returnRefundLineItem method.
    */
  var returnRefundLineItem: js.UndefOr[SchemaOrdersCustomBatchRequestEntryReturnRefundLineItem] = js.native
  
  /**
    * Required for setLineItemMetadata method.
    */
  var setLineItemMetadata: js.UndefOr[SchemaOrdersCustomBatchRequestEntrySetLineItemMetadata] = js.native
  
  /**
    * Required for shipLineItems method.
    */
  var shipLineItems: js.UndefOr[SchemaOrdersCustomBatchRequestEntryShipLineItems] = js.native
  
  /**
    * Required for updateLineItemShippingDate method.
    */
  var updateLineItemShippingDetails: js.UndefOr[SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails] = js.native
  
  /**
    * Required for updateShipment method.
    */
  var updateShipment: js.UndefOr[SchemaOrdersCustomBatchRequestEntryUpdateShipment] = js.native
}
object SchemaOrdersCustomBatchRequestEntry {
  
  @scala.inline
  def apply(): SchemaOrdersCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class SchemaOrdersCustomBatchRequestEntryOps[Self <: SchemaOrdersCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
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
    def setBatchId(value: Double): Self = this.set("batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    
    @scala.inline
    def setCancel(value: SchemaOrdersCustomBatchRequestEntryCancel): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setCancelLineItem(value: SchemaOrdersCustomBatchRequestEntryCancelLineItem): Self = this.set("cancelLineItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelLineItem: Self = this.set("cancelLineItem", js.undefined)
    
    @scala.inline
    def setInStoreRefundLineItem(value: SchemaOrdersCustomBatchRequestEntryInStoreRefundLineItem): Self = this.set("inStoreRefundLineItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInStoreRefundLineItem: Self = this.set("inStoreRefundLineItem", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    
    @scala.inline
    def setMerchantOrderId(value: String): Self = this.set("merchantOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantOrderId: Self = this.set("merchantOrderId", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    
    @scala.inline
    def setRefund(value: SchemaOrdersCustomBatchRequestEntryRefund): Self = this.set("refund", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefund: Self = this.set("refund", js.undefined)
    
    @scala.inline
    def setRejectReturnLineItem(value: SchemaOrdersCustomBatchRequestEntryRejectReturnLineItem): Self = this.set("rejectReturnLineItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectReturnLineItem: Self = this.set("rejectReturnLineItem", js.undefined)
    
    @scala.inline
    def setReturnLineItem(value: SchemaOrdersCustomBatchRequestEntryReturnLineItem): Self = this.set("returnLineItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnLineItem: Self = this.set("returnLineItem", js.undefined)
    
    @scala.inline
    def setReturnRefundLineItem(value: SchemaOrdersCustomBatchRequestEntryReturnRefundLineItem): Self = this.set("returnRefundLineItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnRefundLineItem: Self = this.set("returnRefundLineItem", js.undefined)
    
    @scala.inline
    def setSetLineItemMetadata(value: SchemaOrdersCustomBatchRequestEntrySetLineItemMetadata): Self = this.set("setLineItemMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetLineItemMetadata: Self = this.set("setLineItemMetadata", js.undefined)
    
    @scala.inline
    def setShipLineItems(value: SchemaOrdersCustomBatchRequestEntryShipLineItems): Self = this.set("shipLineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipLineItems: Self = this.set("shipLineItems", js.undefined)
    
    @scala.inline
    def setUpdateLineItemShippingDetails(value: SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails): Self = this.set("updateLineItemShippingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateLineItemShippingDetails: Self = this.set("updateLineItemShippingDetails", js.undefined)
    
    @scala.inline
    def setUpdateShipment(value: SchemaOrdersCustomBatchRequestEntryUpdateShipment): Self = this.set("updateShipment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateShipment: Self = this.set("updateShipment", js.undefined)
  }
}
