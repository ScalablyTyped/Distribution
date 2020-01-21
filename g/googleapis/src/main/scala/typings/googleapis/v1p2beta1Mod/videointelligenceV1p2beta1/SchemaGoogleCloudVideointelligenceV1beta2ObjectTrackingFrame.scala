package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video frame level annotations for object detection and tracking. This field
  * stores per frame location, time offset, and confidence.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingFrame extends js.Object {
  /**
    * The normalized bounding box location of this object track for the frame.
    */
  var normalizedBoundingBox: js.UndefOr[SchemaGoogleCloudVideointelligenceV1beta2NormalizedBoundingBox] = js.native
  /**
    * The timestamp of the frame in microseconds.
    */
  var timeOffset: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingFrame {
  @scala.inline
  def apply(
    normalizedBoundingBox: SchemaGoogleCloudVideointelligenceV1beta2NormalizedBoundingBox = null,
    timeOffset: String = null
  ): SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingFrame = {
    val __obj = js.Dynamic.literal()
    if (normalizedBoundingBox != null) __obj.updateDynamic("normalizedBoundingBox")(normalizedBoundingBox.asInstanceOf[js.Any])
    if (timeOffset != null) __obj.updateDynamic("timeOffset")(timeOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2ObjectTrackingFrame]
  }
}

