package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersWorkspacesBuiltInVariablesRevert
  extends StObject
     with StandardParameters {
  
  /**
    * GTM BuiltInVariable's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/built_in_variables
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The type of built-in variable to revert.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsContainersWorkspacesBuiltInVariablesRevert {
  
  inline def apply(): ParamsResourceAccountsContainersWorkspacesBuiltInVariablesRevert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersWorkspacesBuiltInVariablesRevert]
  }
  
  extension [Self <: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesRevert](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
