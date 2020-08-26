package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video frame level annotation results for label detection.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1beta2LabelFrame extends js.Object {
  /**
    * Confidence that the label is accurate. Range: [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the
    * video frame for this location.
    */
  var timeOffset: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1beta2LabelFrame {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2LabelFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2LabelFrame]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2LabelFrameOps[Self <: SchemaGoogleCloudVideointelligenceV1beta2LabelFrame] (val x: Self) extends AnyVal {
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
    def setTimeOffset(value: String): Self = this.set("timeOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeOffset: Self = this.set("timeOffset", js.undefined)
  }
  
}

