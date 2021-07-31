package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettlementTransactionIdentifiers extends StObject {
  
  /** The identifier of the adjustments, if it is available. */
  var adjustmentId: js.UndefOr[String] = js.undefined
  
  /** The merchant provided order ID. */
  var merchantOrderId: js.UndefOr[String] = js.undefined
  
  /** The identifier of the item. */
  var orderItemId: js.UndefOr[String] = js.undefined
  
  /** The unique ID of the settlement transaction entry. */
  var settlementEntryId: js.UndefOr[String] = js.undefined
  
  /** The shipment ids for the item. */
  var shipmentIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The Google transaction ID. */
  var transactionId: js.UndefOr[String] = js.undefined
}
object SettlementTransactionIdentifiers {
  
  @scala.inline
  def apply(): SettlementTransactionIdentifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettlementTransactionIdentifiers]
  }
  
  @scala.inline
  implicit class SettlementTransactionIdentifiersMutableBuilder[Self <: SettlementTransactionIdentifiers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustmentId(value: String): Self = StObject.set(x, "adjustmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustmentIdUndefined: Self = StObject.set(x, "adjustmentId", js.undefined)
    
    @scala.inline
    def setMerchantOrderId(value: String): Self = StObject.set(x, "merchantOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantOrderIdUndefined: Self = StObject.set(x, "merchantOrderId", js.undefined)
    
    @scala.inline
    def setOrderItemId(value: String): Self = StObject.set(x, "orderItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderItemIdUndefined: Self = StObject.set(x, "orderItemId", js.undefined)
    
    @scala.inline
    def setSettlementEntryId(value: String): Self = StObject.set(x, "settlementEntryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettlementEntryIdUndefined: Self = StObject.set(x, "settlementEntryId", js.undefined)
    
    @scala.inline
    def setShipmentIds(value: js.Array[String]): Self = StObject.set(x, "shipmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentIdsUndefined: Self = StObject.set(x, "shipmentIds", js.undefined)
    
    @scala.inline
    def setShipmentIdsVarargs(value: String*): Self = StObject.set(x, "shipmentIds", js.Array(value :_*))
    
    @scala.inline
    def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
