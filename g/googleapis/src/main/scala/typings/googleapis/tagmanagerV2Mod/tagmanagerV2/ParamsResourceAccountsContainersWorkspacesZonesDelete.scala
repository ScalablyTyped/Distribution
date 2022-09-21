package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersWorkspacesZonesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * GTM Zone's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/zones/{zone_id\}
    */
  var path: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsContainersWorkspacesZonesDelete {
  
  inline def apply(): ParamsResourceAccountsContainersWorkspacesZonesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersWorkspacesZonesDelete]
  }
  
  extension [Self <: ParamsResourceAccountsContainersWorkspacesZonesDelete](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
