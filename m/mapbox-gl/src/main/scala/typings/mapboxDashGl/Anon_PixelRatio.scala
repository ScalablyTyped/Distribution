package typings.mapboxDashGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PixelRatio extends js.Object {
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var sdf: js.UndefOr[Boolean] = js.undefined
}

object Anon_PixelRatio {
  @scala.inline
  def apply(pixelRatio: Int | Double = null, sdf: js.UndefOr[Boolean] = js.undefined): Anon_PixelRatio = {
    val __obj = js.Dynamic.literal()
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(sdf)) __obj.updateDynamic("sdf")(sdf.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PixelRatio]
  }
}

