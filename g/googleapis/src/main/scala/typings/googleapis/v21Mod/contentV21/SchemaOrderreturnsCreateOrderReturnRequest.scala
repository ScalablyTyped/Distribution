package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderreturnsCreateOrderReturnRequest extends StObject {
  
  /**
    * The list of line items to return.
    */
  var lineItems: js.UndefOr[js.Array[SchemaOrderreturnsLineItem]] = js.undefined
  
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the order.
    */
  var orderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The way of the package being returned.
    */
  var returnMethodType: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderreturnsCreateOrderReturnRequest {
  
  inline def apply(): SchemaOrderreturnsCreateOrderReturnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderreturnsCreateOrderReturnRequest]
  }
  
  extension [Self <: SchemaOrderreturnsCreateOrderReturnRequest](x: Self) {
    
    inline def setLineItems(value: js.Array[SchemaOrderreturnsLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: SchemaOrderreturnsLineItem*): Self = StObject.set(x, "lineItems", js.Array(value*))
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdNull: Self = StObject.set(x, "operationId", null)
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdNull: Self = StObject.set(x, "orderId", null)
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    inline def setReturnMethodType(value: String): Self = StObject.set(x, "returnMethodType", value.asInstanceOf[js.Any])
    
    inline def setReturnMethodTypeNull: Self = StObject.set(x, "returnMethodType", null)
    
    inline def setReturnMethodTypeUndefined: Self = StObject.set(x, "returnMethodType", js.undefined)
  }
}
