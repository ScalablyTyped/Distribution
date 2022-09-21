package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddHeldAccountsRequest extends StObject {
  
  /**
    * A comma-separated list of the account IDs of the accounts to add to the hold. Specify either **emails** or **account_ids**, but not both.
    */
  var accountIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A comma-separated list of the emails of the accounts to add to the hold. Specify either **emails** or **account_ids**, but not both.
    */
  var emails: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaAddHeldAccountsRequest {
  
  inline def apply(): SchemaAddHeldAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddHeldAccountsRequest]
  }
  
  extension [Self <: SchemaAddHeldAccountsRequest](x: Self) {
    
    inline def setAccountIds(value: js.Array[String]): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsNull: Self = StObject.set(x, "accountIds", null)
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: String*): Self = StObject.set(x, "accountIds", js.Array(value*))
    
    inline def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsNull: Self = StObject.set(x, "emails", null)
    
    inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    inline def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value*))
  }
}
