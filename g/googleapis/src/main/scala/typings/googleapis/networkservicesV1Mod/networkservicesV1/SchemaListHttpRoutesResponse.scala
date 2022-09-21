package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListHttpRoutesResponse extends StObject {
  
  /**
    * List of HttpRoute resources.
    */
  var httpRoutes: js.UndefOr[js.Array[SchemaHttpRoute]] = js.undefined
  
  /**
    * If there might be more results than those appearing in this response, then `next_page_token` is included. To get the next set of results, call this method again using the value of `next_page_token` as `page_token`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListHttpRoutesResponse {
  
  inline def apply(): SchemaListHttpRoutesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListHttpRoutesResponse]
  }
  
  extension [Self <: SchemaListHttpRoutesResponse](x: Self) {
    
    inline def setHttpRoutes(value: js.Array[SchemaHttpRoute]): Self = StObject.set(x, "httpRoutes", value.asInstanceOf[js.Any])
    
    inline def setHttpRoutesUndefined: Self = StObject.set(x, "httpRoutes", js.undefined)
    
    inline def setHttpRoutesVarargs(value: SchemaHttpRoute*): Self = StObject.set(x, "httpRoutes", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
