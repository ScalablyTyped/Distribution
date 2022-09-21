package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsLakesTasksJobsCancel
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the job: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/task/{task_id\}/job/{job_id\}.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDataplexV1CancelJobRequest] = js.undefined
}
object ParamsResourceProjectsLocationsLakesTasksJobsCancel {
  
  inline def apply(): ParamsResourceProjectsLocationsLakesTasksJobsCancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsLakesTasksJobsCancel]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsLakesTasksJobsCancel](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDataplexV1CancelJobRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
