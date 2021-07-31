package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Config for EXPLICIT_CONTENT_DETECTION.
  */
trait SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentDetectionConfig extends StObject {
  
  /**
    * Model to use for explicit content detection. Supported values:
    * &quot;builtin/stable&quot; (the default if unset) and
    * &quot;builtin/latest&quot;.
    */
  var model: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentDetectionConfig {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentDetectionConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentDetectionConfigMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentDetectionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
