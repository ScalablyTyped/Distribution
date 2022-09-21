package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListServiceAccountsResponse extends StObject {
  
  /**
    * The list of matching service accounts.
    */
  var accounts: js.UndefOr[js.Array[SchemaServiceAccount]] = js.undefined
  
  /**
    * To retrieve the next page of results, set ListServiceAccountsRequest.page_token to this value.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListServiceAccountsResponse {
  
  inline def apply(): SchemaListServiceAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServiceAccountsResponse]
  }
  
  extension [Self <: SchemaListServiceAccountsResponse](x: Self) {
    
    inline def setAccounts(value: js.Array[SchemaServiceAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    inline def setAccountsVarargs(value: SchemaServiceAccount*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
