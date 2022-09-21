package typings.googleapis.runV2Mod.runV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsJobsExecutionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The full name of the Execution. Format: projects/{project\}/locations/{location\}/jobs/{job\}/executions/{execution\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsJobsExecutionsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsJobsExecutionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsJobsExecutionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsJobsExecutionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
