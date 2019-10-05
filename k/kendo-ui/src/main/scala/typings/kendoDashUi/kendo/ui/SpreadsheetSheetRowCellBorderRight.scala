package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetRowCellBorderRight extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object SpreadsheetSheetRowCellBorderRight {
  @scala.inline
  def apply(color: String = null, size: String = null): SpreadsheetSheetRowCellBorderRight = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[SpreadsheetSheetRowCellBorderRight]
  }
}

