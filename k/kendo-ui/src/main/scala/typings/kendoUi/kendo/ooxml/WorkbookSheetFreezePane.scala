package typings.kendoUi.kendo.ooxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookSheetFreezePane extends js.Object {
  var colSplit: js.UndefOr[Double] = js.undefined
  var rowSplit: js.UndefOr[Double] = js.undefined
}

object WorkbookSheetFreezePane {
  @scala.inline
  def apply(colSplit: js.UndefOr[Double] = js.undefined, rowSplit: js.UndefOr[Double] = js.undefined): WorkbookSheetFreezePane = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colSplit)) __obj.updateDynamic("colSplit")(colSplit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSplit)) __obj.updateDynamic("rowSplit")(rowSplit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookSheetFreezePane]
  }
}

