package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. API resource name for OS policy assignment report. Format: `/projects/{project\}/locations/{location\}/instances/{instance\}/osPolicyAssignments/{assignment\}/report` For `{project\}`, either `project-number` or `project-id` can be provided. For `{instance_id\}`, either Compute Engine `instance-id` or `instance-name` can be provided. For `{assignment_id\}`, the OSPolicyAssignment id must be provided.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
