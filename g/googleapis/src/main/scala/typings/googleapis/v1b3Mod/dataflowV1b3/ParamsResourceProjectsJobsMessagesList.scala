package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsJobsMessagesList
  extends StObject
     with StandardParameters {
  
  /**
    * Return only messages with timestamps < end_time. The default is now (i.e. return up to the latest messages available).
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * The job to get messages about.
    */
  var jobId: js.UndefOr[String] = js.undefined
  
  /**
    * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Filter to only get messages with importance \>= level
    */
  var minimumImportance: js.UndefOr[String] = js.undefined
  
  /**
    * If specified, determines the maximum number of messages to return. If unspecified, the service may choose an appropriate default, or may return an arbitrarily large number of results.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * If supplied, this should be the value of next_page_token returned by an earlier call. This will cause the next page of results to be returned.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A project id.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * If specified, return only messages with timestamps \>= start_time. The default is the job creation time (i.e. beginning of messages).
    */
  var startTime: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsJobsMessagesList {
  
  inline def apply(): ParamsResourceProjectsJobsMessagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsJobsMessagesList]
  }
  
  extension [Self <: ParamsResourceProjectsJobsMessagesList](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMinimumImportance(value: String): Self = StObject.set(x, "minimumImportance", value.asInstanceOf[js.Any])
    
    inline def setMinimumImportanceUndefined: Self = StObject.set(x, "minimumImportance", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
