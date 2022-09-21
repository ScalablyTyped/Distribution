package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsLakesZonesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the zone: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsLakesZonesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsLakesZonesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsLakesZonesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsLakesZonesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
