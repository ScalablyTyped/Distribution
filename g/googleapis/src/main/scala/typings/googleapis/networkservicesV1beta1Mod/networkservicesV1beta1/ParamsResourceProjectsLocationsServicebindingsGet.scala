package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsServicebindingsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. A name of the ServiceBinding to get. Must be in the format `projects/x/locations/global/serviceBindings/x`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsServicebindingsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsServicebindingsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsServicebindingsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsServicebindingsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
