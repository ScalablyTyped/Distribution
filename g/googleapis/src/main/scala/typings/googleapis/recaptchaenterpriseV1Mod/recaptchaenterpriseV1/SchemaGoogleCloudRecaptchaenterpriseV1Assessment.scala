package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1Assessment extends StObject {
  
  /**
    * Assessment returned by account defender when a hashed_account_id is provided.
    */
  var accountDefenderAssessment: js.UndefOr[SchemaGoogleCloudRecaptchaenterpriseV1AccountDefenderAssessment] = js.undefined
  
  /**
    * The event being assessed.
    */
  var event: js.UndefOr[SchemaGoogleCloudRecaptchaenterpriseV1Event] = js.undefined
  
  /**
    * Output only. The resource name for the Assessment in the format "projects/{project\}/assessments/{assessment\}".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The private password leak verification field contains the parameters that are used to to check for leaks privately without sharing user credentials.
    */
  var privatePasswordLeakVerification: js.UndefOr[SchemaGoogleCloudRecaptchaenterpriseV1PrivatePasswordLeakVerification] = js.undefined
  
  /**
    * Output only. The risk analysis result for the event being assessed.
    */
  var riskAnalysis: js.UndefOr[SchemaGoogleCloudRecaptchaenterpriseV1RiskAnalysis] = js.undefined
  
  /**
    * Output only. Properties of the provided event token.
    */
  var tokenProperties: js.UndefOr[SchemaGoogleCloudRecaptchaenterpriseV1TokenProperties] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1Assessment {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1Assessment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1Assessment]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1Assessment](x: Self) {
    
    inline def setAccountDefenderAssessment(value: SchemaGoogleCloudRecaptchaenterpriseV1AccountDefenderAssessment): Self = StObject.set(x, "accountDefenderAssessment", value.asInstanceOf[js.Any])
    
    inline def setAccountDefenderAssessmentUndefined: Self = StObject.set(x, "accountDefenderAssessment", js.undefined)
    
    inline def setEvent(value: SchemaGoogleCloudRecaptchaenterpriseV1Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrivatePasswordLeakVerification(value: SchemaGoogleCloudRecaptchaenterpriseV1PrivatePasswordLeakVerification): Self = StObject.set(x, "privatePasswordLeakVerification", value.asInstanceOf[js.Any])
    
    inline def setPrivatePasswordLeakVerificationUndefined: Self = StObject.set(x, "privatePasswordLeakVerification", js.undefined)
    
    inline def setRiskAnalysis(value: SchemaGoogleCloudRecaptchaenterpriseV1RiskAnalysis): Self = StObject.set(x, "riskAnalysis", value.asInstanceOf[js.Any])
    
    inline def setRiskAnalysisUndefined: Self = StObject.set(x, "riskAnalysis", js.undefined)
    
    inline def setTokenProperties(value: SchemaGoogleCloudRecaptchaenterpriseV1TokenProperties): Self = StObject.set(x, "tokenProperties", value.asInstanceOf[js.Any])
    
    inline def setTokenPropertiesUndefined: Self = StObject.set(x, "tokenProperties", js.undefined)
  }
}
