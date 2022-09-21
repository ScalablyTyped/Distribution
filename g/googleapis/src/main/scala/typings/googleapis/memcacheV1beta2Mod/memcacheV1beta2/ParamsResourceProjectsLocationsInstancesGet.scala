package typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Memcached instance resource name in the format: `projects/{project_id\}/locations/{location_id\}/instances/{instance_id\}` where `location_id` refers to a GCP region
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
