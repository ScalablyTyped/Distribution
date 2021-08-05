package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns a list of held accounts for a hold.
  */
trait SchemaListHeldAccountsResponse extends StObject {
  
  /**
    * The held accounts on a hold.
    */
  var accounts: js.UndefOr[js.Array[SchemaHeldAccount]] = js.undefined
}
object SchemaListHeldAccountsResponse {
  
  inline def apply(): SchemaListHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListHeldAccountsResponse]
  }
  
  extension [Self <: SchemaListHeldAccountsResponse](x: Self) {
    
    inline def setAccounts(value: js.Array[SchemaHeldAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    inline def setAccountsVarargs(value: SchemaHeldAccount*): Self = StObject.set(x, "accounts", js.Array(value :_*))
  }
}
