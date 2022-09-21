package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1ChallengeMetrics extends StObject {
  
  /**
    * Count of submitted challenge solutions that were incorrect or otherwise deemed suspicious such that a subsequent challenge was triggered.
    */
  var failedCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Count of nocaptchas (successful verification without a challenge) issued.
    */
  var nocaptchaCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Count of reCAPTCHA checkboxes or badges rendered. This is mostly equivalent to a count of pageloads for pages that include reCAPTCHA.
    */
  var pageloadCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Count of nocaptchas (successful verification without a challenge) plus submitted challenge solutions that were correct and resulted in verification.
    */
  var passedCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1ChallengeMetrics {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1ChallengeMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1ChallengeMetrics]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1ChallengeMetrics](x: Self) {
    
    inline def setFailedCount(value: String): Self = StObject.set(x, "failedCount", value.asInstanceOf[js.Any])
    
    inline def setFailedCountNull: Self = StObject.set(x, "failedCount", null)
    
    inline def setFailedCountUndefined: Self = StObject.set(x, "failedCount", js.undefined)
    
    inline def setNocaptchaCount(value: String): Self = StObject.set(x, "nocaptchaCount", value.asInstanceOf[js.Any])
    
    inline def setNocaptchaCountNull: Self = StObject.set(x, "nocaptchaCount", null)
    
    inline def setNocaptchaCountUndefined: Self = StObject.set(x, "nocaptchaCount", js.undefined)
    
    inline def setPageloadCount(value: String): Self = StObject.set(x, "pageloadCount", value.asInstanceOf[js.Any])
    
    inline def setPageloadCountNull: Self = StObject.set(x, "pageloadCount", null)
    
    inline def setPageloadCountUndefined: Self = StObject.set(x, "pageloadCount", js.undefined)
    
    inline def setPassedCount(value: String): Self = StObject.set(x, "passedCount", value.asInstanceOf[js.Any])
    
    inline def setPassedCountNull: Self = StObject.set(x, "passedCount", null)
    
    inline def setPassedCountUndefined: Self = StObject.set(x, "passedCount", js.undefined)
  }
}
