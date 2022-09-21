package typings.googleapis.webriskV1Mod.webriskV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudWebriskV1SubmitUriRequest extends StObject {
  
  /**
    * Required. The submission that contains the URI to be scanned.
    */
  var submission: js.UndefOr[SchemaGoogleCloudWebriskV1Submission] = js.undefined
}
object SchemaGoogleCloudWebriskV1SubmitUriRequest {
  
  inline def apply(): SchemaGoogleCloudWebriskV1SubmitUriRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudWebriskV1SubmitUriRequest]
  }
  
  extension [Self <: SchemaGoogleCloudWebriskV1SubmitUriRequest](x: Self) {
    
    inline def setSubmission(value: SchemaGoogleCloudWebriskV1Submission): Self = StObject.set(x, "submission", value.asInstanceOf[js.Any])
    
    inline def setSubmissionUndefined: Self = StObject.set(x, "submission", js.undefined)
  }
}
