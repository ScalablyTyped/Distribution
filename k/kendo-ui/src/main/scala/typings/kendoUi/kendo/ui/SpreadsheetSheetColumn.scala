package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetColumn extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SpreadsheetSheetColumn {
  @scala.inline
  def apply(index: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): SpreadsheetSheetColumn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetSheetColumn]
  }
}

