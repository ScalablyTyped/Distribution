package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsList
  extends StObject
     with StandardParameters {
  
  /**
    * If provided, this field specifies the criteria that must be met by the `OSPolicyAssignmentReport` API resource that is included in the response.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A pagination token returned from a previous call to the `ListOSPolicyAssignmentReports` method that indicates where this listing should continue from.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource name. Format: `projects/{project\}/locations/{location\}/instances/{instance\}/osPolicyAssignments/{assignment\}/reports` For `{project\}`, either `project-number` or `project-id` can be provided. For `{instance\}`, either `instance-name`, `instance-id`, or `-` can be provided. If '-' is provided, the response will include OSPolicyAssignmentReports for all instances in the project/location. For `{assignment\}`, either `assignment-id` or `-` can be provided. If '-' is provided, the response will include OSPolicyAssignmentReports for all OSPolicyAssignments in the project/location. Either {instance\} or {assignment\} must be `-`. For example: `projects/{project\}/locations/{location\}/instances/{instance\}/osPolicyAssignments/-/reports` returns all reports for the instance `projects/{project\}/locations/{location\}/instances/-/osPolicyAssignments/{assignment-id\}/reports` returns all the reports for the given assignment across all instances. `projects/{project\}/locations/{location\}/instances/-/osPolicyAssignments/-/reports` returns all the reports for all assignments across all instances.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsList {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesOspolicyassignmentsReportsList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
