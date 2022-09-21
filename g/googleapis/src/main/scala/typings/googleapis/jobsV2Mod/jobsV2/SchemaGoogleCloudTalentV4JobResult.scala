package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudTalentV4JobResult extends StObject {
  
  /**
    * Here Job only contains basic information including name, company, language_code and requisition_id, use getJob method to retrieve detailed information of the created/updated job.
    */
  var job: js.UndefOr[SchemaGoogleCloudTalentV4Job] = js.undefined
  
  /**
    * The status of the job processed. This field is populated if the processing of the job fails.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
}
object SchemaGoogleCloudTalentV4JobResult {
  
  inline def apply(): SchemaGoogleCloudTalentV4JobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudTalentV4JobResult]
  }
  
  extension [Self <: SchemaGoogleCloudTalentV4JobResult](x: Self) {
    
    inline def setJob(value: SchemaGoogleCloudTalentV4Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    inline def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
