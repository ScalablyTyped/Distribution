package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersUpdateMerchantOrderIdRequest extends StObject {
  
  /**
    * The merchant order id to be assigned to the order. Must be unique per
    * merchant.
    */
  var merchantOrderId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String] = js.undefined
}
object SchemaOrdersUpdateMerchantOrderIdRequest {
  
  inline def apply(): SchemaOrdersUpdateMerchantOrderIdRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersUpdateMerchantOrderIdRequest]
  }
  
  extension [Self <: SchemaOrdersUpdateMerchantOrderIdRequest](x: Self) {
    
    inline def setMerchantOrderId(value: String): Self = StObject.set(x, "merchantOrderId", value.asInstanceOf[js.Any])
    
    inline def setMerchantOrderIdUndefined: Self = StObject.set(x, "merchantOrderId", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
  }
}
