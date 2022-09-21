package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1AnnotateAssessmentRequest extends StObject {
  
  /**
    * Optional. The annotation that will be assigned to the Event. This field can be left empty to provide reasons that apply to an event without concluding whether the event is legitimate or fraudulent.
    */
  var annotation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Unique stable hashed user identifier to apply to the assessment. This is an alternative to setting the hashed_account_id in CreateAssessment, for example when the account identifier is not yet known in the initial request. It is recommended that the identifier is hashed using hmac-sha256 with stable secret.
    */
  var hashedAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Optional reasons for the annotation that will be assigned to the Event.
    */
  var reasons: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1AnnotateAssessmentRequest {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1AnnotateAssessmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1AnnotateAssessmentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1AnnotateAssessmentRequest](x: Self) {
    
    inline def setAnnotation(value: String): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    inline def setAnnotationNull: Self = StObject.set(x, "annotation", null)
    
    inline def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
    
    inline def setHashedAccountId(value: String): Self = StObject.set(x, "hashedAccountId", value.asInstanceOf[js.Any])
    
    inline def setHashedAccountIdNull: Self = StObject.set(x, "hashedAccountId", null)
    
    inline def setHashedAccountIdUndefined: Self = StObject.set(x, "hashedAccountId", js.undefined)
    
    inline def setReasons(value: js.Array[String]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsNull: Self = StObject.set(x, "reasons", null)
    
    inline def setReasonsUndefined: Self = StObject.set(x, "reasons", js.undefined)
    
    inline def setReasonsVarargs(value: String*): Self = StObject.set(x, "reasons", js.Array(value*))
  }
}
