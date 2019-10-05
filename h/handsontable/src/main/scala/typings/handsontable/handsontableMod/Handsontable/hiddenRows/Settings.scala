package typings.handsontable.handsontableMod.Handsontable.hiddenRows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var indicators: js.UndefOr[Boolean] = js.undefined
  var rows: js.UndefOr[js.Array[Double]] = js.undefined
}

object Settings {
  @scala.inline
  def apply(indicators: js.UndefOr[Boolean] = js.undefined, rows: js.Array[Double] = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(indicators)) __obj.updateDynamic("indicators")(indicators)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[Settings]
  }
}

