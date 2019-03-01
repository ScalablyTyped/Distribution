package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetSort extends js.Object {
  var columns: js.UndefOr[js.Array[SpreadsheetSheetSortColumn]] = js.undefined
  var ref: js.UndefOr[java.lang.String] = js.undefined
}

object SpreadsheetSheetSort {
  @scala.inline
  def apply(columns: js.Array[SpreadsheetSheetSortColumn] = null, ref: java.lang.String = null): SpreadsheetSheetSort = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[SpreadsheetSheetSort]
  }
}

