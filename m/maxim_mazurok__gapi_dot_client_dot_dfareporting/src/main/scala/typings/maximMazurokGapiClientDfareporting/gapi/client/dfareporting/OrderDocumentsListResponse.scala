package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderDocumentsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#orderDocumentsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Order document collection */
  var orderDocuments: js.UndefOr[js.Array[OrderDocument]] = js.undefined
}
object OrderDocumentsListResponse {
  
  inline def apply(): OrderDocumentsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderDocumentsListResponse]
  }
  
  extension [Self <: OrderDocumentsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOrderDocuments(value: js.Array[OrderDocument]): Self = StObject.set(x, "orderDocuments", value.asInstanceOf[js.Any])
    
    inline def setOrderDocumentsUndefined: Self = StObject.set(x, "orderDocuments", js.undefined)
    
    inline def setOrderDocumentsVarargs(value: OrderDocument*): Self = StObject.set(x, "orderDocuments", js.Array(value :_*))
  }
}
