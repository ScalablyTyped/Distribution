package typings.googleapis.workflowsV1betaMod.workflowsV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkflowsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the workflow which information should be retrieved. Format: projects/{project\}/locations/{location\}/workflows/{workflow\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsWorkflowsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkflowsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkflowsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkflowsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
