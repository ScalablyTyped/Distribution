package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#ordersListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Order collection. */
  var orders: js.UndefOr[js.Array[Order]] = js.undefined
}
object OrdersListResponse {
  
  @scala.inline
  def apply(): OrdersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersListResponse]
  }
  
  @scala.inline
  implicit class OrdersListResponseMutableBuilder[Self <: OrdersListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setOrders(value: js.Array[Order]): Self = StObject.set(x, "orders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdersUndefined: Self = StObject.set(x, "orders", js.undefined)
    
    @scala.inline
    def setOrdersVarargs(value: Order*): Self = StObject.set(x, "orders", js.Array(value :_*))
  }
}
