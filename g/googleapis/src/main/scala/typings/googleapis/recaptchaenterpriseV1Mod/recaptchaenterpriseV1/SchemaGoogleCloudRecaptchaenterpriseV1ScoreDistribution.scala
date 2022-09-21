package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1ScoreDistribution extends StObject {
  
  /**
    * Map key is score value multiplied by 100. The scores are discrete values between [0, 1]. The maximum number of buckets is on order of a few dozen, but typically much lower (ie. 10).
    */
  var scoreBuckets: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1ScoreDistribution {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1ScoreDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1ScoreDistribution]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1ScoreDistribution](x: Self) {
    
    inline def setScoreBuckets(value: StringDictionary[String]): Self = StObject.set(x, "scoreBuckets", value.asInstanceOf[js.Any])
    
    inline def setScoreBucketsNull: Self = StObject.set(x, "scoreBuckets", null)
    
    inline def setScoreBucketsUndefined: Self = StObject.set(x, "scoreBuckets", js.undefined)
  }
}
