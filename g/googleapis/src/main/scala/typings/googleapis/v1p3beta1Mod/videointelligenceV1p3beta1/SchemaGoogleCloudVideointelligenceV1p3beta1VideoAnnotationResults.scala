package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Annotation results for a single video.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationResults extends js.Object {
  /**
    * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
    * some videos may succeed and some may fail.
    */
  var error: js.UndefOr[SchemaGoogleRpcStatus] = js.native
  /**
    * Explicit content annotation.
    */
  var explicitAnnotation: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation] = js.native
  /**
    * Label annotations on frame level. There is exactly one element for each
    * unique label.
    */
  var frameLabelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation]] = js.native
  /**
    * Video file location in [Google Cloud
    * Storage](https://cloud.google.com/storage/).
    */
  var inputUri: js.UndefOr[String] = js.native
  /**
    * Annotations for list of objects detected and tracked in video.
    */
  var objectAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation]] = js.native
  /**
    * Label annotations on video level or user specified segment level. There
    * is exactly one element for each unique label.
    */
  var segmentLabelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation]] = js.native
  /**
    * Shot annotations. Each shot is represented as a video segment.
    */
  var shotAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment]] = js.native
  /**
    * Label annotations on shot level. There is exactly one element for each
    * unique label.
    */
  var shotLabelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation]] = js.native
  /**
    * Speech transcription.
    */
  var speechTranscriptions: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1SpeechTranscription]] = js.native
  /**
    * OCR text detection and tracking. Annotations for list of detected text
    * snippets. Each will have list of frame information associated with it.
    */
  var textAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1TextAnnotation]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationResults {
  @scala.inline
  def apply(
    error: SchemaGoogleRpcStatus = null,
    explicitAnnotation: SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation = null,
    frameLabelAnnotations: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation] = null,
    inputUri: String = null,
    objectAnnotations: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation] = null,
    segmentLabelAnnotations: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation] = null,
    shotAnnotations: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment] = null,
    shotLabelAnnotations: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation] = null,
    speechTranscriptions: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1SpeechTranscription] = null,
    textAnnotations: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1TextAnnotation] = null
  ): SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (explicitAnnotation != null) __obj.updateDynamic("explicitAnnotation")(explicitAnnotation.asInstanceOf[js.Any])
    if (frameLabelAnnotations != null) __obj.updateDynamic("frameLabelAnnotations")(frameLabelAnnotations.asInstanceOf[js.Any])
    if (inputUri != null) __obj.updateDynamic("inputUri")(inputUri.asInstanceOf[js.Any])
    if (objectAnnotations != null) __obj.updateDynamic("objectAnnotations")(objectAnnotations.asInstanceOf[js.Any])
    if (segmentLabelAnnotations != null) __obj.updateDynamic("segmentLabelAnnotations")(segmentLabelAnnotations.asInstanceOf[js.Any])
    if (shotAnnotations != null) __obj.updateDynamic("shotAnnotations")(shotAnnotations.asInstanceOf[js.Any])
    if (shotLabelAnnotations != null) __obj.updateDynamic("shotLabelAnnotations")(shotLabelAnnotations.asInstanceOf[js.Any])
    if (speechTranscriptions != null) __obj.updateDynamic("speechTranscriptions")(speechTranscriptions.asInstanceOf[js.Any])
    if (textAnnotations != null) __obj.updateDynamic("textAnnotations")(textAnnotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationResults]
  }
}

