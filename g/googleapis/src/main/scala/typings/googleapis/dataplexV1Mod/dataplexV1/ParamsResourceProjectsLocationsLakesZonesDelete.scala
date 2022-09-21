package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsLakesZonesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the zone: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/zones/{zone_id\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsLakesZonesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsLakesZonesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsLakesZonesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsLakesZonesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
