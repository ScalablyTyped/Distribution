package typings.googleapis.osloginV1alphaMod.osloginV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersProjectsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * A reference to the POSIX account to update. POSIX accounts are identified
    * by the project ID they are associated with. A reference to the POSIX
    * account is in format `users/{user}/projects/{project}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The type of operating system associated with the account.
    */
  var operatingSystemType: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersProjectsDelete {
  
  inline def apply(): ParamsResourceUsersProjectsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersProjectsDelete]
  }
  
  extension [Self <: ParamsResourceUsersProjectsDelete](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperatingSystemType(value: String): Self = StObject.set(x, "operatingSystemType", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemTypeUndefined: Self = StObject.set(x, "operatingSystemType", js.undefined)
  }
}
