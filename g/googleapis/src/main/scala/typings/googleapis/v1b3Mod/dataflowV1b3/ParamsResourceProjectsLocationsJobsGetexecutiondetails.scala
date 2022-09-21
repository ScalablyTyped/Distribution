package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsJobsGetexecutiondetails
  extends StObject
     with StandardParameters {
  
  /**
    * The job to get execution details for.
    */
  var jobId: js.UndefOr[String] = js.undefined
  
  /**
    * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * If specified, determines the maximum number of stages to return. If unspecified, the service may choose an appropriate default, or may return an arbitrarily large number of results.
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
}
object ParamsResourceProjectsLocationsJobsGetexecutiondetails {
  
  inline def apply(): ParamsResourceProjectsLocationsJobsGetexecutiondetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsJobsGetexecutiondetails]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsJobsGetexecutiondetails](x: Self) {
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
