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
  def apply(colSplit: Int | Double = null, rowSplit: Int | Double = null): WorkbookSheetFreezePane = {
    val __obj = js.Dynamic.literal()
    if (colSplit != null) __obj.updateDynamic("colSplit")(colSplit.asInstanceOf[js.Any])
    if (rowSplit != null) __obj.updateDynamic("rowSplit")(rowSplit.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookSheetFreezePane]
  }
}

