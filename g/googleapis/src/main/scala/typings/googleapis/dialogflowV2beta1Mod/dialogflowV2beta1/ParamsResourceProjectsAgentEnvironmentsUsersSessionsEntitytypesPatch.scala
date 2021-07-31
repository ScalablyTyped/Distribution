package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required. The unique identifier of this session entity type. Format:
    * `projects/<Project ID>/agent/sessions/<Session ID>/entityTypes/<Entity
    * Type Display Name>`, or `projects/<Project
    * ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session
    * ID>/entityTypes/<Entity Type Display Name>`. If `Environment ID` is not
    * specified, we assume default 'draft' environment. If `User ID` is not
    * specified, we assume default '-' user.  `<Entity Type Display Name>` must
    * be the display name of an existing entity type in the same agent that
    * will be overridden or supplemented.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1SessionEntityType] = js.undefined
  
  /**
    * Optional. The mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesPatch {
  
  @scala.inline
  def apply(): ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesPatchMutableBuilder[Self <: ParamsResourceProjectsAgentEnvironmentsUsersSessionsEntitytypesPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaGoogleCloudDialogflowV2beta1SessionEntityType): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
