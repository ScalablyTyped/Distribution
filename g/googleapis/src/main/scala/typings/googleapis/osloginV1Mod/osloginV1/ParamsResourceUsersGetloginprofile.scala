package typings.googleapis.osloginV1Mod.osloginV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceUsersGetloginprofile extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The unique ID for the user in format `users/{user}`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The project ID of the Google Cloud Platform project.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * A system ID for filtering the results of the request.
    */
  var systemId: js.UndefOr[String] = js.native
}
object ParamsResourceUsersGetloginprofile {
  
  @scala.inline
  def apply(): ParamsResourceUsersGetloginprofile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersGetloginprofile]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersGetloginprofileMutableBuilder[Self <: ParamsResourceUsersGetloginprofile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemIdUndefined: Self = StObject.set(x, "systemId", js.undefined)
  }
}
