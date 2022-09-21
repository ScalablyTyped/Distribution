package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsJobsExecutionsTasksGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The full name of the Task. Format: projects/{project\}/locations/{location\}/jobs/{job\}/executions/{execution\}/tasks/{task\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsJobsExecutionsTasksGet {
  
  inline def apply(): ParamsResourceProjectsLocationsJobsExecutionsTasksGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsJobsExecutionsTasksGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsJobsExecutionsTasksGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
