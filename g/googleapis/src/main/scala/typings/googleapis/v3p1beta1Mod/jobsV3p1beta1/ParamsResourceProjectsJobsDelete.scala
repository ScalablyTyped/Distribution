package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsJobsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the job to be deleted. The format is "projects/{project_id\}/jobs/{job_id\}", for example, "projects/api-test-project/jobs/1234".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsJobsDelete {
  
  inline def apply(): ParamsResourceProjectsJobsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsJobsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsJobsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
