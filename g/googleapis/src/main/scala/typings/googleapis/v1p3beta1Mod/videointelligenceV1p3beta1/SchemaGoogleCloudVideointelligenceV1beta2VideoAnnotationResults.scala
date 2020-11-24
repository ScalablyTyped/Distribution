package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Annotation results for a single video.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults extends js.Object {
  
  /**
    * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
    * some videos may succeed and some may fail.
    */
  var error: js.UndefOr[SchemaGoogleRpcStatus] = js.native
  
  /**
    * Explicit content annotation.
    */
  var explicitAnnotation: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation] = js.native
  
  /**
    * Label annotations on frame level. There is exactly one element for each
    * unique label.
    */
  var frameLabelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.native
  
  /**
    * Video file location in [Google Cloud
    * Storage](https://cloud.google.com/storage/).
    */
  var inputUri: js.UndefOr[String] = js.native
  
  /**
    * Annotations for list of objects detected and tracked in video.
    */
  var objectAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingAnnotation]] = js.native
  
  /**
    * Label annotations on video level or user specified segment level. There
    * is exactly one element for each unique label.
    */
  var segmentLabelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.native
  
  /**
    * Shot annotations. Each shot is represented as a video segment.
    */
  var shotAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoSegment]] = js.native
  
  /**
    * Label annotations on shot level. There is exactly one element for each
    * unique label.
    */
  var shotLabelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.native
  
  /**
    * Speech transcription.
    */
  var speechTranscriptions: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2SpeechTranscription]] = js.native
  
  /**
    * OCR text detection and tracking. Annotations for list of detected text
    * snippets. Each will have list of frame information associated with it.
    */
  var textAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2TextAnnotation]] = js.native
}
object SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResultsOps[Self <: SchemaGoogleCloudVideointelligenceV1beta2VideoAnnotationResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: SchemaGoogleRpcStatus): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setExplicitAnnotation(value: SchemaGoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation): Self = this.set("explicitAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitAnnotation: Self = this.set("explicitAnnotation", js.undefined)
    
    @scala.inline
    def setFrameLabelAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation*): Self = this.set("frameLabelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setFrameLabelAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = this.set("frameLabelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameLabelAnnotations: Self = this.set("frameLabelAnnotations", js.undefined)
    
    @scala.inline
    def setInputUri(value: String): Self = this.set("inputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputUri: Self = this.set("inputUri", js.undefined)
    
    @scala.inline
    def setObjectAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingAnnotation*): Self = this.set("objectAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setObjectAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingAnnotation]): Self = this.set("objectAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectAnnotations: Self = this.set("objectAnnotations", js.undefined)
    
    @scala.inline
    def setSegmentLabelAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation*): Self = this.set("segmentLabelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setSegmentLabelAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = this.set("segmentLabelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentLabelAnnotations: Self = this.set("segmentLabelAnnotations", js.undefined)
    
    @scala.inline
    def setShotAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2VideoSegment*): Self = this.set("shotAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setShotAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2VideoSegment]): Self = this.set("shotAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShotAnnotations: Self = this.set("shotAnnotations", js.undefined)
    
    @scala.inline
    def setShotLabelAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation*): Self = this.set("shotLabelAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setShotLabelAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2LabelAnnotation]): Self = this.set("shotLabelAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShotLabelAnnotations: Self = this.set("shotLabelAnnotations", js.undefined)
    
    @scala.inline
    def setSpeechTranscriptionsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2SpeechTranscription*): Self = this.set("speechTranscriptions", js.Array(value :_*))
    
    @scala.inline
    def setSpeechTranscriptions(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2SpeechTranscription]): Self = this.set("speechTranscriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeechTranscriptions: Self = this.set("speechTranscriptions", js.undefined)
    
    @scala.inline
    def setTextAnnotationsVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2TextAnnotation*): Self = this.set("textAnnotations", js.Array(value :_*))
    
    @scala.inline
    def setTextAnnotations(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2TextAnnotation]): Self = this.set("textAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAnnotations: Self = this.set("textAnnotations", js.undefined)
  }
}
