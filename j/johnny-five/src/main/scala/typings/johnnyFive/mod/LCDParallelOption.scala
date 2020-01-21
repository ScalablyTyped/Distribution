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
    backlight: Int | Double = null,
    cols: Int | Double = null,
    rows: Int | Double = null
  ): LCDParallelOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    if (backlight != null) __obj.updateDynamic("backlight")(backlight.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCDParallelOption]
  }
}

