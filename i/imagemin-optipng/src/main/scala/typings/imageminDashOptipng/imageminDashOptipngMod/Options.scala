package typings.imageminDashOptipng.imageminDashOptipngMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var bitDepthReduction: js.UndefOr[Boolean] = js.undefined
  var colorTypeReduction: js.UndefOr[Boolean] = js.undefined
  var optimizationLevel: js.UndefOr[Double] = js.undefined
  var paletteReduction: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    bitDepthReduction: js.UndefOr[Boolean] = js.undefined,
    colorTypeReduction: js.UndefOr[Boolean] = js.undefined,
    optimizationLevel: Int | Double = null,
    paletteReduction: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bitDepthReduction)) __obj.updateDynamic("bitDepthReduction")(bitDepthReduction)
    if (!js.isUndefined(colorTypeReduction)) __obj.updateDynamic("colorTypeReduction")(colorTypeReduction)
    if (optimizationLevel != null) __obj.updateDynamic("optimizationLevel")(optimizationLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(paletteReduction)) __obj.updateDynamic("paletteReduction")(paletteReduction)
    __obj.asInstanceOf[Options]
  }
}

