package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsJobsWorkitemsReportstatus
  extends StObject
     with StandardParameters {
  
  /**
    * The job which the WorkItem is part of.
    */
  var jobId: js.UndefOr[String] = js.undefined
  
  /**
    * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the WorkItem's job.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The project which owns the WorkItem's job.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReportWorkItemStatusRequest] = js.undefined
}
object ParamsResourceProjectsLocationsJobsWorkitemsReportstatus {
  
  inline def apply(): ParamsResourceProjectsLocationsJobsWorkitemsReportstatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsJobsWorkitemsReportstatus]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsJobsWorkitemsReportstatus](x: Self) {
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRequestBody(value: SchemaReportWorkItemStatusRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
