package typings.kendoDashUi.kendo.ui

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
    height: Int | Double = null,
    index: Int | Double = null,
    `type`: String = null
  ): SpreadsheetSheetRow = {
    val __obj = js.Dynamic.literal()
    if (cells != null) __obj.updateDynamic("cells")(cells)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SpreadsheetSheetRow]
  }
}

