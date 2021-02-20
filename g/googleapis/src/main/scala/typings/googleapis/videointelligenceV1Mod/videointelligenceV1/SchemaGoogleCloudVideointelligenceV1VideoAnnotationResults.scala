package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Annotation results for a single video.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1VideoAnnotationResults extends StObject {
  
  /**
    * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
    * some videos may succeed and some may fail.
    */
  var error: js.UndefOr[SchemaGoogleRpcStatus] = js.native
  
  /**
    * Explicit content annotation.
    */
  var explicitAnnotation: js.UndefOr[SchemaGoogleCloudVideointelligenceV1ExplicitContentAnnotation] = js.native
  
  /**
    * Label annotations on frame level. There is exactly one element for each
    * unique label.
    */
  var frameLabelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1LabelAnnotation]] = js.native
  
  /**
    * Video file location in [Google Cloud
    * Storage](https://cloud.google.com/storage/).
    */
  var inputUri: js.UndefOr[String] = js.native
  
  /**
    * Annotations for list of objects detected and tracked in video.
    */
  var objectAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1ObjectTrackingAnnotation]] = js.native
  
  /**
    * Label annotations on video level or user specified segment level. There
    * is exactly one element for each unique label.
    */
  var segmentLabelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1LabelAnnotation]] = js.native
  
  /**
    * Shot annotations. Each shot is represented as a video segment.
    */
  var shotAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1VideoSegment]] = js.native
  
  /**
    * Label annotations on shot level. There is exactly one element for each
    * unique label.
    */
  var shotLabelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1LabelAnnotation]] = js.native
  
  /**
    * Speech transcription.
    */
  var speechTranscriptions: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1SpeechTranscription]] = js.native
  
  /**
    * OCR text detection and tracking. Annotations for list of detected text
    * snippets. Each will have list of frame information associated with it.
    */
  var textAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1TextAnnotation]] = js.native
}
object SchemaGoogleCloudVideointelligenceV1VideoAnnotationResults {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1VideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1VideoAnnotationResults]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1VideoAnnotationResultsMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1VideoAnnotationResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExplicitAnnotation(value: SchemaGoogleCloudVideointelligenceV1ExplicitContentAnnotation): Self = StObject.set(x, "explicitAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitAnnotationUndefined: Self = StObject.set(x, "explicitAnnotation", js.undefined)
    
    @scala.inline
    def setFrameLabelAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1LabelAnnotation]): Self = StObject.set(x, "frameLabelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameLabelAnnotationsUndefined: Self = StObject.set(x, "frameLabelAnnotations", js.undefined)
    
    @scala.inline
    def setFrameLabelAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1LabelAnnotation*): Self = StObject.set(x, "frameLabelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
    
    @scala.inline
    def setObjectAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1ObjectTrackingAnnotation]): Self = StObject.set(x, "objectAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectAnnotationsUndefined: Self = StObject.set(x, "objectAnnotations", js.undefined)
    
    @scala.inline
    def setObjectAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1ObjectTrackingAnnotation*): Self = StObject.set(x, "objectAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setSegmentLabelAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1LabelAnnotation]): Self = StObject.set(x, "segmentLabelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentLabelAnnotationsUndefined: Self = StObject.set(x, "segmentLabelAnnotations", js.undefined)
    
    @scala.inline
    def setSegmentLabelAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1LabelAnnotation*): Self = StObject.set(x, "segmentLabelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setShotAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1VideoSegment]): Self = StObject.set(x, "shotAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShotAnnotationsUndefined: Self = StObject.set(x, "shotAnnotations", js.undefined)
    
    @scala.inline
    def setShotAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1VideoSegment*): Self = StObject.set(x, "shotAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setShotLabelAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1LabelAnnotation]): Self = StObject.set(x, "shotLabelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShotLabelAnnotationsUndefined: Self = StObject.set(x, "shotLabelAnnotations", js.undefined)
    
    @scala.inline
    def setShotLabelAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1LabelAnnotation*): Self = StObject.set(x, "shotLabelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setSpeechTranscriptions(value: js.Array[SchemaGoogleCloudVideointelligenceV1SpeechTranscription]): Self = StObject.set(x, "speechTranscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechTranscriptionsUndefined: Self = StObject.set(x, "speechTranscriptions", js.undefined)
    
    @scala.inline
    def setSpeechTranscriptionsVarargs(value: SchemaGoogleCloudVideointelligenceV1SpeechTranscription*): Self = StObject.set(x, "speechTranscriptions", js.Array(value :_*))
    
    @scala.inline
    def setTextAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1TextAnnotation]): Self = StObject.set(x, "textAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAnnotationsUndefined: Self = StObject.set(x, "textAnnotations", js.undefined)
    
    @scala.inline
    def setTextAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1TextAnnotation*): Self = StObject.set(x, "textAnnotations", js.Array(value :_*))
  }
}
