package typings.googleapis.tpuV1Mod.tpuV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsNodesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsNodesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsNodesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsNodesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsNodesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
