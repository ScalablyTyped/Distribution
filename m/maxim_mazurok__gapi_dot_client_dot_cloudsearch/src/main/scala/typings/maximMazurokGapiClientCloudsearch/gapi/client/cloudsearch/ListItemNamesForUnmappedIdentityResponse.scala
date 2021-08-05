package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItemNamesForUnmappedIdentityResponse extends StObject {
  
  var itemNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListItemNamesForUnmappedIdentityResponse {
  
  inline def apply(): ListItemNamesForUnmappedIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemNamesForUnmappedIdentityResponse]
  }
  
  extension [Self <: ListItemNamesForUnmappedIdentityResponse](x: Self) {
    
    inline def setItemNames(value: js.Array[String]): Self = StObject.set(x, "itemNames", value.asInstanceOf[js.Any])
    
    inline def setItemNamesUndefined: Self = StObject.set(x, "itemNames", js.undefined)
    
    inline def setItemNamesVarargs(value: String*): Self = StObject.set(x, "itemNames", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
