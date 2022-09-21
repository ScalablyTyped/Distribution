package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsInvitationsDecline
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the account invitation that is being declined. `accounts/{account_id\}/invitations/{invitation_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDeclineInvitationRequest] = js.undefined
}
object ParamsResourceAccountsInvitationsDecline {
  
  inline def apply(): ParamsResourceAccountsInvitationsDecline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsInvitationsDecline]
  }
  
  extension [Self <: ParamsResourceAccountsInvitationsDecline](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaDeclineInvitationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
