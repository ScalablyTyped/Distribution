package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1TestingOptions extends StObject {
  
  /**
    * For challenge-based keys only (CHECKBOX, INVISIBLE), all challenge requests for this site will return nocaptcha if NOCAPTCHA, or an unsolvable challenge if CHALLENGE.
    */
  var testingChallenge: js.UndefOr[String | Null] = js.undefined
  
  /**
    * All assessments for this Key will return this score. Must be between 0 (likely not legitimate) and 1 (likely legitimate) inclusive.
    */
  var testingScore: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1TestingOptions {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1TestingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1TestingOptions]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1TestingOptions](x: Self) {
    
    inline def setTestingChallenge(value: String): Self = StObject.set(x, "testingChallenge", value.asInstanceOf[js.Any])
    
    inline def setTestingChallengeNull: Self = StObject.set(x, "testingChallenge", null)
    
    inline def setTestingChallengeUndefined: Self = StObject.set(x, "testingChallenge", js.undefined)
    
    inline def setTestingScore(value: Double): Self = StObject.set(x, "testingScore", value.asInstanceOf[js.Any])
    
    inline def setTestingScoreNull: Self = StObject.set(x, "testingScore", null)
    
    inline def setTestingScoreUndefined: Self = StObject.set(x, "testingScore", js.undefined)
  }
}
