package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetRow extends js.Object {
  var cells: js.UndefOr[js.Array[SpreadsheetSheetRowCell]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object SpreadsheetSheetRow {
  @scala.inline
  def apply(
    cells: js.Array[SpreadsheetSheetRowCell] = null,
    height: js.UndefOr[Double] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): SpreadsheetSheetRow = {
    val __obj = js.Dynamic.literal()
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetSheetRow]
  }
}

