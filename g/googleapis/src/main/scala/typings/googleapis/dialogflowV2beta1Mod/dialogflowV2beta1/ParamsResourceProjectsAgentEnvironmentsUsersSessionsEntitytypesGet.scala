package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Required. The name of the session entity type. Format: `projects/<Project
    * ID>/agent/sessions/<Session ID>/entityTypes/<Entity Type Display Name>`
    * or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User
    * ID>/sessions/<Session ID>/entityTypes/<Entity Type Display Name>`. If
    * `Environment ID` is not specified, we assume default 'draft' environment.
    * If `User ID` is not specified, we assume default '-' user.
    */
  var name: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesGet {
  
  @scala.inline
  def apply(): ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesGetMutableBuilder[Self <: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
