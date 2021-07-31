package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MerchantOrderReturnItem extends StObject {
  
  /** The reason that the customer chooses to return an item. */
  var customerReturnReason: js.UndefOr[CustomerReturnReason] = js.undefined
  
  /** Product level item ID. If the returned items are of the same product, they will have the same ID. */
  var itemId: js.UndefOr[String] = js.undefined
  
  /** The reason that the merchant chose to reject an item return. */
  var merchantRejectionReason: js.UndefOr[MerchantRejectionReason] = js.undefined
  
  /** The reason that merchant chooses to accept a return item. */
  var merchantReturnReason: js.UndefOr[RefundReason] = js.undefined
  
  /** Product data from the time of the order placement. */
  var product: js.UndefOr[OrderLineItemProduct] = js.undefined
  
  /** Maximum amount that can be refunded for this return item. */
  var refundableAmount: js.UndefOr[MonetaryAmount] = js.undefined
  
  /** Unit level ID for the return item. Different units of the same product will have different IDs. */
  var returnItemId: js.UndefOr[String] = js.undefined
  
  /** IDs of the return shipments that this return item belongs to. */
  var returnShipmentIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** ID of the original shipment group. Provided for shipments with invoice support. */
  var shipmentGroupId: js.UndefOr[String] = js.undefined
  
  /** ID of the shipment unit assigned by the merchant. Provided for shipments with invoice support. */
  var shipmentUnitId: js.UndefOr[String] = js.undefined
  
  /** State of the item. Acceptable values are: - "`canceled`" - "`new`" - "`received`" - "`refunded`" - "`rejected`" */
  var state: js.UndefOr[String] = js.undefined
}
object MerchantOrderReturnItem {
  
  @scala.inline
  def apply(): MerchantOrderReturnItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MerchantOrderReturnItem]
  }
  
  @scala.inline
  implicit class MerchantOrderReturnItemMutableBuilder[Self <: MerchantOrderReturnItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerReturnReason(value: CustomerReturnReason): Self = StObject.set(x, "customerReturnReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerReturnReasonUndefined: Self = StObject.set(x, "customerReturnReason", js.undefined)
    
    @scala.inline
    def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    @scala.inline
    def setMerchantRejectionReason(value: MerchantRejectionReason): Self = StObject.set(x, "merchantRejectionReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantRejectionReasonUndefined: Self = StObject.set(x, "merchantRejectionReason", js.undefined)
    
    @scala.inline
    def setMerchantReturnReason(value: RefundReason): Self = StObject.set(x, "merchantReturnReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantReturnReasonUndefined: Self = StObject.set(x, "merchantReturnReason", js.undefined)
    
    @scala.inline
    def setProduct(value: OrderLineItemProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    @scala.inline
    def setRefundableAmount(value: MonetaryAmount): Self = StObject.set(x, "refundableAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefundableAmountUndefined: Self = StObject.set(x, "refundableAmount", js.undefined)
    
    @scala.inline
    def setReturnItemId(value: String): Self = StObject.set(x, "returnItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnItemIdUndefined: Self = StObject.set(x, "returnItemId", js.undefined)
    
    @scala.inline
    def setReturnShipmentIds(value: js.Array[String]): Self = StObject.set(x, "returnShipmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnShipmentIdsUndefined: Self = StObject.set(x, "returnShipmentIds", js.undefined)
    
    @scala.inline
    def setReturnShipmentIdsVarargs(value: String*): Self = StObject.set(x, "returnShipmentIds", js.Array(value :_*))
    
    @scala.inline
    def setShipmentGroupId(value: String): Self = StObject.set(x, "shipmentGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentGroupIdUndefined: Self = StObject.set(x, "shipmentGroupId", js.undefined)
    
    @scala.inline
    def setShipmentUnitId(value: String): Self = StObject.set(x, "shipmentUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentUnitIdUndefined: Self = StObject.set(x, "shipmentUnitId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
