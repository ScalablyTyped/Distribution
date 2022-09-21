package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkflowtemplatesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the region or location, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates,create, the resource name of the region has the following format: projects/{project_id\}/regions/{region\} For projects.locations.workflowTemplates.create, the resource name of the location has the following format: projects/{project_id\}/locations/{location\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaWorkflowTemplate] = js.undefined
}
object ParamsResourceProjectsLocationsWorkflowtemplatesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkflowtemplatesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkflowtemplatesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkflowtemplatesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaWorkflowTemplate): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
