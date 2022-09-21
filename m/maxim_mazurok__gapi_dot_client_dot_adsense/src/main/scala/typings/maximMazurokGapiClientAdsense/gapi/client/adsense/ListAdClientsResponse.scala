package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAdClientsResponse extends StObject {
  
  /** The ad clients returned in this list response. */
  var adClients: js.UndefOr[js.Array[AdClient]] = js.undefined
  
  /** Continuation token used to page through ad clients. To retrieve the next page of the results, set the next request's "page_token" value to this. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListAdClientsResponse {
  
  inline def apply(): ListAdClientsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAdClientsResponse]
  }
  
  extension [Self <: ListAdClientsResponse](x: Self) {
    
    inline def setAdClients(value: js.Array[AdClient]): Self = StObject.set(x, "adClients", value.asInstanceOf[js.Any])
    
    inline def setAdClientsUndefined: Self = StObject.set(x, "adClients", js.undefined)
    
    inline def setAdClientsVarargs(value: AdClient*): Self = StObject.set(x, "adClients", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
