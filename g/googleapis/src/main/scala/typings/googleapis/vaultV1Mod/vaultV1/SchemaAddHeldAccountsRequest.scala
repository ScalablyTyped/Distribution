package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Add a list of accounts to a hold.
  */
trait SchemaAddHeldAccountsRequest extends StObject {
  
  /**
    * Account ids to identify which accounts to add. Only account_ids or only
    * emails should be specified, but not both.
    */
  var accountIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Emails to identify which accounts to add. Only emails or only account_ids
    * should be specified, but not both.
    */
  var emails: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaAddHeldAccountsRequest {
  
  inline def apply(): SchemaAddHeldAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddHeldAccountsRequest]
  }
  
  extension [Self <: SchemaAddHeldAccountsRequest](x: Self) {
    
    inline def setAccountIds(value: js.Array[String]): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: String*): Self = StObject.set(x, "accountIds", js.Array(value :_*))
    
    inline def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    inline def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value :_*))
  }
}
