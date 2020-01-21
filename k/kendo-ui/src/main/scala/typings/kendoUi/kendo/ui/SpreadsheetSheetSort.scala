package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetSort extends js.Object {
  var columns: js.UndefOr[js.Array[SpreadsheetSheetSortColumn]] = js.undefined
  var ref: js.UndefOr[String] = js.undefined
}

object SpreadsheetSheetSort {
  @scala.inline
  def apply(columns: js.Array[SpreadsheetSheetSortColumn] = null, ref: String = null): SpreadsheetSheetSort = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetSheetSort]
  }
}

