package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsServicesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The full name of the Service. Format: projects/{projectnumber\}/locations/{location\}/services/{service\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsServicesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsServicesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsServicesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsServicesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
