package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1p1beta1PersonDetectionConfig extends StObject {
  
  /**
    * Whether to enable person attributes detection, such as cloth color (black, blue, etc), type (coat, dress, etc), pattern (plain, floral, etc), hair, etc. Ignored if 'include_bounding_boxes' is set to false.
    */
  var includeAttributes: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether bounding boxes are included in the person detection annotation output.
    */
  var includeBoundingBoxes: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to enable pose landmarks detection. Ignored if 'include_bounding_boxes' is set to false.
    */
  var includePoseLandmarks: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p1beta1PersonDetectionConfig {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p1beta1PersonDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p1beta1PersonDetectionConfig]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p1beta1PersonDetectionConfig](x: Self) {
    
    inline def setIncludeAttributes(value: Boolean): Self = StObject.set(x, "includeAttributes", value.asInstanceOf[js.Any])
    
    inline def setIncludeAttributesNull: Self = StObject.set(x, "includeAttributes", null)
    
    inline def setIncludeAttributesUndefined: Self = StObject.set(x, "includeAttributes", js.undefined)
    
    inline def setIncludeBoundingBoxes(value: Boolean): Self = StObject.set(x, "includeBoundingBoxes", value.asInstanceOf[js.Any])
    
    inline def setIncludeBoundingBoxesNull: Self = StObject.set(x, "includeBoundingBoxes", null)
    
    inline def setIncludeBoundingBoxesUndefined: Self = StObject.set(x, "includeBoundingBoxes", js.undefined)
    
    inline def setIncludePoseLandmarks(value: Boolean): Self = StObject.set(x, "includePoseLandmarks", value.asInstanceOf[js.Any])
    
    inline def setIncludePoseLandmarksNull: Self = StObject.set(x, "includePoseLandmarks", null)
    
    inline def setIncludePoseLandmarksUndefined: Self = StObject.set(x, "includePoseLandmarks", js.undefined)
  }
}
