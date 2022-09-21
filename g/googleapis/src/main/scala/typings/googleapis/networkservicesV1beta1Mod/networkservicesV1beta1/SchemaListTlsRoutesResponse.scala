package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTlsRoutesResponse extends StObject {
  
  /**
    * If there might be more results than those appearing in this response, then `next_page_token` is included. To get the next set of results, call this method again using the value of `next_page_token` as `page_token`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of TlsRoute resources.
    */
  var tlsRoutes: js.UndefOr[js.Array[SchemaTlsRoute]] = js.undefined
}
object SchemaListTlsRoutesResponse {
  
  inline def apply(): SchemaListTlsRoutesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTlsRoutesResponse]
  }
  
  extension [Self <: SchemaListTlsRoutesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTlsRoutes(value: js.Array[SchemaTlsRoute]): Self = StObject.set(x, "tlsRoutes", value.asInstanceOf[js.Any])
    
    inline def setTlsRoutesUndefined: Self = StObject.set(x, "tlsRoutes", js.undefined)
    
    inline def setTlsRoutesVarargs(value: SchemaTlsRoute*): Self = StObject.set(x, "tlsRoutes", js.Array(value*))
  }
}
