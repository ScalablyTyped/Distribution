package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersCreateTestOrderResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "content#ordersCreateTestOrderResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the newly created test order.
    */
  var orderId: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrdersCreateTestOrderResponse {
  
  inline def apply(): SchemaOrdersCreateTestOrderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCreateTestOrderResponse]
  }
  
  extension [Self <: SchemaOrdersCreateTestOrderResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdNull: Self = StObject.set(x, "orderId", null)
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
  }
}
