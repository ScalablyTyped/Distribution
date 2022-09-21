package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTenantsJobsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the job to retrieve. The format is "projects/{project_id\}/tenants/{tenant_id\}/jobs/{job_id\}". For example, "projects/foo/tenants/bar/jobs/baz".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsTenantsJobsGet {
  
  inline def apply(): ParamsResourceProjectsTenantsJobsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTenantsJobsGet]
  }
  
  extension [Self <: ParamsResourceProjectsTenantsJobsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
