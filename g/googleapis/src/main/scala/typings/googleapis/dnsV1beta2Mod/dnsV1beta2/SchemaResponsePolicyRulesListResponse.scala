package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResponsePolicyRulesListResponse extends StObject {
  
  var header: js.UndefOr[SchemaResponseHeader] = js.undefined
  
  /**
    * The presence of this field indicates that there exist more results following your last page of results in pagination order. To fetch them, make another list request using this value as your page token. This lets you the complete contents of even very large collections one page at a time. However, if the contents of the collection change between the first and last paginated list request, the set of all elements returned are an inconsistent view of the collection. You cannot retrieve a consistent snapshot of a collection larger than the maximum page size.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Response Policy Rule resources.
    */
  var responsePolicyRules: js.UndefOr[js.Array[SchemaResponsePolicyRule]] = js.undefined
}
object SchemaResponsePolicyRulesListResponse {
  
  inline def apply(): SchemaResponsePolicyRulesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponsePolicyRulesListResponse]
  }
  
  extension [Self <: SchemaResponsePolicyRulesListResponse](x: Self) {
    
    inline def setHeader(value: SchemaResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResponsePolicyRules(value: js.Array[SchemaResponsePolicyRule]): Self = StObject.set(x, "responsePolicyRules", value.asInstanceOf[js.Any])
    
    inline def setResponsePolicyRulesUndefined: Self = StObject.set(x, "responsePolicyRules", js.undefined)
    
    inline def setResponsePolicyRulesVarargs(value: SchemaResponsePolicyRule*): Self = StObject.set(x, "responsePolicyRules", js.Array(value*))
  }
}
