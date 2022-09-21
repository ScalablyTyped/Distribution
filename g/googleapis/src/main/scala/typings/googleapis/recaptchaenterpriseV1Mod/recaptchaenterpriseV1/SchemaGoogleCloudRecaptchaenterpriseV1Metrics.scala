package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1Metrics extends StObject {
  
  /**
    * Metrics will be continuous and in order by dates, and in the granularity of day. Only challenge-based keys (CHECKBOX, INVISIBLE), will have challenge-based data.
    */
  var challengeMetrics: js.UndefOr[js.Array[SchemaGoogleCloudRecaptchaenterpriseV1ChallengeMetrics]] = js.undefined
  
  /**
    * Output only. The name of the metrics, in the format "projects/{project\}/keys/{key\}/metrics".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metrics will be continuous and in order by dates, and in the granularity of day. All Key types should have score-based data.
    */
  var scoreMetrics: js.UndefOr[js.Array[SchemaGoogleCloudRecaptchaenterpriseV1ScoreMetrics]] = js.undefined
  
  /**
    * Inclusive start time aligned to a day (UTC).
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1Metrics {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1Metrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1Metrics]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1Metrics](x: Self) {
    
    inline def setChallengeMetrics(value: js.Array[SchemaGoogleCloudRecaptchaenterpriseV1ChallengeMetrics]): Self = StObject.set(x, "challengeMetrics", value.asInstanceOf[js.Any])
    
    inline def setChallengeMetricsUndefined: Self = StObject.set(x, "challengeMetrics", js.undefined)
    
    inline def setChallengeMetricsVarargs(value: SchemaGoogleCloudRecaptchaenterpriseV1ChallengeMetrics*): Self = StObject.set(x, "challengeMetrics", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScoreMetrics(value: js.Array[SchemaGoogleCloudRecaptchaenterpriseV1ScoreMetrics]): Self = StObject.set(x, "scoreMetrics", value.asInstanceOf[js.Any])
    
    inline def setScoreMetricsUndefined: Self = StObject.set(x, "scoreMetrics", js.undefined)
    
    inline def setScoreMetricsVarargs(value: SchemaGoogleCloudRecaptchaenterpriseV1ScoreMetrics*): Self = StObject.set(x, "scoreMetrics", js.Array(value*))
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
