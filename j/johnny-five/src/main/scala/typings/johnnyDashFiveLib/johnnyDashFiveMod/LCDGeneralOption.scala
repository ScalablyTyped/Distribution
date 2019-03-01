package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LCDGeneralOption extends js.Object {
  var cols: js.UndefOr[scala.Double] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
}

object LCDGeneralOption {
  @scala.inline
  def apply(cols: scala.Int | scala.Double = null, rows: scala.Int | scala.Double = null): LCDGeneralOption = {
    val __obj = js.Dynamic.literal()
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCDGeneralOption]
  }
}

