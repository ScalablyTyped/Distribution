package typings.handsontable.mod.Handsontable.headerTooltips

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var columns: js.UndefOr[Boolean] = js.undefined
  var onlyTrimmed: js.UndefOr[Boolean] = js.undefined
  var rows: js.UndefOr[Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    columns: js.UndefOr[Boolean] = js.undefined,
    onlyTrimmed: js.UndefOr[Boolean] = js.undefined,
    rows: js.UndefOr[Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyTrimmed)) __obj.updateDynamic("onlyTrimmed")(onlyTrimmed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

