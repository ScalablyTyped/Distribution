package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Add a list of accounts to a hold.
  */
@js.native
trait SchemaAddHeldAccountsRequest extends StObject {
  
  /**
    * Account ids to identify which accounts to add. Only account_ids or only
    * emails should be specified, but not both.
    */
  var accountIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Emails to identify which accounts to add. Only emails or only account_ids
    * should be specified, but not both.
    */
  var emails: js.UndefOr[js.Array[String]] = js.native
}
object SchemaAddHeldAccountsRequest {
  
  @scala.inline
  def apply(): SchemaAddHeldAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddHeldAccountsRequest]
  }
  
  @scala.inline
  implicit class SchemaAddHeldAccountsRequestMutableBuilder[Self <: SchemaAddHeldAccountsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: js.Array[String]): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    @scala.inline
    def setAccountIdsVarargs(value: String*): Self = StObject.set(x, "accountIds", js.Array(value :_*))
    
    @scala.inline
    def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    @scala.inline
    def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value :_*))
  }
}
