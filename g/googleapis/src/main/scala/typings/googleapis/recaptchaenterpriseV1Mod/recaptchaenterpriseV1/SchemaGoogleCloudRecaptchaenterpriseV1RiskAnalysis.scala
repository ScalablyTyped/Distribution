package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1RiskAnalysis extends StObject {
  
  /**
    * Reasons contributing to the risk analysis verdict.
    */
  var reasons: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Legitimate event score from 0.0 to 1.0. (1.0 means very likely legitimate traffic while 0.0 means very likely non-legitimate traffic).
    */
  var score: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1RiskAnalysis {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1RiskAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1RiskAnalysis]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1RiskAnalysis](x: Self) {
    
    inline def setReasons(value: js.Array[String]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsNull: Self = StObject.set(x, "reasons", null)
    
    inline def setReasonsUndefined: Self = StObject.set(x, "reasons", js.undefined)
    
    inline def setReasonsVarargs(value: String*): Self = StObject.set(x, "reasons", js.Array(value*))
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreNull: Self = StObject.set(x, "score", null)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
