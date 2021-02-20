package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersGetByMerchantOrderIdResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersGetByMerchantOrderIdResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The requested order. */
  var order: js.UndefOr[Order] = js.native
}
object OrdersGetByMerchantOrderIdResponse {
  
  @scala.inline
  def apply(): OrdersGetByMerchantOrderIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersGetByMerchantOrderIdResponse]
  }
  
  @scala.inline
  implicit class OrdersGetByMerchantOrderIdResponseMutableBuilder[Self <: OrdersGetByMerchantOrderIdResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
