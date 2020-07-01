package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Color information consists of RGB channels, score, and the fraction of the
  * image that the color occupies in the image.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1ColorInfo extends js.Object {
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

object SchemaGoogleCloudVisionV1p2beta1ColorInfo {
  @scala.inline
  def apply(
    color: SchemaColor = null,
    pixelFraction: js.UndefOr[Double] = js.undefined,
    score: js.UndefOr[Double] = js.undefined
  ): SchemaGoogleCloudVisionV1p2beta1ColorInfo = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelFraction)) __obj.updateDynamic("pixelFraction")(pixelFraction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1ColorInfo]
  }
}

