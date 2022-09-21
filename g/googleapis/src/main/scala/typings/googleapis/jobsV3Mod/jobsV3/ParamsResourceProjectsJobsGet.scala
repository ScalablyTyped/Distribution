package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsJobsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the job to retrieve. The format is "projects/{project_id\}/jobs/{job_id\}", for example, "projects/api-test-project/jobs/1234".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsJobsGet {
  
  inline def apply(): ParamsResourceProjectsJobsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsJobsGet]
  }
  
  extension [Self <: ParamsResourceProjectsJobsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
