package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListClientsResponse extends StObject {
  
  /**
    * The returned list of clients.
    */
  var clients: js.UndefOr[js.Array[SchemaClient]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListClientsRequest.pageToken field in the subsequent call to the accounts.clients.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListClientsResponse {
  
  inline def apply(): SchemaListClientsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListClientsResponse]
  }
  
  extension [Self <: SchemaListClientsResponse](x: Self) {
    
    inline def setClients(value: js.Array[SchemaClient]): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
    
    inline def setClientsUndefined: Self = StObject.set(x, "clients", js.undefined)
    
    inline def setClientsVarargs(value: SchemaClient*): Self = StObject.set(x, "clients", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
