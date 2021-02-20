package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListClientsResponse extends StObject {
  
  /** The returned list of clients. */
  var clients: js.UndefOr[js.Array[Client]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListClientsRequest.pageToken field in the subsequent call to the accounts.clients.list method to retrieve the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListClientsResponse {
  
  @scala.inline
  def apply(): ListClientsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClientsResponse]
  }
  
  @scala.inline
  implicit class ListClientsResponseMutableBuilder[Self <: ListClientsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClients(value: js.Array[Client]): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientsUndefined: Self = StObject.set(x, "clients", js.undefined)
    
    @scala.inline
    def setClientsVarargs(value: Client*): Self = StObject.set(x, "clients", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
