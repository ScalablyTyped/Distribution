package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video frame level annotation results for explicit content.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentFrame extends js.Object {
  /**
    * Likelihood of the pornography content..
    */
  var pornographyLikelihood: js.UndefOr[String] = js.native
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the
    * video frame for this location.
    */
  var timeOffset: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentFrame {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentFrame]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentFrameOps[Self <: SchemaGoogleCloudVideointelligenceV1p2beta1ExplicitContentFrame] (val x: Self) extends AnyVal {
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
    def setPornographyLikelihood(value: String): Self = this.set("pornographyLikelihood", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePornographyLikelihood: Self = this.set("pornographyLikelihood", js.undefined)
    @scala.inline
    def setTimeOffset(value: String): Self = this.set("timeOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeOffset: Self = this.set("timeOffset", js.undefined)
  }
  
}

