package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderreturnsProcessRequest extends StObject {
  
  /**
    * Option to charge the customer return shipping cost.
    */
  var fullChargeReturnShippingCost: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [required] The ID of the operation, unique across all operations for a given order return.
    */
  var operationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Refunds for original shipping fee.
    */
  var refundShippingFee: js.UndefOr[SchemaOrderreturnsRefundOperation] = js.undefined
  
  /**
    * The list of items to return.
    */
  var returnItems: js.UndefOr[js.Array[SchemaOrderreturnsReturnItem]] = js.undefined
}
object SchemaOrderreturnsProcessRequest {
  
  inline def apply(): SchemaOrderreturnsProcessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderreturnsProcessRequest]
  }
  
  extension [Self <: SchemaOrderreturnsProcessRequest](x: Self) {
    
    inline def setFullChargeReturnShippingCost(value: Boolean): Self = StObject.set(x, "fullChargeReturnShippingCost", value.asInstanceOf[js.Any])
    
    inline def setFullChargeReturnShippingCostNull: Self = StObject.set(x, "fullChargeReturnShippingCost", null)
    
    inline def setFullChargeReturnShippingCostUndefined: Self = StObject.set(x, "fullChargeReturnShippingCost", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdNull: Self = StObject.set(x, "operationId", null)
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setRefundShippingFee(value: SchemaOrderreturnsRefundOperation): Self = StObject.set(x, "refundShippingFee", value.asInstanceOf[js.Any])
    
    inline def setRefundShippingFeeUndefined: Self = StObject.set(x, "refundShippingFee", js.undefined)
    
    inline def setReturnItems(value: js.Array[SchemaOrderreturnsReturnItem]): Self = StObject.set(x, "returnItems", value.asInstanceOf[js.Any])
    
    inline def setReturnItemsUndefined: Self = StObject.set(x, "returnItems", js.undefined)
    
    inline def setReturnItemsVarargs(value: SchemaOrderreturnsReturnItem*): Self = StObject.set(x, "returnItems", js.Array(value*))
  }
}
