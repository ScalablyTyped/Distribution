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
  
  inline def apply(): SettlementTransactionIdentifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettlementTransactionIdentifiers]
  }
  
  extension [Self <: SettlementTransactionIdentifiers](x: Self) {
    
    inline def setAdjustmentId(value: String): Self = StObject.set(x, "adjustmentId", value.asInstanceOf[js.Any])
    
    inline def setAdjustmentIdUndefined: Self = StObject.set(x, "adjustmentId", js.undefined)
    
    inline def setMerchantOrderId(value: String): Self = StObject.set(x, "merchantOrderId", value.asInstanceOf[js.Any])
    
    inline def setMerchantOrderIdUndefined: Self = StObject.set(x, "merchantOrderId", js.undefined)
    
    inline def setOrderItemId(value: String): Self = StObject.set(x, "orderItemId", value.asInstanceOf[js.Any])
    
    inline def setOrderItemIdUndefined: Self = StObject.set(x, "orderItemId", js.undefined)
    
    inline def setSettlementEntryId(value: String): Self = StObject.set(x, "settlementEntryId", value.asInstanceOf[js.Any])
    
    inline def setSettlementEntryIdUndefined: Self = StObject.set(x, "settlementEntryId", js.undefined)
    
    inline def setShipmentIds(value: js.Array[String]): Self = StObject.set(x, "shipmentIds", value.asInstanceOf[js.Any])
    
    inline def setShipmentIdsUndefined: Self = StObject.set(x, "shipmentIds", js.undefined)
    
    inline def setShipmentIdsVarargs(value: String*): Self = StObject.set(x, "shipmentIds", js.Array(value :_*))
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
