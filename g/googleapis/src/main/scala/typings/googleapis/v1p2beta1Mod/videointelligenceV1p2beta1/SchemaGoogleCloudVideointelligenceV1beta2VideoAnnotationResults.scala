package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Annotation results for a single video.
  */
trait SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults extends StObject {
  
  /**
    * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
    * some videos may succeed and some may fail.
    */
  var error: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
  
  /**
    * Explicit content annotation.
    */
  var explicitAnnotation: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation] = js.undefined
  
  /**
    * Label annotations on frame level. There is exactly one element for each
    * unique label.
    */
  var frameLabelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.undefined
  
  /**
    * Video file location in [Google Cloud
    * Storage](https://cloud.google.com/storage/).
    */
  var inputUri: js.UndefOr[String] = js.undefined
  
  /**
    * Annotations for list of objects detected and tracked in video.
    */
  var objectAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingAnnotation]] = js.undefined
  
  /**
    * Label annotations on video level or user specified segment level. There
    * is exactly one element for each unique label.
    */
  var segmentLabelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.undefined
  
  /**
    * Shot annotations. Each shot is represented as a video segment.
    */
  var shotAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoSegment]] = js.undefined
  
  /**
    * Label annotations on shot level. There is exactly one element for each
    * unique label.
    */
  var shotLabelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.undefined
  
  /**
    * Speech transcription.
    */
  var speechTranscriptions: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2SpeechTranscription]] = js.undefined
  
  /**
    * OCR text detection and tracking. Annotations for list of detected text
    * snippets. Each will have list of frame information associated with it.
    */
  var textAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2TextAnnotation]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults](x: Self) {
    
    inline def setError(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExplicitAnnotation(value: SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation): Self = StObject.set(x, "explicitAnnotation", value.asInstanceOf[js.Any])
    
    inline def setExplicitAnnotationUndefined: Self = StObject.set(x, "explicitAnnotation", js.undefined)
    
    inline def setFrameLabelAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = StObject.set(x, "frameLabelAnnotations", value.asInstanceOf[js.Any])
    
    inline def setFrameLabelAnnotationsUndefined: Self = StObject.set(x, "frameLabelAnnotations", js.undefined)
    
    inline def setFrameLabelAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation*): Self = StObject.set(x, "frameLabelAnnotations", js.Array(value :_*))
    
    inline def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    inline def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
    
    inline def setObjectAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingAnnotation]): Self = StObject.set(x, "objectAnnotations", value.asInstanceOf[js.Any])
    
    inline def setObjectAnnotationsUndefined: Self = StObject.set(x, "objectAnnotations", js.undefined)
    
    inline def setObjectAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingAnnotation*): Self = StObject.set(x, "objectAnnotations", js.Array(value :_*))
    
    inline def setSegmentLabelAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = StObject.set(x, "segmentLabelAnnotations", value.asInstanceOf[js.Any])
    
    inline def setSegmentLabelAnnotationsUndefined: Self = StObject.set(x, "segmentLabelAnnotations", js.undefined)
    
    inline def setSegmentLabelAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation*): Self = StObject.set(x, "segmentLabelAnnotations", js.Array(value :_*))
    
    inline def setShotAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoSegment]): Self = StObject.set(x, "shotAnnotations", value.asInstanceOf[js.Any])
    
    inline def setShotAnnotationsUndefined: Self = StObject.set(x, "shotAnnotations", js.undefined)
    
    inline def setShotAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2VideoSegment*): Self = StObject.set(x, "shotAnnotations", js.Array(value :_*))
    
    inline def setShotLabelAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = StObject.set(x, "shotLabelAnnotations", value.asInstanceOf[js.Any])
    
    inline def setShotLabelAnnotationsUndefined: Self = StObject.set(x, "shotLabelAnnotations", js.undefined)
    
    inline def setShotLabelAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation*): Self = StObject.set(x, "shotLabelAnnotations", js.Array(value :_*))
    
    inline def setSpeechTranscriptions(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2SpeechTranscription]): Self = StObject.set(x, "speechTranscriptions", value.asInstanceOf[js.Any])
    
    inline def setSpeechTranscriptionsUndefined: Self = StObject.set(x, "speechTranscriptions", js.undefined)
    
    inline def setSpeechTranscriptionsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2SpeechTranscription*): Self = StObject.set(x, "speechTranscriptions", js.Array(value :_*))
    
    inline def setTextAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2TextAnnotation]): Self = StObject.set(x, "textAnnotations", value.asInstanceOf[js.Any])
    
    inline def setTextAnnotationsUndefined: Self = StObject.set(x, "textAnnotations", js.undefined)
    
    inline def setTextAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2TextAnnotation*): Self = StObject.set(x, "textAnnotations", js.Array(value :_*))
  }
}
