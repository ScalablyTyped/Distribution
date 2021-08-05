package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Order document List Response
  */
trait SchemaOrderDocumentsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#orderDocumentsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Order document collection
    */
  var orderDocuments: js.UndefOr[js.Array[SchemaOrderDocument]] = js.undefined
}
object SchemaOrderDocumentsListResponse {
  
  inline def apply(): SchemaOrderDocumentsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderDocumentsListResponse]
  }
  
  extension [Self <: SchemaOrderDocumentsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOrderDocuments(value: js.Array[SchemaOrderDocument]): Self = StObject.set(x, "orderDocuments", value.asInstanceOf[js.Any])
    
    inline def setOrderDocumentsUndefined: Self = StObject.set(x, "orderDocuments", js.undefined)
    
    inline def setOrderDocumentsVarargs(value: SchemaOrderDocument*): Self = StObject.set(x, "orderDocuments", js.Array(value :_*))
  }
}
