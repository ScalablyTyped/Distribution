package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetSortColumn extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
}

object SpreadsheetSheetSortColumn {
  @scala.inline
  def apply(ascending: js.UndefOr[Boolean] = js.undefined, index: Int | Double = null): SpreadsheetSheetSortColumn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetSheetSortColumn]
  }
}

