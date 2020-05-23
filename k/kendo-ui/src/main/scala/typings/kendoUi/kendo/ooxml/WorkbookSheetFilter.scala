package typings.kendoUi.kendo.ooxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookSheetFilter extends js.Object {
  var from: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[Double] = js.undefined
}

object WorkbookSheetFilter {
  @scala.inline
  def apply(from: js.UndefOr[Double] = js.undefined, to: js.UndefOr[Double] = js.undefined): WorkbookSheetFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookSheetFilter]
  }
}

