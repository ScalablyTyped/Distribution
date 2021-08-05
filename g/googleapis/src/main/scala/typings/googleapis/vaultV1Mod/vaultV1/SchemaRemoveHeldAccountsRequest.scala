package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Remove a list of accounts from a hold.
  */
trait SchemaRemoveHeldAccountsRequest extends StObject {
  
  /**
    * Account ids to identify HeldAccounts to remove.
    */
  var accountIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaRemoveHeldAccountsRequest {
  
  inline def apply(): SchemaRemoveHeldAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveHeldAccountsRequest]
  }
  
  extension [Self <: SchemaRemoveHeldAccountsRequest](x: Self) {
    
    inline def setAccountIds(value: js.Array[String]): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: String*): Self = StObject.set(x, "accountIds", js.Array(value :_*))
  }
}
