package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsMeshesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the Mesh to get. Must be in the format `projects/x/locations/global/meshes/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsMeshesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsMeshesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsMeshesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsMeshesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
