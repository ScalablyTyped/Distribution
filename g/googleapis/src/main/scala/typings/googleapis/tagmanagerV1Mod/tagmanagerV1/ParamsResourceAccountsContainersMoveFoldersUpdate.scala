package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersMoveFoldersUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * The GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.undefined
  
  /**
    * The GTM Folder ID.
    */
  var folderId: js.UndefOr[String] = js.undefined
  
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
object ParamsResourceAccountsContainersMoveFoldersUpdate {
  
  inline def apply(): ParamsResourceAccountsContainersMoveFoldersUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersMoveFoldersUpdate]
  }
  
  extension [Self <: ParamsResourceAccountsContainersMoveFoldersUpdate](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
    
    inline def setFolderIdUndefined: Self = StObject.set(x, "folderId", js.undefined)
    
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
