package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video annotation progress. Included in the `metadata` field of the
  * `Operation` returned by the `GetOperation` call of the
  * `google::longrunning::Operations` service.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoProgress extends js.Object {
  /**
    * Progress metadata for all videos specified in `AnnotateVideoRequest`.
    */
  var annotationProgress: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationProgress]] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoProgress {
  @scala.inline
  def apply(
    annotationProgress: js.Array[SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationProgress] = null
  ): SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    if (annotationProgress != null) __obj.updateDynamic("annotationProgress")(annotationProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1AnnotateVideoProgress]
  }
}

