package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetSortColumn extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
}

object SpreadsheetSheetSortColumn {
  @scala.inline
  def apply(ascending: js.UndefOr[Boolean] = js.undefined, index: js.UndefOr[Double] = js.undefined): SpreadsheetSheetSortColumn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascending)) __obj.updateDynamic("ascending")(ascending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetSheetSortColumn]
  }
}

