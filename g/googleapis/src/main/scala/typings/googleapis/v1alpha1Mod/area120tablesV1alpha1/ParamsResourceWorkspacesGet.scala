package typings.googleapis.v1alpha1Mod.area120tablesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceWorkspacesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the workspace to retrieve. Format: workspaces/{workspace\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceWorkspacesGet {
  
  inline def apply(): ParamsResourceWorkspacesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceWorkspacesGet]
  }
  
  extension [Self <: ParamsResourceWorkspacesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
