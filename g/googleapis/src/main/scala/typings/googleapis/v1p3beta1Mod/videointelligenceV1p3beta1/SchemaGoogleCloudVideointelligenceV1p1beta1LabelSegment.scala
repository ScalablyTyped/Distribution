package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video segment level annotation results for label detection.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p1beta1LabelSegment extends js.Object {
  /**
    * Confidence that the label is accurate. Range: [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Video segment where a label was detected.
    */
  var segment: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p1beta1VideoSegment] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p1beta1LabelSegment {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p1beta1LabelSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p1beta1LabelSegment]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p1beta1LabelSegmentOps[Self <: SchemaGoogleCloudVideointelligenceV1p1beta1LabelSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    @scala.inline
    def setSegment(value: SchemaGoogleCloudVideointelligenceV1p1beta1VideoSegment): Self = this.set("segment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
  }
  
}

