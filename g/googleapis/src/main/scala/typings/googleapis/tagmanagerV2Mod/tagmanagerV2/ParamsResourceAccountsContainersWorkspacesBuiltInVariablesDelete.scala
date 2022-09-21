package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * GTM BuiltInVariable's API relative path. Example: accounts/{account_id\}/containers/{container_id\}/workspaces/{workspace_id\}/built_in_variables
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The types of built-in variables to delete.
    */
  var `type`: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete {
  
  inline def apply(): ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete]
  }
  
  extension [Self <: ParamsResourceAccountsContainersWorkspacesBuiltInVariablesDelete](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setType(value: js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
