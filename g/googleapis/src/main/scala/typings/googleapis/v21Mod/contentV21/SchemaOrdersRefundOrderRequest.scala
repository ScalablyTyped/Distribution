package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersRefundOrderRequest extends StObject {
  
  /**
    * The amount that is refunded. If this is not the first refund for the order, this should be the newly refunded amount.
    */
  var amount: js.UndefOr[SchemaMonetaryAmount] = js.undefined
  
  /**
    * If true, the full order will be refunded, including shipping. If this is true, amount shouldn't be provided and will be ignored.
    */
  var fullRefund: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reason for the refund. Acceptable values are: - "`courtesyAdjustment`" - "`other`"
    */
  var reason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrdersRefundOrderRequest {
  
  inline def apply(): SchemaOrdersRefundOrderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersRefundOrderRequest]
  }
  
  extension [Self <: SchemaOrdersRefundOrderRequest](x: Self) {
    
    inline def setAmount(value: SchemaMonetaryAmount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setFullRefund(value: Boolean): Self = StObject.set(x, "fullRefund", value.asInstanceOf[js.Any])
    
    inline def setFullRefundNull: Self = StObject.set(x, "fullRefund", null)
    
    inline def setFullRefundUndefined: Self = StObject.set(x, "fullRefund", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdNull: Self = StObject.set(x, "operationId", null)
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonText(value: String): Self = StObject.set(x, "reasonText", value.asInstanceOf[js.Any])
    
    inline def setReasonTextNull: Self = StObject.set(x, "reasonText", null)
    
    inline def setReasonTextUndefined: Self = StObject.set(x, "reasonText", js.undefined)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
