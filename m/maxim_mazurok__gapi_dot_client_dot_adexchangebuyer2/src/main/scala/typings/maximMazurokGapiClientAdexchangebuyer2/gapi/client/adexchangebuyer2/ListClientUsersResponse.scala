package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClientUsersResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListClientUsersRequest.pageToken field in the subsequent call to the clients.invitations.list method to retrieve
    * the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The returned list of client users. */
  var users: js.UndefOr[js.Array[ClientUser]] = js.undefined
}
object ListClientUsersResponse {
  
  inline def apply(): ListClientUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClientUsersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListClientUsersResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUsers(value: js.Array[ClientUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: ClientUser*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
