package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1ImportErrorsConfig extends StObject {
  
  /**
    * Google Cloud Storage path for import errors. This must be an empty, existing Cloud Storage bucket. Import errors will be written to a file in this bucket, one per line, as a JSON-encoded `google.rpc.Status` message.
    */
  var gcsPrefix: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1ImportErrorsConfig {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1ImportErrorsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1ImportErrorsConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1ImportErrorsConfig](x: Self) {
    
    inline def setGcsPrefix(value: String): Self = StObject.set(x, "gcsPrefix", value.asInstanceOf[js.Any])
    
    inline def setGcsPrefixNull: Self = StObject.set(x, "gcsPrefix", null)
    
    inline def setGcsPrefixUndefined: Self = StObject.set(x, "gcsPrefix", js.undefined)
  }
}
