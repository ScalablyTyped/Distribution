package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderreturnsRefundOperation extends StObject {
  
  /**
    * If true, the item will be fully refunded. Allowed only when payment_type is FOP. Merchant can choose this refund option to indicate the full remaining amount of corresponding object to be refunded to the customer through FOP.
    */
  var fullRefund: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If this is set, the item will be partially refunded. Merchant can choose this refund option to specify the customized amount that to be refunded to the customer.
    */
  var partialRefund: js.UndefOr[SchemaOrderreturnsPartialRefund] = js.undefined
  
  /**
    * The payment way of issuing refund. Default value is ORIGINAL_FOP if not set.
    */
  var paymentType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Code of the refund reason.
    */
  var returnRefundReason: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderreturnsRefundOperation {
  
  inline def apply(): SchemaOrderreturnsRefundOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderreturnsRefundOperation]
  }
  
  extension [Self <: SchemaOrderreturnsRefundOperation](x: Self) {
    
    inline def setFullRefund(value: Boolean): Self = StObject.set(x, "fullRefund", value.asInstanceOf[js.Any])
    
    inline def setFullRefundNull: Self = StObject.set(x, "fullRefund", null)
    
    inline def setFullRefundUndefined: Self = StObject.set(x, "fullRefund", js.undefined)
    
    inline def setPartialRefund(value: SchemaOrderreturnsPartialRefund): Self = StObject.set(x, "partialRefund", value.asInstanceOf[js.Any])
    
    inline def setPartialRefundUndefined: Self = StObject.set(x, "partialRefund", js.undefined)
    
    inline def setPaymentType(value: String): Self = StObject.set(x, "paymentType", value.asInstanceOf[js.Any])
    
    inline def setPaymentTypeNull: Self = StObject.set(x, "paymentType", null)
    
    inline def setPaymentTypeUndefined: Self = StObject.set(x, "paymentType", js.undefined)
    
    inline def setReasonText(value: String): Self = StObject.set(x, "reasonText", value.asInstanceOf[js.Any])
    
    inline def setReasonTextNull: Self = StObject.set(x, "reasonText", null)
    
    inline def setReasonTextUndefined: Self = StObject.set(x, "reasonText", js.undefined)
    
    inline def setReturnRefundReason(value: String): Self = StObject.set(x, "returnRefundReason", value.asInstanceOf[js.Any])
    
    inline def setReturnRefundReasonNull: Self = StObject.set(x, "returnRefundReason", null)
    
    inline def setReturnRefundReasonUndefined: Self = StObject.set(x, "returnRefundReason", js.undefined)
  }
}
