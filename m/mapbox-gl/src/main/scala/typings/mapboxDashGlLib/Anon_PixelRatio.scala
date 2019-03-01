package typings
package mapboxDashGlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PixelRatio extends js.Object {
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
  var sdf: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_PixelRatio {
  @scala.inline
  def apply(pixelRatio: scala.Int | scala.Double = null, sdf: js.UndefOr[scala.Boolean] = js.undefined): Anon_PixelRatio = {
    val __obj = js.Dynamic.literal()
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(sdf)) __obj.updateDynamic("sdf")(sdf)
    __obj.asInstanceOf[Anon_PixelRatio]
  }
}

