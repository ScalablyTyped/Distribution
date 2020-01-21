package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video annotation response. Included in the `response` field of the
  * `Operation` returned by the `GetOperation` call of the
  * `google::longrunning::Operations` service.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoResponse extends js.Object {
  /**
    * Annotation results for all videos specified in `AnnotateVideoRequest`.
    */
  var annotationResults: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationResults]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoResponse {
  @scala.inline
  def apply(
    annotationResults: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationResults] = null
  ): SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    if (annotationResults != null) __obj.updateDynamic("annotationResults")(annotationResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoResponse]
  }
}

