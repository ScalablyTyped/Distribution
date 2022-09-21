package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListUserListsResponse extends StObject {
  
  /**
    * The continuation page token to send back to the server in a subsequent request. Due to a currently known issue, it is recommended that the caller keep invoking the list method till the time a next page token is not returned (even if the result set is empty).
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of user lists from the search.
    */
  var userLists: js.UndefOr[js.Array[SchemaUserList]] = js.undefined
}
object SchemaListUserListsResponse {
  
  inline def apply(): SchemaListUserListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListUserListsResponse]
  }
  
  extension [Self <: SchemaListUserListsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUserLists(value: js.Array[SchemaUserList]): Self = StObject.set(x, "userLists", value.asInstanceOf[js.Any])
    
    inline def setUserListsUndefined: Self = StObject.set(x, "userLists", js.undefined)
    
    inline def setUserListsVarargs(value: SchemaUserList*): Self = StObject.set(x, "userLists", js.Array(value*))
  }
}
