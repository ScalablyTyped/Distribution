package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for ListJobTriggers.
  */
trait SchemaGooglePrivacyDlpV2ListJobTriggersResponse extends StObject {
  
  /**
    * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
    */
  var jobTriggers: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2JobTrigger]] = js.undefined
  
  /**
    * If the next page is available then the next page token to be used in
    * following ListJobTriggers request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2ListJobTriggersResponse {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ListJobTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListJobTriggersResponse]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ListJobTriggersResponseMutableBuilder[Self <: SchemaGooglePrivacyDlpV2ListJobTriggersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobTriggers(value: js.Array[SchemaGooglePrivacyDlpV2JobTrigger]): Self = StObject.set(x, "jobTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTriggersUndefined: Self = StObject.set(x, "jobTriggers", js.undefined)
    
    @scala.inline
    def setJobTriggersVarargs(value: SchemaGooglePrivacyDlpV2JobTrigger*): Self = StObject.set(x, "jobTriggers", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
