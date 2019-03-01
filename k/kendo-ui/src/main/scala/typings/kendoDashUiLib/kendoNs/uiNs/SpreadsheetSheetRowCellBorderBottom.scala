package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetRowCellBorderBottom extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
}

object SpreadsheetSheetRowCellBorderBottom {
  @scala.inline
  def apply(color: java.lang.String = null, size: java.lang.String = null): SpreadsheetSheetRowCellBorderBottom = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[SpreadsheetSheetRowCellBorderBottom]
  }
}

