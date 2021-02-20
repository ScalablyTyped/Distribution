package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrdersCustomBatchRequestEntry extends StObject {
  
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
  implicit class SchemaOrdersCustomBatchRequestEntryMutableBuilder[Self <: SchemaOrdersCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setCancel(value: SchemaOrdersCustomBatchRequestEntryCancel): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelLineItem(value: SchemaOrdersCustomBatchRequestEntryCancelLineItem): Self = StObject.set(x, "cancelLineItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelLineItemUndefined: Self = StObject.set(x, "cancelLineItem", js.undefined)
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setInStoreRefundLineItem(value: SchemaOrdersCustomBatchRequestEntryInStoreRefundLineItem): Self = StObject.set(x, "inStoreRefundLineItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInStoreRefundLineItemUndefined: Self = StObject.set(x, "inStoreRefundLineItem", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setMerchantOrderId(value: String): Self = StObject.set(x, "merchantOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantOrderIdUndefined: Self = StObject.set(x, "merchantOrderId", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    @scala.inline
    def setRefund(value: SchemaOrdersCustomBatchRequestEntryRefund): Self = StObject.set(x, "refund", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefundUndefined: Self = StObject.set(x, "refund", js.undefined)
    
    @scala.inline
    def setRejectReturnLineItem(value: SchemaOrdersCustomBatchRequestEntryRejectReturnLineItem): Self = StObject.set(x, "rejectReturnLineItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectReturnLineItemUndefined: Self = StObject.set(x, "rejectReturnLineItem", js.undefined)
    
    @scala.inline
    def setReturnLineItem(value: SchemaOrdersCustomBatchRequestEntryReturnLineItem): Self = StObject.set(x, "returnLineItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnLineItemUndefined: Self = StObject.set(x, "returnLineItem", js.undefined)
    
    @scala.inline
    def setReturnRefundLineItem(value: SchemaOrdersCustomBatchRequestEntryReturnRefundLineItem): Self = StObject.set(x, "returnRefundLineItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnRefundLineItemUndefined: Self = StObject.set(x, "returnRefundLineItem", js.undefined)
    
    @scala.inline
    def setSetLineItemMetadata(value: SchemaOrdersCustomBatchRequestEntrySetLineItemMetadata): Self = StObject.set(x, "setLineItemMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetLineItemMetadataUndefined: Self = StObject.set(x, "setLineItemMetadata", js.undefined)
    
    @scala.inline
    def setShipLineItems(value: SchemaOrdersCustomBatchRequestEntryShipLineItems): Self = StObject.set(x, "shipLineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipLineItemsUndefined: Self = StObject.set(x, "shipLineItems", js.undefined)
    
    @scala.inline
    def setUpdateLineItemShippingDetails(value: SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails): Self = StObject.set(x, "updateLineItemShippingDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateLineItemShippingDetailsUndefined: Self = StObject.set(x, "updateLineItemShippingDetails", js.undefined)
    
    @scala.inline
    def setUpdateShipment(value: SchemaOrdersCustomBatchRequestEntryUpdateShipment): Self = StObject.set(x, "updateShipment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateShipmentUndefined: Self = StObject.set(x, "updateShipment", js.undefined)
  }
}
