package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Config for EXPLICIT_CONTENT_DETECTION.
  */
trait SchemaGoogleCloudVideointelligenceV1p1beta1ExplicitContentDetectionConfig extends StObject {
  
  /**
    * Model to use for explicit content detection. Supported values:
    * &quot;builtin/stable&quot; (the default if unset) and
    * &quot;builtin/latest&quot;.
    */
  var model: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p1beta1ExplicitContentDetectionConfig {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p1beta1ExplicitContentDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p1beta1ExplicitContentDetectionConfig]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p1beta1ExplicitContentDetectionConfig](x: Self) {
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
