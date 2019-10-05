package typings.handsontable.handsontableMod.Handsontable.hiddenColumns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var columns: js.UndefOr[js.Array[Double]] = js.undefined
  var indicators: js.UndefOr[Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(columns: js.Array[Double] = null, indicators: js.UndefOr[Boolean] = js.undefined): Settings = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (!js.isUndefined(indicators)) __obj.updateDynamic("indicators")(indicators)
    __obj.asInstanceOf[Settings]
  }
}

