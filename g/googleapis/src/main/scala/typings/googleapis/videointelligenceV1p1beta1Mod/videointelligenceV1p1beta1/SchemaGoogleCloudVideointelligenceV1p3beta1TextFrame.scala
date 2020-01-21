package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video frame level annotation results for text annotation (OCR). Contains
  * information regarding timestamp and bounding box locations for the frames
  * containing detected OCR text snippets.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1TextFrame extends js.Object {
  /**
    * Bounding polygon of the detected text for this frame.
    */
  var rotatedBoundingBox: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly] = js.native
  /**
    * Timestamp of this frame.
    */
  var timeOffset: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p3beta1TextFrame {
  @scala.inline
  def apply(
    rotatedBoundingBox: SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly = null,
    timeOffset: String = null
  ): SchemaGoogleCloudVideointelligenceV1p3beta1TextFrame = {
    val __obj = js.Dynamic.literal()
    if (rotatedBoundingBox != null) __obj.updateDynamic("rotatedBoundingBox")(rotatedBoundingBox.asInstanceOf[js.Any])
    if (timeOffset != null) __obj.updateDynamic("timeOffset")(timeOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1TextFrame]
  }
}

