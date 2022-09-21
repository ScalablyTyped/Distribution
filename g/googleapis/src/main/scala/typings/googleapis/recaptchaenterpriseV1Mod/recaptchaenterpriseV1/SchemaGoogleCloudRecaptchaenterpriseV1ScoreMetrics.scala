package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1ScoreMetrics extends StObject {
  
  /**
    * Action-based metrics. The map key is the action name which specified by the site owners at time of the "execute" client-side call. Populated only for SCORE keys.
    */
  var actionMetrics: js.UndefOr[StringDictionary[SchemaGoogleCloudRecaptchaenterpriseV1ScoreDistribution] | Null] = js.undefined
  
  /**
    * Aggregated score metrics for all traffic.
    */
  var overallMetrics: js.UndefOr[SchemaGoogleCloudRecaptchaenterpriseV1ScoreDistribution] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1ScoreMetrics {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1ScoreMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1ScoreMetrics]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1ScoreMetrics](x: Self) {
    
    inline def setActionMetrics(value: StringDictionary[SchemaGoogleCloudRecaptchaenterpriseV1ScoreDistribution]): Self = StObject.set(x, "actionMetrics", value.asInstanceOf[js.Any])
    
    inline def setActionMetricsNull: Self = StObject.set(x, "actionMetrics", null)
    
    inline def setActionMetricsUndefined: Self = StObject.set(x, "actionMetrics", js.undefined)
    
    inline def setOverallMetrics(value: SchemaGoogleCloudRecaptchaenterpriseV1ScoreDistribution): Self = StObject.set(x, "overallMetrics", value.asInstanceOf[js.Any])
    
    inline def setOverallMetricsUndefined: Self = StObject.set(x, "overallMetrics", js.undefined)
  }
}
