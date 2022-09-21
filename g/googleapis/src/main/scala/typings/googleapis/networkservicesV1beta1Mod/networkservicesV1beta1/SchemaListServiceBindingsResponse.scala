package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListServiceBindingsResponse extends StObject {
  
  /**
    * If there might be more results than those appearing in this response, then `next_page_token` is included. To get the next set of results, call this method again using the value of `next_page_token` as `page_token`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of ServiceBinding resources.
    */
  var serviceBindings: js.UndefOr[js.Array[SchemaServiceBinding]] = js.undefined
}
object SchemaListServiceBindingsResponse {
  
  inline def apply(): SchemaListServiceBindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServiceBindingsResponse]
  }
  
  extension [Self <: SchemaListServiceBindingsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setServiceBindings(value: js.Array[SchemaServiceBinding]): Self = StObject.set(x, "serviceBindings", value.asInstanceOf[js.Any])
    
    inline def setServiceBindingsUndefined: Self = StObject.set(x, "serviceBindings", js.undefined)
    
    inline def setServiceBindingsVarargs(value: SchemaServiceBinding*): Self = StObject.set(x, "serviceBindings", js.Array(value*))
  }
}
