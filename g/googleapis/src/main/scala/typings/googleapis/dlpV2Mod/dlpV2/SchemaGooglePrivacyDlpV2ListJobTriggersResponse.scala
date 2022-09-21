package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2ListJobTriggersResponse extends StObject {
  
  /**
    * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
    */
  var jobTriggers: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2JobTrigger]] = js.undefined
  
  /**
    * If the next page is available then the next page token to be used in following ListJobTriggers request.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2ListJobTriggersResponse {
  
  inline def apply(): SchemaGooglePrivacyDlpV2ListJobTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListJobTriggersResponse]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2ListJobTriggersResponse](x: Self) {
    
    inline def setJobTriggers(value: js.Array[SchemaGooglePrivacyDlpV2JobTrigger]): Self = StObject.set(x, "jobTriggers", value.asInstanceOf[js.Any])
    
    inline def setJobTriggersUndefined: Self = StObject.set(x, "jobTriggers", js.undefined)
    
    inline def setJobTriggersVarargs(value: SchemaGooglePrivacyDlpV2JobTrigger*): Self = StObject.set(x, "jobTriggers", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
