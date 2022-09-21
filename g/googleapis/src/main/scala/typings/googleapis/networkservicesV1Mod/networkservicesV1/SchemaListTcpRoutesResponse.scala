package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTcpRoutesResponse extends StObject {
  
  /**
    * If there might be more results than those appearing in this response, then `next_page_token` is included. To get the next set of results, call this method again using the value of `next_page_token` as `page_token`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of TcpRoute resources.
    */
  var tcpRoutes: js.UndefOr[js.Array[SchemaTcpRoute]] = js.undefined
}
object SchemaListTcpRoutesResponse {
  
  inline def apply(): SchemaListTcpRoutesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTcpRoutesResponse]
  }
  
  extension [Self <: SchemaListTcpRoutesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTcpRoutes(value: js.Array[SchemaTcpRoute]): Self = StObject.set(x, "tcpRoutes", value.asInstanceOf[js.Any])
    
    inline def setTcpRoutesUndefined: Self = StObject.set(x, "tcpRoutes", js.undefined)
    
    inline def setTcpRoutesVarargs(value: SchemaTcpRoute*): Self = StObject.set(x, "tcpRoutes", js.Array(value*))
  }
}
