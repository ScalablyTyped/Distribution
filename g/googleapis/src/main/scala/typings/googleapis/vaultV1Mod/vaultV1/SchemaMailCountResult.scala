package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMailCountResult extends StObject {
  
  /**
    * Errors occurred when querying these accounts.
    */
  var accountCountErrors: js.UndefOr[js.Array[SchemaAccountCountError]] = js.undefined
  
  /**
    * Subtotal count per matching account that have more than zero messages.
    */
  var accountCounts: js.UndefOr[js.Array[SchemaAccountCount]] = js.undefined
  
  /**
    * Total number of accounts that can be queried and have more than zero messages.
    */
  var matchingAccountsCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When **DataScope** is **HELD_DATA** and when account emails are passed in explicitly, the list of accounts in the request that are not queried because they are not on hold in the matter. For other data scopes, this field is not set.
    */
  var nonQueryableAccounts: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Total number of accounts involved in this count operation.
    */
  var queriedAccountsCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaMailCountResult {
  
  inline def apply(): SchemaMailCountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMailCountResult]
  }
  
  extension [Self <: SchemaMailCountResult](x: Self) {
    
    inline def setAccountCountErrors(value: js.Array[SchemaAccountCountError]): Self = StObject.set(x, "accountCountErrors", value.asInstanceOf[js.Any])
    
    inline def setAccountCountErrorsUndefined: Self = StObject.set(x, "accountCountErrors", js.undefined)
    
    inline def setAccountCountErrorsVarargs(value: SchemaAccountCountError*): Self = StObject.set(x, "accountCountErrors", js.Array(value*))
    
    inline def setAccountCounts(value: js.Array[SchemaAccountCount]): Self = StObject.set(x, "accountCounts", value.asInstanceOf[js.Any])
    
    inline def setAccountCountsUndefined: Self = StObject.set(x, "accountCounts", js.undefined)
    
    inline def setAccountCountsVarargs(value: SchemaAccountCount*): Self = StObject.set(x, "accountCounts", js.Array(value*))
    
    inline def setMatchingAccountsCount(value: String): Self = StObject.set(x, "matchingAccountsCount", value.asInstanceOf[js.Any])
    
    inline def setMatchingAccountsCountNull: Self = StObject.set(x, "matchingAccountsCount", null)
    
    inline def setMatchingAccountsCountUndefined: Self = StObject.set(x, "matchingAccountsCount", js.undefined)
    
    inline def setNonQueryableAccounts(value: js.Array[String]): Self = StObject.set(x, "nonQueryableAccounts", value.asInstanceOf[js.Any])
    
    inline def setNonQueryableAccountsNull: Self = StObject.set(x, "nonQueryableAccounts", null)
    
    inline def setNonQueryableAccountsUndefined: Self = StObject.set(x, "nonQueryableAccounts", js.undefined)
    
    inline def setNonQueryableAccountsVarargs(value: String*): Self = StObject.set(x, "nonQueryableAccounts", js.Array(value*))
    
    inline def setQueriedAccountsCount(value: String): Self = StObject.set(x, "queriedAccountsCount", value.asInstanceOf[js.Any])
    
    inline def setQueriedAccountsCountNull: Self = StObject.set(x, "queriedAccountsCount", null)
    
    inline def setQueriedAccountsCountUndefined: Self = StObject.set(x, "queriedAccountsCount", js.undefined)
  }
}
