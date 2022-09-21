package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListChildAccountsResponse extends StObject {
  
  /**
    * The accounts returned in this list response.
    */
  var accounts: js.UndefOr[js.Array[SchemaAccount]] = js.undefined
  
  /**
    * Continuation token used to page through accounts. To retrieve the next page of the results, set the next request's "page_token" value to this.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListChildAccountsResponse {
  
  inline def apply(): SchemaListChildAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListChildAccountsResponse]
  }
  
  extension [Self <: SchemaListChildAccountsResponse](x: Self) {
    
    inline def setAccounts(value: js.Array[SchemaAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    inline def setAccountsVarargs(value: SchemaAccount*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
