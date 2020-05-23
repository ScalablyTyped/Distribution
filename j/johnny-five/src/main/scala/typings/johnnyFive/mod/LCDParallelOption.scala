package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LCDParallelOption extends LCDGeneralOption {
  var backlight: js.UndefOr[Double] = js.undefined
  var pins: js.Array[_]
}

object LCDParallelOption {
  @scala.inline
  def apply(
    pins: js.Array[_],
    backlight: js.UndefOr[Double] = js.undefined,
    cols: js.UndefOr[Double] = js.undefined,
    rows: js.UndefOr[Double] = js.undefined
  ): LCDParallelOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    if (!js.isUndefined(backlight)) __obj.updateDynamic("backlight")(backlight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCDParallelOption]
  }
}

