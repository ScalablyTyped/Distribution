package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsInvitationsList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Filtering the response is supported via the Invitation.target_type field.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the account from which the list of invitations is being retrieved. `accounts/{account_id\}/invitations`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsInvitationsList {
  
  inline def apply(): ParamsResourceAccountsInvitationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsInvitationsList]
  }
  
  extension [Self <: ParamsResourceAccountsInvitationsList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
