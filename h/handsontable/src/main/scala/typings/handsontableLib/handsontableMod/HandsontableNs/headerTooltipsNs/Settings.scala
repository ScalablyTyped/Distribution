package typings
package handsontableLib.handsontableMod.HandsontableNs.headerTooltipsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var columns: js.UndefOr[scala.Boolean] = js.undefined
  var onlyTrimmed: js.UndefOr[scala.Boolean] = js.undefined
  var rows: js.UndefOr[scala.Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    columns: js.UndefOr[scala.Boolean] = js.undefined,
    onlyTrimmed: js.UndefOr[scala.Boolean] = js.undefined,
    rows: js.UndefOr[scala.Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns)
    if (!js.isUndefined(onlyTrimmed)) __obj.updateDynamic("onlyTrimmed")(onlyTrimmed)
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[Settings]
  }
}

