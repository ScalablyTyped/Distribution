package typings.kendoDashUi.kendoNs.ooxmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookSheetFilter extends js.Object {
  var from: js.UndefOr[Double] = js.undefined
  var to: js.UndefOr[Double] = js.undefined
}

object WorkbookSheetFilter {
  @scala.inline
  def apply(from: Int | Double = null, to: Int | Double = null): WorkbookSheetFilter = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookSheetFilter]
  }
}

