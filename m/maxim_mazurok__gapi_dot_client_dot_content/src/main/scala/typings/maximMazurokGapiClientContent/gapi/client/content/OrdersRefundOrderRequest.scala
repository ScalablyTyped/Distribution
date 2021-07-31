package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersRefundOrderRequest extends StObject {
  
  /** The amount that is refunded. If this is not the first refund for the order, this should be the newly refunded amount. */
  var amount: js.UndefOr[MonetaryAmount] = js.undefined
  
  /** If true, the full order will be refunded, including shipping. If this is true, amount should not be provided and will be ignored. */
  var fullRefund: js.UndefOr[Boolean] = js.undefined
  
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.undefined
  
  /** The reason for the refund. Acceptable values are: - "`courtesyAdjustment`" - "`other`" */
  var reason: js.UndefOr[String] = js.undefined
  
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[String] = js.undefined
}
object OrdersRefundOrderRequest {
  
  @scala.inline
  def apply(): OrdersRefundOrderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersRefundOrderRequest]
  }
  
  @scala.inline
  implicit class OrdersRefundOrderRequestMutableBuilder[Self <: OrdersRefundOrderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: MonetaryAmount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setFullRefund(value: Boolean): Self = StObject.set(x, "fullRefund", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullRefundUndefined: Self = StObject.set(x, "fullRefund", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonText(value: String): Self = StObject.set(x, "reasonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonTextUndefined: Self = StObject.set(x, "reasonText", js.undefined)
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
