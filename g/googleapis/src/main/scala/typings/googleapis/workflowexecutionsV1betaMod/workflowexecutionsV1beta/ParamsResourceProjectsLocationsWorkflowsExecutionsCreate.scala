package typings.googleapis.workflowexecutionsV1betaMod.workflowexecutionsV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkflowsExecutionsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the workflow for which an execution should be created. Format: projects/{project\}/locations/{location\}/workflows/{workflow\} The latest revision of the workflow will be used.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaExecution] = js.undefined
}
object ParamsResourceProjectsLocationsWorkflowsExecutionsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkflowsExecutionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkflowsExecutionsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkflowsExecutionsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaExecution): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
