package typings.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PixelRatio extends js.Object {
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var sdf: js.UndefOr[Boolean] = js.undefined
}

object PixelRatio {
  @scala.inline
  def apply(pixelRatio: js.UndefOr[Double] = js.undefined, sdf: js.UndefOr[Boolean] = js.undefined): PixelRatio = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pixelRatio)) __obj.updateDynamic("pixelRatio")(pixelRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sdf)) __obj.updateDynamic("sdf")(sdf.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PixelRatio]
  }
}

