package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountsListResponse extends StObject {
  
  /**
    * Account collection.
    */
  var accounts: js.UndefOr[js.Array[SchemaAccount]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountsListResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountsListResponse {
  
  inline def apply(): SchemaAccountsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsListResponse]
  }
  
  extension [Self <: SchemaAccountsListResponse](x: Self) {
    
    inline def setAccounts(value: js.Array[SchemaAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    inline def setAccountsVarargs(value: SchemaAccount*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
