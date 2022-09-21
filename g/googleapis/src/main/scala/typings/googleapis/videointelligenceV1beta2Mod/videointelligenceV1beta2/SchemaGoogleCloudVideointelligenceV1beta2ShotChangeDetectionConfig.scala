package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1beta2ShotChangeDetectionConfig extends StObject {
  
  /**
    * Model to use for shot change detection. Supported values: "builtin/stable" (the default if unset), "builtin/latest", and "builtin/legacy".
    */
  var model: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2ShotChangeDetectionConfig {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1beta2ShotChangeDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2ShotChangeDetectionConfig]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1beta2ShotChangeDetectionConfig](x: Self) {
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
