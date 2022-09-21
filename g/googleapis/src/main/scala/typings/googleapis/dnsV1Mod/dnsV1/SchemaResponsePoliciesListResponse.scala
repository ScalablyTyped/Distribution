package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResponsePoliciesListResponse extends StObject {
  
  var header: js.UndefOr[SchemaResponseHeader] = js.undefined
  
  /**
    * The presence of this field indicates that there exist more results following your last page of results in pagination order. To fetch them, make another list request using this value as your page token. This lets you the complete contents of even very large collections one page at a time. However, if the contents of the collection change between the first and last paginated list request, the set of all elements returned are an inconsistent view of the collection. You cannot retrieve a consistent snapshot of a collection larger than the maximum page size.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Response Policy resources.
    */
  var responsePolicies: js.UndefOr[js.Array[SchemaResponsePolicy]] = js.undefined
}
object SchemaResponsePoliciesListResponse {
  
  inline def apply(): SchemaResponsePoliciesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponsePoliciesListResponse]
  }
  
  extension [Self <: SchemaResponsePoliciesListResponse](x: Self) {
    
    inline def setHeader(value: SchemaResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResponsePolicies(value: js.Array[SchemaResponsePolicy]): Self = StObject.set(x, "responsePolicies", value.asInstanceOf[js.Any])
    
    inline def setResponsePoliciesUndefined: Self = StObject.set(x, "responsePolicies", js.undefined)
    
    inline def setResponsePoliciesVarargs(value: SchemaResponsePolicy*): Self = StObject.set(x, "responsePolicies", js.Array(value*))
  }
}
