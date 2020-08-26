package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Color information consists of RGB channels, score, and the fraction of the
  * image that the color occupies in the image.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1ColorInfo extends js.Object {
  /**
    * RGB components of the color.
    */
  var color: js.UndefOr[SchemaColor] = js.native
  /**
    * The fraction of pixels the color occupies in the image. Value in range
    * [0, 1].
    */
  var pixelFraction: js.UndefOr[Double] = js.native
  /**
    * Image-specific score for this color. Value in range [0, 1].
    */
  var score: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudVisionV1p3beta1ColorInfo {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1ColorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1ColorInfo]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1ColorInfoOps[Self <: SchemaGoogleCloudVisionV1p3beta1ColorInfo] (val x: Self) extends AnyVal {
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
    def setColor(value: SchemaColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setPixelFraction(value: Double): Self = this.set("pixelFraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelFraction: Self = this.set("pixelFraction", js.undefined)
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
  }
  
}

