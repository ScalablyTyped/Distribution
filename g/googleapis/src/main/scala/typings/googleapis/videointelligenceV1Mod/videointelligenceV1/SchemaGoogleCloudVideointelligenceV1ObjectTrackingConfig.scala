package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1ObjectTrackingConfig extends StObject {
  
  /**
    * Model to use for object tracking. Supported values: "builtin/stable" (the default if unset) and "builtin/latest".
    */
  var model: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1ObjectTrackingConfig {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1ObjectTrackingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1ObjectTrackingConfig]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1ObjectTrackingConfig](x: Self) {
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
