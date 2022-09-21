package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsRegionsWorkflowtemplatesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the workflow template, as described in https://cloud.google.com/apis/design/resource_names. For projects.regions.workflowTemplates.delete, the resource name of the template has the following format: projects/{project_id\}/regions/{region\}/workflowTemplates/{template_id\} For projects.locations.workflowTemplates.instantiate, the resource name of the template has the following format: projects/{project_id\}/locations/{location\}/workflowTemplates/{template_id\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The version of workflow template to delete. If specified, will only delete the template if the current server version matches specified version.
    */
  var version: js.UndefOr[Double] = js.undefined
}
object ParamsResourceProjectsRegionsWorkflowtemplatesDelete {
  
  inline def apply(): ParamsResourceProjectsRegionsWorkflowtemplatesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsRegionsWorkflowtemplatesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsRegionsWorkflowtemplatesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
