package typings.mapboxGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPixelRatio extends js.Object {
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var sdf: js.UndefOr[Boolean] = js.undefined
}

object AnonPixelRatio {
  @scala.inline
  def apply(pixelRatio: Int | Double = null, sdf: js.UndefOr[Boolean] = js.undefined): AnonPixelRatio = {
    val __obj = js.Dynamic.literal()
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(sdf)) __obj.updateDynamic("sdf")(sdf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPixelRatio]
  }
}

