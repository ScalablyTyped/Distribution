package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Remove a list of accounts from a hold.
  */
@js.native
trait SchemaRemoveHeldAccountsRequest extends StObject {
  
  /**
    * Account ids to identify HeldAccounts to remove.
    */
  var accountIds: js.UndefOr[js.Array[String]] = js.native
}
object SchemaRemoveHeldAccountsRequest {
  
  @scala.inline
  def apply(): SchemaRemoveHeldAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveHeldAccountsRequest]
  }
  
  @scala.inline
  implicit class SchemaRemoveHeldAccountsRequestMutableBuilder[Self <: SchemaRemoveHeldAccountsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: js.Array[String]): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    @scala.inline
    def setAccountIdsVarargs(value: String*): Self = StObject.set(x, "accountIds", js.Array(value :_*))
  }
}
