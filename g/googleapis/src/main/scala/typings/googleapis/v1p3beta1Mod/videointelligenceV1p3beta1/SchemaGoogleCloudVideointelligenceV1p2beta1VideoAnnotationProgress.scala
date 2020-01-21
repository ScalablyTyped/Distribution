package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Annotation progress for a single video.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress extends js.Object {
  /**
    * Video file location in [Google Cloud
    * Storage](https://cloud.google.com/storage/).
    */
  var inputUri: js.UndefOr[String] = js.native
  /**
    * Approximate percentage processed thus far. Guaranteed to be 100 when
    * fully processed.
    */
  var progressPercent: js.UndefOr[Double] = js.native
  /**
    * Time when the request was received.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Time of the most recent update.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress {
  @scala.inline
  def apply(
    inputUri: String = null,
    progressPercent: Int | Double = null,
    startTime: String = null,
    updateTime: String = null
  ): SchemaGoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress = {
    val __obj = js.Dynamic.literal()
    if (inputUri != null) __obj.updateDynamic("inputUri")(inputUri.asInstanceOf[js.Any])
    if (progressPercent != null) __obj.updateDynamic("progressPercent")(progressPercent.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress]
  }
}

