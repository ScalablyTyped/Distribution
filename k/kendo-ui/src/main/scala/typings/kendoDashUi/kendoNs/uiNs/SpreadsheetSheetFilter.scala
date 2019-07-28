package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetFilter extends js.Object {
  var columns: js.UndefOr[js.Array[SpreadsheetSheetFilterColumn]] = js.undefined
  var ref: js.UndefOr[String] = js.undefined
}

object SpreadsheetSheetFilter {
  @scala.inline
  def apply(columns: js.Array[SpreadsheetSheetFilterColumn] = null, ref: String = null): SpreadsheetSheetFilter = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[SpreadsheetSheetFilter]
  }
}

