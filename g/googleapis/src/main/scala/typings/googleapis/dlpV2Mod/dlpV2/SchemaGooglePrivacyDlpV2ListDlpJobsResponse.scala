package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response message for listing DLP jobs.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ListDlpJobsResponse extends StObject {
  
  /**
    * A list of DlpJobs that matches the specified filter in the request.
    */
  var jobs: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2DlpJob]] = js.native
  
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2ListDlpJobsResponse {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ListDlpJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListDlpJobsResponse]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ListDlpJobsResponseMutableBuilder[Self <: SchemaGooglePrivacyDlpV2ListDlpJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: js.Array[SchemaGooglePrivacyDlpV2DlpJob]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: SchemaGooglePrivacyDlpV2DlpJob*): Self = StObject.set(x, "jobs", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
