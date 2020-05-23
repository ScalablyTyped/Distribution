package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LCDGeneralOption extends js.Object {
  var cols: js.UndefOr[Double] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
}

object LCDGeneralOption {
  @scala.inline
  def apply(cols: js.UndefOr[Double] = js.undefined, rows: js.UndefOr[Double] = js.undefined): LCDGeneralOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cols)) __obj.updateDynamic("cols")(cols.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCDGeneralOption]
  }
}

