package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required. The session to create a context for. Format: `projects/<Project
    * ID>/agent/sessions/<Session ID>` or `projects/<Project
    * ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session
    * ID>`. If `Environment ID` is not specified, we assume default 'draft'
    * environment. If `User ID` is not specified, we assume default '-' user.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1Context] = js.undefined
}
object ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsCreateMutableBuilder[Self <: ParamsResourceProjectsAgentEnvironmentsUsersSessionsContextsCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaGoogleCloudDialogflowV2beta1Context): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
