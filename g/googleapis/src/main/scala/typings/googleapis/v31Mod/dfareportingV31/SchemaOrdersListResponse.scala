package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Order List Response
  */
trait SchemaOrdersListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#ordersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Order collection.
    */
  var orders: js.UndefOr[js.Array[SchemaOrder]] = js.undefined
}
object SchemaOrdersListResponse {
  
  inline def apply(): SchemaOrdersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersListResponse]
  }
  
  extension [Self <: SchemaOrdersListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOrders(value: js.Array[SchemaOrder]): Self = StObject.set(x, "orders", value.asInstanceOf[js.Any])
    
    inline def setOrdersUndefined: Self = StObject.set(x, "orders", js.undefined)
    
    inline def setOrdersVarargs(value: SchemaOrder*): Self = StObject.set(x, "orders", js.Array(value :_*))
  }
}
