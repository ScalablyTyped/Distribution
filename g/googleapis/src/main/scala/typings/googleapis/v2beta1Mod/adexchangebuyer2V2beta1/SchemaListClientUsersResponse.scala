package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListClientUsersResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListClientUsersRequest.pageToken field in the subsequent call to the
    * clients.invitations.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The returned list of client users.
    */
  var users: js.UndefOr[js.Array[SchemaClientUser]] = js.undefined
}
object SchemaListClientUsersResponse {
  
  @scala.inline
  def apply(): SchemaListClientUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListClientUsersResponse]
  }
  
  @scala.inline
  implicit class SchemaListClientUsersResponseMutableBuilder[Self <: SchemaListClientUsersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUsers(value: js.Array[SchemaClientUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: SchemaClientUser*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
