package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSearchApplicationsResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var searchApplications: js.UndefOr[js.Array[SearchApplication]] = js.undefined
}
object ListSearchApplicationsResponse {
  
  inline def apply(): ListSearchApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSearchApplicationsResponse]
  }
  
  extension [Self <: ListSearchApplicationsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSearchApplications(value: js.Array[SearchApplication]): Self = StObject.set(x, "searchApplications", value.asInstanceOf[js.Any])
    
    inline def setSearchApplicationsUndefined: Self = StObject.set(x, "searchApplications", js.undefined)
    
    inline def setSearchApplicationsVarargs(value: SearchApplication*): Self = StObject.set(x, "searchApplications", js.Array(value :_*))
  }
}
