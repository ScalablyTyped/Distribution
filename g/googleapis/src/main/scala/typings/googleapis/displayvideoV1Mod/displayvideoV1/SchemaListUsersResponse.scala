package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListUsersResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListUsers` method to retrieve the next page of results. This token will be absent if there are no more results to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of users. This list will be absent if empty.
    */
  var users: js.UndefOr[js.Array[SchemaUser]] = js.undefined
}
object SchemaListUsersResponse {
  
  inline def apply(): SchemaListUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUsersResponse]
  }
  
  extension [Self <: SchemaListUsersResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUsers(value: js.Array[SchemaUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: SchemaUser*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
