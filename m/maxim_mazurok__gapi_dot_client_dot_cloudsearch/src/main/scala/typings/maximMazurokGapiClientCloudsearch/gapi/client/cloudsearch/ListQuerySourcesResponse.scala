package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQuerySourcesResponse extends StObject {
  
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var sources: js.UndefOr[js.Array[QuerySource]] = js.undefined
}
object ListQuerySourcesResponse {
  
  inline def apply(): ListQuerySourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQuerySourcesResponse]
  }
  
  extension [Self <: ListQuerySourcesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSources(value: js.Array[QuerySource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: QuerySource*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
