package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRoleassignmentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Immutable ID of the G Suite account.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable ID of the role assignment.
    */
  var roleAssignmentId: js.UndefOr[String] = js.undefined
}
object ParamsResourceRoleassignmentsGet {
  
  inline def apply(): ParamsResourceRoleassignmentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRoleassignmentsGet]
  }
  
  extension [Self <: ParamsResourceRoleassignmentsGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setRoleAssignmentId(value: String): Self = StObject.set(x, "roleAssignmentId", value.asInstanceOf[js.Any])
    
    inline def setRoleAssignmentIdUndefined: Self = StObject.set(x, "roleAssignmentId", js.undefined)
  }
}
