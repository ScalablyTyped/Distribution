package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetRowCellBorderTop extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object SpreadsheetSheetRowCellBorderTop {
  @scala.inline
  def apply(color: String = null, size: String = null): SpreadsheetSheetRowCellBorderTop = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetSheetRowCellBorderTop]
  }
}

