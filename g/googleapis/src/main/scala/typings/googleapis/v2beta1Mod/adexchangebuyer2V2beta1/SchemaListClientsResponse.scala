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
    * A token to retrieve the next page of results. Pass this value in the
    * ListClientsRequest.pageToken field in the subsequent call to the
    * accounts.clients.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListClientsResponse {
  
  @scala.inline
  def apply(): SchemaListClientsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListClientsResponse]
  }
  
  @scala.inline
  implicit class SchemaListClientsResponseMutableBuilder[Self <: SchemaListClientsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClients(value: js.Array[SchemaClient]): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientsUndefined: Self = StObject.set(x, "clients", js.undefined)
    
    @scala.inline
    def setClientsVarargs(value: SchemaClient*): Self = StObject.set(x, "clients", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
