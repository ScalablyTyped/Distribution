package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersCustomBatchRequestEntry extends StObject {
  
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /**
    * Required for cancel method.
    */
  var cancel: js.UndefOr[SchemaOrdersCustomBatchRequestEntryCancel] = js.undefined
  
  /**
    * Required for cancelLineItem method.
    */
  var cancelLineItem: js.UndefOr[SchemaOrdersCustomBatchRequestEntryCancelLineItem] = js.undefined
  
  /**
    * Required for inStoreReturnLineItem method.
    */
  var inStoreRefundLineItem: js.UndefOr[SchemaOrdersCustomBatchRequestEntryInStoreRefundLineItem] = js.undefined
  
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * The merchant order ID. Required for updateMerchantOrderId and
    * getByMerchantOrderId methods.
    */
  var merchantOrderId: js.UndefOr[String] = js.undefined
  
  /**
    * The method to apply.
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the operation. Unique across all operations for a given order.
    * Required for all methods beside get and getByMerchantOrderId.
    */
  var operationId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the order. Required for all methods beside
    * getByMerchantOrderId.
    */
  var orderId: js.UndefOr[String] = js.undefined
  
  /**
    * Required for refund method.
    */
  var refund: js.UndefOr[SchemaOrdersCustomBatchRequestEntryRefund] = js.undefined
  
  /**
    * Required for rejectReturnLineItem method.
    */
  var rejectReturnLineItem: js.UndefOr[SchemaOrdersCustomBatchRequestEntryRejectReturnLineItem] = js.undefined
  
  /**
    * Required for returnLineItem method.
    */
  var returnLineItem: js.UndefOr[SchemaOrdersCustomBatchRequestEntryReturnLineItem] = js.undefined
  
  /**
    * Required for returnRefundLineItem method.
    */
  var returnRefundLineItem: js.UndefOr[SchemaOrdersCustomBatchRequestEntryReturnRefundLineItem] = js.undefined
  
  /**
    * Required for setLineItemMetadata method.
    */
  var setLineItemMetadata: js.UndefOr[SchemaOrdersCustomBatchRequestEntrySetLineItemMetadata] = js.undefined
  
  /**
    * Required for shipLineItems method.
    */
  var shipLineItems: js.UndefOr[SchemaOrdersCustomBatchRequestEntryShipLineItems] = js.undefined
  
  /**
    * Required for updateLineItemShippingDate method.
    */
  var updateLineItemShippingDetails: js.UndefOr[SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails] = js.undefined
  
  /**
    * Required for updateShipment method.
    */
  var updateShipment: js.UndefOr[SchemaOrdersCustomBatchRequestEntryUpdateShipment] = js.undefined
}
object SchemaOrdersCustomBatchRequestEntry {
  
  inline def apply(): SchemaOrdersCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntry]
  }
  
  extension [Self <: SchemaOrdersCustomBatchRequestEntry](x: Self) {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setCancel(value: SchemaOrdersCustomBatchRequestEntryCancel): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelLineItem(value: SchemaOrdersCustomBatchRequestEntryCancelLineItem): Self = StObject.set(x, "cancelLineItem", value.asInstanceOf[js.Any])
    
    inline def setCancelLineItemUndefined: Self = StObject.set(x, "cancelLineItem", js.undefined)
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setInStoreRefundLineItem(value: SchemaOrdersCustomBatchRequestEntryInStoreRefundLineItem): Self = StObject.set(x, "inStoreRefundLineItem", value.asInstanceOf[js.Any])
    
    inline def setInStoreRefundLineItemUndefined: Self = StObject.set(x, "inStoreRefundLineItem", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setMerchantOrderId(value: String): Self = StObject.set(x, "merchantOrderId", value.asInstanceOf[js.Any])
    
    inline def setMerchantOrderIdUndefined: Self = StObject.set(x, "merchantOrderId", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    inline def setRefund(value: SchemaOrdersCustomBatchRequestEntryRefund): Self = StObject.set(x, "refund", value.asInstanceOf[js.Any])
    
    inline def setRefundUndefined: Self = StObject.set(x, "refund", js.undefined)
    
    inline def setRejectReturnLineItem(value: SchemaOrdersCustomBatchRequestEntryRejectReturnLineItem): Self = StObject.set(x, "rejectReturnLineItem", value.asInstanceOf[js.Any])
    
    inline def setRejectReturnLineItemUndefined: Self = StObject.set(x, "rejectReturnLineItem", js.undefined)
    
    inline def setReturnLineItem(value: SchemaOrdersCustomBatchRequestEntryReturnLineItem): Self = StObject.set(x, "returnLineItem", value.asInstanceOf[js.Any])
    
    inline def setReturnLineItemUndefined: Self = StObject.set(x, "returnLineItem", js.undefined)
    
    inline def setReturnRefundLineItem(value: SchemaOrdersCustomBatchRequestEntryReturnRefundLineItem): Self = StObject.set(x, "returnRefundLineItem", value.asInstanceOf[js.Any])
    
    inline def setReturnRefundLineItemUndefined: Self = StObject.set(x, "returnRefundLineItem", js.undefined)
    
    inline def setSetLineItemMetadata(value: SchemaOrdersCustomBatchRequestEntrySetLineItemMetadata): Self = StObject.set(x, "setLineItemMetadata", value.asInstanceOf[js.Any])
    
    inline def setSetLineItemMetadataUndefined: Self = StObject.set(x, "setLineItemMetadata", js.undefined)
    
    inline def setShipLineItems(value: SchemaOrdersCustomBatchRequestEntryShipLineItems): Self = StObject.set(x, "shipLineItems", value.asInstanceOf[js.Any])
    
    inline def setShipLineItemsUndefined: Self = StObject.set(x, "shipLineItems", js.undefined)
    
    inline def setUpdateLineItemShippingDetails(value: SchemaOrdersCustomBatchRequestEntryUpdateLineItemShippingDetails): Self = StObject.set(x, "updateLineItemShippingDetails", value.asInstanceOf[js.Any])
    
    inline def setUpdateLineItemShippingDetailsUndefined: Self = StObject.set(x, "updateLineItemShippingDetails", js.undefined)
    
    inline def setUpdateShipment(value: SchemaOrdersCustomBatchRequestEntryUpdateShipment): Self = StObject.set(x, "updateShipment", value.asInstanceOf[js.Any])
    
    inline def setUpdateShipmentUndefined: Self = StObject.set(x, "updateShipment", js.undefined)
  }
}
