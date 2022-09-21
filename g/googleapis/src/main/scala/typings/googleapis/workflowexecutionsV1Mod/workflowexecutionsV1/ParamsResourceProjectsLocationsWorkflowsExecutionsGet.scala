package typings.googleapis.workflowexecutionsV1Mod.workflowexecutionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkflowsExecutionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the execution to be retrieved. Format: projects/{project\}/locations/{location\}/workflows/{workflow\}/executions/{execution\}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A view defining which fields should be filled in the returned execution. The API will default to the FULL view.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsWorkflowsExecutionsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkflowsExecutionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkflowsExecutionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkflowsExecutionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
