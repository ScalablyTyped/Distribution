package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersWorkspacesTriggersGet
  extends StObject
     with StandardParameters {
  
  /**
    * GTM Trigger's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/triggers/{trigger_id\}
    */
  var path: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsContainersWorkspacesTriggersGet {
  
  inline def apply(): ParamsResourceAccountsContainersWorkspacesTriggersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersWorkspacesTriggersGet]
  }
  
  extension [Self <: ParamsResourceAccountsContainersWorkspacesTriggersGet](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
