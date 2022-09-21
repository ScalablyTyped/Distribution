package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPublisherAccountsResponse extends StObject {
  
  /** Publisher that the client credentials can access. */
  var account: js.UndefOr[js.Array[PublisherAccount]] = js.undefined
  
  /** If not empty, indicates that there might be more accounts for the request; you must pass this value in a new `ListPublisherAccountsRequest`. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListPublisherAccountsResponse {
  
  inline def apply(): ListPublisherAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPublisherAccountsResponse]
  }
  
  extension [Self <: ListPublisherAccountsResponse](x: Self) {
    
    inline def setAccount(value: js.Array[PublisherAccount]): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAccountVarargs(value: PublisherAccount*): Self = StObject.set(x, "account", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
