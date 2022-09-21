package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersWorkspacesFoldersGet
  extends StObject
     with StandardParameters {
  
  /**
    * GTM Folder's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/folders/{folder_id\}
    */
  var path: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsContainersWorkspacesFoldersGet {
  
  inline def apply(): ParamsResourceAccountsContainersWorkspacesFoldersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersWorkspacesFoldersGet]
  }
  
  extension [Self <: ParamsResourceAccountsContainersWorkspacesFoldersGet](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
