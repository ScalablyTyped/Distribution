package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults extends StObject {
  
  /**
    * Explicit content annotation results.
    */
  var explicitAnnotation: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation] = js.undefined
  
  /**
    * Timestamp of the processed frame in microseconds.
    */
  var frameTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Label annotation results.
    */
  var labelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation]] = js.undefined
  
  /**
    * Object tracking results.
    */
  var objectAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation]] = js.undefined
  
  /**
    * Shot annotation results. Each shot is represented as a video segment.
    */
  var shotAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults](x: Self) {
    
    inline def setExplicitAnnotation(value: SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation): Self = StObject.set(x, "explicitAnnotation", value.asInstanceOf[js.Any])
    
    inline def setExplicitAnnotationUndefined: Self = StObject.set(x, "explicitAnnotation", js.undefined)
    
    inline def setFrameTimestamp(value: String): Self = StObject.set(x, "frameTimestamp", value.asInstanceOf[js.Any])
    
    inline def setFrameTimestampNull: Self = StObject.set(x, "frameTimestamp", null)
    
    inline def setFrameTimestampUndefined: Self = StObject.set(x, "frameTimestamp", js.undefined)
    
    inline def setLabelAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation]): Self = StObject.set(x, "labelAnnotations", value.asInstanceOf[js.Any])
    
    inline def setLabelAnnotationsUndefined: Self = StObject.set(x, "labelAnnotations", js.undefined)
    
    inline def setLabelAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation*): Self = StObject.set(x, "labelAnnotations", js.Array(value*))
    
    inline def setObjectAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation]): Self = StObject.set(x, "objectAnnotations", value.asInstanceOf[js.Any])
    
    inline def setObjectAnnotationsUndefined: Self = StObject.set(x, "objectAnnotations", js.undefined)
    
    inline def setObjectAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation*): Self = StObject.set(x, "objectAnnotations", js.Array(value*))
    
    inline def setShotAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment]): Self = StObject.set(x, "shotAnnotations", value.asInstanceOf[js.Any])
    
    inline def setShotAnnotationsUndefined: Self = StObject.set(x, "shotAnnotations", js.undefined)
    
    inline def setShotAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment*): Self = StObject.set(x, "shotAnnotations", js.Array(value*))
  }
}
