package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchDeleteJobsRequest extends StObject {
  
  /**
    * The names of the jobs to delete. The format is "projects/{project_id\}/tenants/{tenant_id\}/jobs/{job_id\}". For example, "projects/foo/tenants/bar/jobs/baz". A maximum of 200 jobs can be deleted in a batch.
    */
  var names: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaBatchDeleteJobsRequest {
  
  inline def apply(): SchemaBatchDeleteJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchDeleteJobsRequest]
  }
  
  extension [Self <: SchemaBatchDeleteJobsRequest](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesNull: Self = StObject.set(x, "names", null)
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
