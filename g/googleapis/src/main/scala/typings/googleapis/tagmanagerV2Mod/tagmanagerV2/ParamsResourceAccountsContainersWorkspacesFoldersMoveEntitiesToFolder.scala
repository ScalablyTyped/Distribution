package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * GTM Folder's API relative path. Example:
    * accounts/{account_id}/containers/{container_id}/workspaces/{workspace_id}/folders/{folder_id}
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFolder] = js.undefined
  
  /**
    * The tags to be moved to the folder.
    */
  var tagId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The triggers to be moved to the folder.
    */
  var triggerId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The variables to be moved to the folder.
    */
  var variableId: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder {
  
  @scala.inline
  def apply(): ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder]
  }
  
  @scala.inline
  implicit class ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolderMutableBuilder[Self <: ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaFolder): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setTagId(value: js.Array[String]): Self = StObject.set(x, "tagId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagIdUndefined: Self = StObject.set(x, "tagId", js.undefined)
    
    @scala.inline
    def setTagIdVarargs(value: String*): Self = StObject.set(x, "tagId", js.Array(value :_*))
    
    @scala.inline
    def setTriggerId(value: js.Array[String]): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
    
    @scala.inline
    def setTriggerIdVarargs(value: String*): Self = StObject.set(x, "triggerId", js.Array(value :_*))
    
    @scala.inline
    def setVariableId(value: js.Array[String]): Self = StObject.set(x, "variableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableIdUndefined: Self = StObject.set(x, "variableId", js.undefined)
    
    @scala.inline
    def setVariableIdVarargs(value: String*): Self = StObject.set(x, "variableId", js.Array(value :_*))
  }
}
