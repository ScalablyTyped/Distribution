package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A 3D position in the image, used primarily for Face detection landmarks. A
  * valid Position must have both x and y coordinates. The position coordinates
  * are in the same scale as the original image.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1Position extends js.Object {
  /**
    * X coordinate.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Y coordinate.
    */
  var y: js.UndefOr[Double] = js.native
  /**
    * Z coordinate (or depth).
    */
  var z: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1Position {
  @scala.inline
  def apply(
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    z: js.UndefOr[Double] = js.undefined
  ): SchemaGoogleCloudVisionV1p1beta1Position = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1Position]
  }
}

