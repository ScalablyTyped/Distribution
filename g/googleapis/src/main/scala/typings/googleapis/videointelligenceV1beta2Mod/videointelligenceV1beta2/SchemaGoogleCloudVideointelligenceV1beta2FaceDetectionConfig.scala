package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1beta2FaceDetectionConfig extends StObject {
  
  /**
    * Whether to enable face attributes detection, such as glasses, dark_glasses, mouth_open etc. Ignored if 'include_bounding_boxes' is set to false.
    */
  var includeAttributes: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether bounding boxes are included in the face annotation output.
    */
  var includeBoundingBoxes: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Model to use for face detection. Supported values: "builtin/stable" (the default if unset) and "builtin/latest".
    */
  var model: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2FaceDetectionConfig {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1beta2FaceDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2FaceDetectionConfig]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1beta2FaceDetectionConfig](x: Self) {
    
    inline def setIncludeAttributes(value: Boolean): Self = StObject.set(x, "includeAttributes", value.asInstanceOf[js.Any])
    
    inline def setIncludeAttributesNull: Self = StObject.set(x, "includeAttributes", null)
    
    inline def setIncludeAttributesUndefined: Self = StObject.set(x, "includeAttributes", js.undefined)
    
    inline def setIncludeBoundingBoxes(value: Boolean): Self = StObject.set(x, "includeBoundingBoxes", value.asInstanceOf[js.Any])
    
    inline def setIncludeBoundingBoxesNull: Self = StObject.set(x, "includeBoundingBoxes", null)
    
    inline def setIncludeBoundingBoxesUndefined: Self = StObject.set(x, "includeBoundingBoxes", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
