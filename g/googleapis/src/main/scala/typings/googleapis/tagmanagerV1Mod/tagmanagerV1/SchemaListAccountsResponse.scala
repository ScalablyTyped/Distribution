package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List Accounts Response.
  */
trait SchemaListAccountsResponse extends StObject {
  
  /**
    * List of GTM Accounts that a user has access to.
    */
  var accounts: js.UndefOr[js.Array[SchemaAccount]] = js.undefined
}
object SchemaListAccountsResponse {
  
  inline def apply(): SchemaListAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAccountsResponse]
  }
  
  extension [Self <: SchemaListAccountsResponse](x: Self) {
    
    inline def setAccounts(value: js.Array[SchemaAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    inline def setAccountsVarargs(value: SchemaAccount*): Self = StObject.set(x, "accounts", js.Array(value :_*))
  }
}
