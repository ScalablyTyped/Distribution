package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Config for SHOT_CHANGE_DETECTION.
  */
trait SchemaGoogleCloudVideointelligenceV1ShotChangeDetectionConfig extends StObject {
  
  /**
    * Model to use for shot change detection. Supported values:
    * &quot;builtin/stable&quot; (the default if unset) and
    * &quot;builtin/latest&quot;.
    */
  var model: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1ShotChangeDetectionConfig {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1ShotChangeDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1ShotChangeDetectionConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1ShotChangeDetectionConfigMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1ShotChangeDetectionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
