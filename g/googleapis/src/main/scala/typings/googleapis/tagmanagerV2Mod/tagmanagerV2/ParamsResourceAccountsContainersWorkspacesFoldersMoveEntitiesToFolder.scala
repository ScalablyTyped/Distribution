package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder
  extends StObject
     with StandardParameters {
  
  /**
    * GTM Folder's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/folders/{folder_id\}
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
  
  inline def apply(): ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder]
  }
  
  extension [Self <: ParamsResourceAccountsContainersWorkspacesFoldersMoveEntitiesToFolder](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRequestBody(value: SchemaFolder): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTagId(value: js.Array[String]): Self = StObject.set(x, "tagId", value.asInstanceOf[js.Any])
    
    inline def setTagIdUndefined: Self = StObject.set(x, "tagId", js.undefined)
    
    inline def setTagIdVarargs(value: String*): Self = StObject.set(x, "tagId", js.Array(value*))
    
    inline def setTriggerId(value: js.Array[String]): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
    
    inline def setTriggerIdVarargs(value: String*): Self = StObject.set(x, "triggerId", js.Array(value*))
    
    inline def setVariableId(value: js.Array[String]): Self = StObject.set(x, "variableId", value.asInstanceOf[js.Any])
    
    inline def setVariableIdUndefined: Self = StObject.set(x, "variableId", js.undefined)
    
    inline def setVariableIdVarargs(value: String*): Self = StObject.set(x, "variableId", js.Array(value*))
  }
}
