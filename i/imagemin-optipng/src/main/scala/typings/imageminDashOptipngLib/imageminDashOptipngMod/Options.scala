package typings
package imageminDashOptipngLib.imageminDashOptipngMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bitDepthReduction: js.UndefOr[scala.Boolean] = js.undefined
  var colorTypeReduction: js.UndefOr[scala.Boolean] = js.undefined
  var optimizationLevel: js.UndefOr[scala.Double] = js.undefined
  var paletteReduction: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    bitDepthReduction: js.UndefOr[scala.Boolean] = js.undefined,
    colorTypeReduction: js.UndefOr[scala.Boolean] = js.undefined,
    optimizationLevel: scala.Int | scala.Double = null,
    paletteReduction: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bitDepthReduction)) __obj.updateDynamic("bitDepthReduction")(bitDepthReduction)
    if (!js.isUndefined(colorTypeReduction)) __obj.updateDynamic("colorTypeReduction")(colorTypeReduction)
    if (optimizationLevel != null) __obj.updateDynamic("optimizationLevel")(optimizationLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(paletteReduction)) __obj.updateDynamic("paletteReduction")(paletteReduction)
    __obj.asInstanceOf[Options]
  }
}

