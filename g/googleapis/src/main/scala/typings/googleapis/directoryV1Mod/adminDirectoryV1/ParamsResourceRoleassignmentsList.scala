package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRoleassignmentsList
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
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Token to specify the next page in the list.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable ID of a role. If included in the request, returns only role
    * assignments containing this role ID.
    */
  var roleId: js.UndefOr[String] = js.undefined
  
  /**
    * The user's primary email address, alias email address, or unique user ID.
    * If included in the request, returns role assignments only for this user.
    */
  var userKey: js.UndefOr[String] = js.undefined
}
object ParamsResourceRoleassignmentsList {
  
  inline def apply(): ParamsResourceRoleassignmentsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRoleassignmentsList]
  }
  
  extension [Self <: ParamsResourceRoleassignmentsList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setRoleId(value: String): Self = StObject.set(x, "roleId", value.asInstanceOf[js.Any])
    
    inline def setRoleIdUndefined: Self = StObject.set(x, "roleId", js.undefined)
    
    inline def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    inline def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
  }
}
