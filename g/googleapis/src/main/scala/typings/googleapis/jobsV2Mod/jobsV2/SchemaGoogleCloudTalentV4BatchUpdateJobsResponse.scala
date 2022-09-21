package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudTalentV4BatchUpdateJobsResponse extends StObject {
  
  /**
    * List of job mutation results from a batch update operation. It can change until operation status is FINISHED, FAILED or CANCELLED.
    */
  var jobResults: js.UndefOr[js.Array[SchemaGoogleCloudTalentV4JobResult]] = js.undefined
}
object SchemaGoogleCloudTalentV4BatchUpdateJobsResponse {
  
  inline def apply(): SchemaGoogleCloudTalentV4BatchUpdateJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudTalentV4BatchUpdateJobsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudTalentV4BatchUpdateJobsResponse](x: Self) {
    
    inline def setJobResults(value: js.Array[SchemaGoogleCloudTalentV4JobResult]): Self = StObject.set(x, "jobResults", value.asInstanceOf[js.Any])
    
    inline def setJobResultsUndefined: Self = StObject.set(x, "jobResults", js.undefined)
    
    inline def setJobResultsVarargs(value: SchemaGoogleCloudTalentV4JobResult*): Self = StObject.set(x, "jobResults", js.Array(value*))
  }
}
