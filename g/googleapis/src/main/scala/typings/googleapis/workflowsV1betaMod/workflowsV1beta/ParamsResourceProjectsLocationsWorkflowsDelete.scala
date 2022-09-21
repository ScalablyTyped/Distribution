package typings.googleapis.workflowsV1betaMod.workflowsV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkflowsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the workflow to be deleted. Format: projects/{project\}/locations/{location\}/workflows/{workflow\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsWorkflowsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkflowsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkflowsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkflowsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
