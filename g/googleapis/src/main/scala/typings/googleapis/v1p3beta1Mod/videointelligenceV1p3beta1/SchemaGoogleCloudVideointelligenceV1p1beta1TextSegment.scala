package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video segment level annotation results for text detection.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p1beta1TextSegment extends js.Object {
  /**
    * Confidence for the track of detected text. It is calculated as the
    * highest over all frames where OCR detected text appears.
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Information related to the frames where OCR detected text appears.
    */
  var frames: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p1beta1TextFrame]] = js.native
  /**
    * Video segment where a text snippet was detected.
    */
  var segment: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p1beta1VideoSegment] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p1beta1TextSegment {
  @scala.inline
  def apply(
    confidence: Int | Double = null,
    frames: js.Array[SchemaGoogleCloudVideointelligenceV1p1beta1TextFrame] = null,
    segment: SchemaGoogleCloudVideointelligenceV1p1beta1VideoSegment = null
  ): SchemaGoogleCloudVideointelligenceV1p1beta1TextSegment = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p1beta1TextSegment]
  }
}

