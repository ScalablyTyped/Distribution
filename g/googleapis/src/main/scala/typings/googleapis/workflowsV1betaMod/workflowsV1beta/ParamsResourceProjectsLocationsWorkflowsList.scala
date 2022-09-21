package typings.googleapis.workflowsV1betaMod.workflowsV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkflowsList
  extends StObject
     with StandardParameters {
  
  /**
    * Filter to restrict results to specific workflows.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Comma-separated list of fields that that specify the order of the results. Default sorting order for a field is ascending. To specify descending order for a field, append a " desc" suffix. If not specified, the results will be returned in an unspecified order.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of workflows to return per call. The service may return fewer than this value. If the value is not specified, a default value of 500 will be used. The maximum permitted value is 1000 and values greater than 1000 will be coerced down to 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token, received from a previous `ListWorkflows` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListWorkflows` must match the call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Project and location from which the workflows should be listed. Format: projects/{project\}/locations/{location\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsWorkflowsList {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkflowsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkflowsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkflowsList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
