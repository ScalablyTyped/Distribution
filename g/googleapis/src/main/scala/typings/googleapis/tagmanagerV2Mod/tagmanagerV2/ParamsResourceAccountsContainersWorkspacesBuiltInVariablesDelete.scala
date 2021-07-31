package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * GTM BuiltInVariable's API relative path. Example:
    * accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/built_in_variables
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The types of built-in variables to delete.
    */
  var `type`: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete {
  
  @scala.inline
  def apply(): ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDeleteMutableBuilder[Self <: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setType(value: js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
