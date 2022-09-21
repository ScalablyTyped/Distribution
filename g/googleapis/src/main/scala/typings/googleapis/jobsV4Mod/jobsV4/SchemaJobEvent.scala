package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobEvent extends StObject {
  
  /**
    * Required. The job name(s) associated with this event. For example, if this is an impression event, this field contains the identifiers of all jobs shown to the job seeker. If this was a view event, this field contains the identifier of the viewed job. The format is "projects/{project_id\}/tenants/{tenant_id\}/jobs/{job_id\}", for example, "projects/foo/tenants/bar/jobs/baz".
    */
  var jobs: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. The type of the event (see JobEventType).
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaJobEvent {
  
  inline def apply(): SchemaJobEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobEvent]
  }
  
  extension [Self <: SchemaJobEvent](x: Self) {
    
    inline def setJobs(value: js.Array[String]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsNull: Self = StObject.set(x, "jobs", null)
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: String*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
