package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsRegionsWorkflowtemplatesList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The maximum number of results to return in each response.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. The page token, returned by a previous call, to request the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the region or location, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates,list, the resource name of the region has the following format: projects/{project_id\}/regions/{region\} For projects.locations.workflowTemplates.list, the resource name of the location has the following format: projects/{project_id\}/locations/{location\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsRegionsWorkflowtemplatesList {
  
  inline def apply(): ParamsResourceProjectsRegionsWorkflowtemplatesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsRegionsWorkflowtemplatesList]
  }
  
  extension [Self <: ParamsResourceProjectsRegionsWorkflowtemplatesList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
