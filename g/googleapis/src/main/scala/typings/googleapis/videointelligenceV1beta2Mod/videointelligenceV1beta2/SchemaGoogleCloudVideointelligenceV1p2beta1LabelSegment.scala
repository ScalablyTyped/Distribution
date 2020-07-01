package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video segment level annotation results for label detection.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegment extends js.Object {
  /**
    * Confidence that the label is accurate. Range: [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Video segment where a label was detected.
    */
  var segment: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegment {
  @scala.inline
  def apply(
    confidence: js.UndefOr[Double] = js.undefined,
    segment: SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment = null
  ): SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.get.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegment]
  }
}

