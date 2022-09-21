package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsJobsGetmetrics
  extends StObject
     with StandardParameters {
  
  /**
    * The job to get metrics for.
    */
  var jobId: js.UndefOr[String] = js.undefined
  
  /**
    * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * A project id.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Return only metric data that has changed since this time. Default is to return all information about all metrics for the job.
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsJobsGetmetrics {
  
  inline def apply(): ParamsResourceProjectsJobsGetmetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsJobsGetmetrics]
  }
  
  extension [Self <: ParamsResourceProjectsJobsGetmetrics](x: Self) {
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
