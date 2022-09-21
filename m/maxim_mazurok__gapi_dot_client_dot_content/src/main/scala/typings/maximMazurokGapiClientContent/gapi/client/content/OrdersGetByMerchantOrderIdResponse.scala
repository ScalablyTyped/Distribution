package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersGetByMerchantOrderIdResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#ordersGetByMerchantOrderIdResponse`". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The requested order. */
  var order: js.UndefOr[Order] = js.undefined
}
object OrdersGetByMerchantOrderIdResponse {
  
  inline def apply(): OrdersGetByMerchantOrderIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersGetByMerchantOrderIdResponse]
  }
  
  extension [Self <: OrdersGetByMerchantOrderIdResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
