package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAgentEnvironmentsUsersSessionsDeletecontexts
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required. The name of the session to delete all contexts from. Format:
    * `projects/<Project ID>/agent/sessions/<Session ID>` or `projects/<Project
    * ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session
    * ID>`. If `Environment ID` is not specified we assume default 'draft'
    * environment. If `User ID` is not specified, we assume default '-' user.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAgentEnvironmentsUsersSessionsDeletecontexts {
  
  inline def apply(): ParamsResourceProjectsAgentEnvironmentsUsersSessionsDeletecontexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentEnvironmentsUsersSessionsDeletecontexts]
  }
  
  extension [Self <: ParamsResourceProjectsAgentEnvironmentsUsersSessionsDeletecontexts](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
