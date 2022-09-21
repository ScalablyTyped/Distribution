package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClientsResponse extends StObject {
  
  /** The returned list of clients. */
  var clients: js.UndefOr[js.Array[Client]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListClientsRequest.pageToken field in the subsequent call to the accounts.clients.list method to retrieve the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListClientsResponse {
  
  inline def apply(): ListClientsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClientsResponse]
  }
  
  extension [Self <: ListClientsResponse](x: Self) {
    
    inline def setClients(value: js.Array[Client]): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
    
    inline def setClientsUndefined: Self = StObject.set(x, "clients", js.undefined)
    
    inline def setClientsVarargs(value: Client*): Self = StObject.set(x, "clients", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
