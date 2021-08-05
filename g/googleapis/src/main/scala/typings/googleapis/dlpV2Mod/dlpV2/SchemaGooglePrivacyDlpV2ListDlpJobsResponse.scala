package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response message for listing DLP jobs.
  */
trait SchemaGooglePrivacyDlpV2ListDlpJobsResponse extends StObject {
  
  /**
    * A list of DlpJobs that matches the specified filter in the request.
    */
  var jobs: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2DlpJob]] = js.undefined
  
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2ListDlpJobsResponse {
  
  inline def apply(): SchemaGooglePrivacyDlpV2ListDlpJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ListDlpJobsResponse]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2ListDlpJobsResponse](x: Self) {
    
    inline def setJobs(value: js.Array[SchemaGooglePrivacyDlpV2DlpJob]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: SchemaGooglePrivacyDlpV2DlpJob*): Self = StObject.set(x, "jobs", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
