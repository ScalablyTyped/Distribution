package typings
package imageminDashGifsicleLib.imageminDashGifsicleMod.imageminGifsicleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var colors: js.UndefOr[scala.Double] = js.undefined
  var interlaced: js.UndefOr[scala.Boolean] = js.undefined
  var optimizationLevel: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    colors: scala.Int | scala.Double = null,
    interlaced: js.UndefOr[scala.Boolean] = js.undefined,
    optimizationLevel: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(interlaced)) __obj.updateDynamic("interlaced")(interlaced)
    if (optimizationLevel != null) __obj.updateDynamic("optimizationLevel")(optimizationLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

