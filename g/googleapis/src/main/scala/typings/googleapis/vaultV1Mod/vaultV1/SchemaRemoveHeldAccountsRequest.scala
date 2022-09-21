package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemoveHeldAccountsRequest extends StObject {
  
  /**
    * The account IDs of the accounts to remove from the hold.
    */
  var accountIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRemoveHeldAccountsRequest {
  
  inline def apply(): SchemaRemoveHeldAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveHeldAccountsRequest]
  }
  
  extension [Self <: SchemaRemoveHeldAccountsRequest](x: Self) {
    
    inline def setAccountIds(value: js.Array[String]): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsNull: Self = StObject.set(x, "accountIds", null)
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: String*): Self = StObject.set(x, "accountIds", js.Array(value*))
  }
}
