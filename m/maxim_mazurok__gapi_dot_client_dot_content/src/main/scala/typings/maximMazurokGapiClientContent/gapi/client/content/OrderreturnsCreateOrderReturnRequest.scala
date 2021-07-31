package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderreturnsCreateOrderReturnRequest extends StObject {
  
  /** The list of line items to return. */
  var lineItems: js.UndefOr[js.Array[OrderreturnsLineItem]] = js.undefined
  
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.undefined
  
  /** The ID of the order. */
  var orderId: js.UndefOr[String] = js.undefined
  
  /** The way of the package being returned. */
  var returnMethodType: js.UndefOr[String] = js.undefined
}
object OrderreturnsCreateOrderReturnRequest {
  
  @scala.inline
  def apply(): OrderreturnsCreateOrderReturnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsCreateOrderReturnRequest]
  }
  
  @scala.inline
  implicit class OrderreturnsCreateOrderReturnRequestMutableBuilder[Self <: OrderreturnsCreateOrderReturnRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineItems(value: js.Array[OrderreturnsLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: OrderreturnsLineItem*): Self = StObject.set(x, "lineItems", js.Array(value :_*))
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    @scala.inline
    def setReturnMethodType(value: String): Self = StObject.set(x, "returnMethodType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnMethodTypeUndefined: Self = StObject.set(x, "returnMethodType", js.undefined)
  }
}
