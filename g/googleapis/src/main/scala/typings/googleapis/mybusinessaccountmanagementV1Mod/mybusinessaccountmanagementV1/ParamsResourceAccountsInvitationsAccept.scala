package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsInvitationsAccept
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the invitation that is being accepted. `accounts/{account_id\}/invitations/{invitation_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAcceptInvitationRequest] = js.undefined
}
object ParamsResourceAccountsInvitationsAccept {
  
  inline def apply(): ParamsResourceAccountsInvitationsAccept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsInvitationsAccept]
  }
  
  extension [Self <: ParamsResourceAccountsInvitationsAccept](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaAcceptInvitationRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
