package typings.imageminGifsicle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var colors: js.UndefOr[Double] = js.undefined
  var interlaced: js.UndefOr[Boolean] = js.undefined
  var optimizationLevel: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    colors: js.UndefOr[Double] = js.undefined,
    interlaced: js.UndefOr[Boolean] = js.undefined,
    optimizationLevel: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interlaced)) __obj.updateDynamic("interlaced")(interlaced.get.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizationLevel)) __obj.updateDynamic("optimizationLevel")(optimizationLevel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

