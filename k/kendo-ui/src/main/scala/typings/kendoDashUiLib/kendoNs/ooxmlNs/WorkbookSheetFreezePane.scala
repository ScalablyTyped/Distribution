package typings
package kendoDashUiLib.kendoNs.ooxmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookSheetFreezePane extends js.Object {
  var colSplit: js.UndefOr[scala.Double] = js.undefined
  var rowSplit: js.UndefOr[scala.Double] = js.undefined
}

object WorkbookSheetFreezePane {
  @scala.inline
  def apply(colSplit: scala.Int | scala.Double = null, rowSplit: scala.Int | scala.Double = null): WorkbookSheetFreezePane = {
    val __obj = js.Dynamic.literal()
    if (colSplit != null) __obj.updateDynamic("colSplit")(colSplit.asInstanceOf[js.Any])
    if (rowSplit != null) __obj.updateDynamic("rowSplit")(rowSplit.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookSheetFreezePane]
  }
}

