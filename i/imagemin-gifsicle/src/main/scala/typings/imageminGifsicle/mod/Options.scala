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
    colors: Int | Double = null,
    interlaced: js.UndefOr[Boolean] = js.undefined,
    optimizationLevel: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(interlaced)) __obj.updateDynamic("interlaced")(interlaced.asInstanceOf[js.Any])
    if (optimizationLevel != null) __obj.updateDynamic("optimizationLevel")(optimizationLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

