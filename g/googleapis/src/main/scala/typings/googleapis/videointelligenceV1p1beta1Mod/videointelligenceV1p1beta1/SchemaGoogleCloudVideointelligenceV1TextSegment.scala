package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video segment level annotation results for text detection.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1TextSegment extends js.Object {
  /**
    * Confidence for the track of detected text. It is calculated as the
    * highest over all frames where OCR detected text appears.
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Information related to the frames where OCR detected text appears.
    */
  var frames: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1TextFrame]] = js.native
  /**
    * Video segment where a text snippet was detected.
    */
  var segment: js.UndefOr[SchemaGoogleCloudVideointelligenceV1VideoSegment] = js.native
}

object SchemaGoogleCloudVideointelligenceV1TextSegment {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1TextSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1TextSegment]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1TextSegmentOps[Self <: SchemaGoogleCloudVideointelligenceV1TextSegment] (val x: Self) extends AnyVal {
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
    def setFramesVarargs(value: SchemaGoogleCloudVideointelligenceV1TextFrame*): Self = this.set("frames", js.Array(value :_*))
    @scala.inline
    def setFrames(value: js.Array[SchemaGoogleCloudVideointelligenceV1TextFrame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrames: Self = this.set("frames", js.undefined)
    @scala.inline
    def setSegment(value: SchemaGoogleCloudVideointelligenceV1VideoSegment): Self = this.set("segment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
  }
  
}

