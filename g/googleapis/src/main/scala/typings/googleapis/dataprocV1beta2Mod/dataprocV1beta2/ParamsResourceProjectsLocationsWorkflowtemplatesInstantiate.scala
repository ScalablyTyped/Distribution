package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkflowtemplatesInstantiate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the workflow template, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates.instantiate, the resource name of the template has the following format: projects/{project_id\}/regions/{region\}/workflowTemplates/{template_id\} For projects.locations.workflowTemplates.instantiate, the resource name of the template has the following format: projects/{project_id\}/locations/{location\}/workflowTemplates/{template_id\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInstantiateWorkflowTemplateRequest] = js.undefined
}
object ParamsResourceProjectsLocationsWorkflowtemplatesInstantiate {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkflowtemplatesInstantiate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkflowtemplatesInstantiate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkflowtemplatesInstantiate](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaInstantiateWorkflowTemplateRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
