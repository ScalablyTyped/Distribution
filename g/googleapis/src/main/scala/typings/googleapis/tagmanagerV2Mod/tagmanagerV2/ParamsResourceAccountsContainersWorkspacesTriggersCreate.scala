package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersWorkspacesTriggersCreate
  extends StObject
     with StandardParameters {
  
  /**
    * GTM Workspaces's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTrigger] = js.undefined
}
object ParamsResourceAccountsContainersWorkspacesTriggersCreate {
  
  inline def apply(): ParamsResourceAccountsContainersWorkspacesTriggersCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersWorkspacesTriggersCreate]
  }
  
  extension [Self <: ParamsResourceAccountsContainersWorkspacesTriggersCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaTrigger): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
