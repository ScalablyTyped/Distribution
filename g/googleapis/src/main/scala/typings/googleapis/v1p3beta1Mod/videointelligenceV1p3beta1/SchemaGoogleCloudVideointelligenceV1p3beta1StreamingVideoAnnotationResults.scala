package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Streaming annotation results corresponding to a portion of the video that
  * is currently being processed.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults extends js.Object {
  /**
    * Explicit content annotation results.
    */
  var explicitAnnotation: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation] = js.native
  /**
    * Label annotation results.
    */
  var labelAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation]] = js.native
  /**
    * Object tracking results.
    */
  var objectAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation]] = js.native
  /**
    * Shot annotation results. Each shot is represented as a video segment.
    */
  var shotAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults {
  @scala.inline
  def apply(
    explicitAnnotation: SchemaGoogleCloudVideointelligenceV1p3beta1ExplicitContentAnnotation = null,
    labelAnnotations: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1LabelAnnotation] = null,
    objectAnnotations: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation] = null,
    shotAnnotations: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoSegment] = null
  ): SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    if (explicitAnnotation != null) __obj.updateDynamic("explicitAnnotation")(explicitAnnotation.asInstanceOf[js.Any])
    if (labelAnnotations != null) __obj.updateDynamic("labelAnnotations")(labelAnnotations.asInstanceOf[js.Any])
    if (objectAnnotations != null) __obj.updateDynamic("objectAnnotations")(objectAnnotations.asInstanceOf[js.Any])
    if (shotAnnotations != null) __obj.updateDynamic("shotAnnotations")(shotAnnotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1StreamingVideoAnnotationResults]
  }
}

