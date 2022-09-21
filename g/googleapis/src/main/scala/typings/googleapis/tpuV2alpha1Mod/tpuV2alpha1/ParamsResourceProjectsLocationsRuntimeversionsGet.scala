package typings.googleapis.tpuV2alpha1Mod.tpuV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRuntimeversionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRuntimeversionsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsRuntimeversionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRuntimeversionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRuntimeversionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
