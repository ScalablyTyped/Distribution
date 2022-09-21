package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsClientsInvitationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Numerical account ID of the client's sponsor buyer. (required)
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Numerical account ID of the client buyer that the user invitation to be retrieved is associated with. (required)
    */
  var clientAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Numerical identifier of the user invitation to retrieve. (required)
    */
  var invitationId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsClientsInvitationsGet {
  
  inline def apply(): ParamsResourceAccountsClientsInvitationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsClientsInvitationsGet]
  }
  
  extension [Self <: ParamsResourceAccountsClientsInvitationsGet](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setClientAccountId(value: String): Self = StObject.set(x, "clientAccountId", value.asInstanceOf[js.Any])
    
    inline def setClientAccountIdUndefined: Self = StObject.set(x, "clientAccountId", js.undefined)
    
    inline def setInvitationId(value: String): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
    
    inline def setInvitationIdUndefined: Self = StObject.set(x, "invitationId", js.undefined)
  }
}
