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
  
  inline def apply(): OrderreturnsCreateOrderReturnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsCreateOrderReturnRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderreturnsCreateOrderReturnRequest] (val x: Self) extends AnyVal {
    
    inline def setLineItems(value: js.Array[OrderreturnsLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: OrderreturnsLineItem*): Self = StObject.set(x, "lineItems", js.Array(value*))
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    inline def setReturnMethodType(value: String): Self = StObject.set(x, "returnMethodType", value.asInstanceOf[js.Any])
    
    inline def setReturnMethodTypeUndefined: Self = StObject.set(x, "returnMethodType", js.undefined)
  }
}
