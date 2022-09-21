package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersGetByMerchantOrderIdResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#ordersGetByMerchantOrderIdResponse`".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The requested order.
    */
  var order: js.UndefOr[SchemaOrder] = js.undefined
}
object SchemaOrdersGetByMerchantOrderIdResponse {
  
  inline def apply(): SchemaOrdersGetByMerchantOrderIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersGetByMerchantOrderIdResponse]
  }
  
  extension [Self <: SchemaOrdersGetByMerchantOrderIdResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOrder(value: SchemaOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
