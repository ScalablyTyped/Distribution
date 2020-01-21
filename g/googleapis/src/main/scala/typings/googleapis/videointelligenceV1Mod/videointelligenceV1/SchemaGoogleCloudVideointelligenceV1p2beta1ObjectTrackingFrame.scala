package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video frame level annotations for object detection and tracking. This field
  * stores per frame location, time offset, and confidence.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame extends js.Object {
  /**
    * The normalized bounding box location of this object track for the frame.
    */
  var normalizedBoundingBox: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBox] = js.native
  /**
    * The timestamp of the frame in microseconds.
    */
  var timeOffset: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame {
  @scala.inline
  def apply(
    normalizedBoundingBox: SchemaGoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBox = null,
    timeOffset: String = null
  ): SchemaGoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame = {
    val __obj = js.Dynamic.literal()
    if (normalizedBoundingBox != null) __obj.updateDynamic("normalizedBoundingBox")(normalizedBoundingBox.asInstanceOf[js.Any])
    if (timeOffset != null) __obj.updateDynamic("timeOffset")(timeOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1ObjectTrackingFrame]
  }
}

