package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderreturnsProcessRequest extends StObject {
  
  /** Option to charge the customer return shipping cost. */
  var fullChargeReturnShippingCost: js.UndefOr[Boolean] = js.undefined
  
  /** [required] The ID of the operation, unique across all operations for a given order return. */
  var operationId: js.UndefOr[String] = js.undefined
  
  /** Refunds for original shipping fee. */
  var refundShippingFee: js.UndefOr[OrderreturnsRefundOperation] = js.undefined
  
  /** The list of items to return. */
  var returnItems: js.UndefOr[js.Array[OrderreturnsReturnItem]] = js.undefined
}
object OrderreturnsProcessRequest {
  
  @scala.inline
  def apply(): OrderreturnsProcessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsProcessRequest]
  }
  
  @scala.inline
  implicit class OrderreturnsProcessRequestMutableBuilder[Self <: OrderreturnsProcessRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullChargeReturnShippingCost(value: Boolean): Self = StObject.set(x, "fullChargeReturnShippingCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullChargeReturnShippingCostUndefined: Self = StObject.set(x, "fullChargeReturnShippingCost", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setRefundShippingFee(value: OrderreturnsRefundOperation): Self = StObject.set(x, "refundShippingFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefundShippingFeeUndefined: Self = StObject.set(x, "refundShippingFee", js.undefined)
    
    @scala.inline
    def setReturnItems(value: js.Array[OrderreturnsReturnItem]): Self = StObject.set(x, "returnItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnItemsUndefined: Self = StObject.set(x, "returnItems", js.undefined)
    
    @scala.inline
    def setReturnItemsVarargs(value: OrderreturnsReturnItem*): Self = StObject.set(x, "returnItems", js.Array(value :_*))
  }
}
