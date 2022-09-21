package typings.googleapis.redisV1beta1Mod.redisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesReschedulemaintenance
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Redis instance resource name using the form: `projects/{project_id\}/locations/{location_id\}/instances/{instance_id\}` where `location_id` refers to a GCP region.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRescheduleMaintenanceRequest] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesReschedulemaintenance {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesReschedulemaintenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesReschedulemaintenance]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesReschedulemaintenance](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaRescheduleMaintenanceRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
