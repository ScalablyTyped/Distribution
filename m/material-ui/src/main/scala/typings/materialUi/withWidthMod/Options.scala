package typings.materialUi.withWidthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var largeWidth: js.UndefOr[Double] = js.undefined
  var mediumWidth: js.UndefOr[Double] = js.undefined
  var resizeInterval: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    largeWidth: js.UndefOr[Double] = js.undefined,
    mediumWidth: js.UndefOr[Double] = js.undefined,
    resizeInterval: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(largeWidth)) __obj.updateDynamic("largeWidth")(largeWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mediumWidth)) __obj.updateDynamic("mediumWidth")(mediumWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeInterval)) __obj.updateDynamic("resizeInterval")(resizeInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

