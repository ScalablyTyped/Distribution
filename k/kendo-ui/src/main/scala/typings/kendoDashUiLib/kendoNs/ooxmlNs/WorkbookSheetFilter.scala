package typings
package kendoDashUiLib.kendoNs.ooxmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookSheetFilter extends js.Object {
  var from: js.UndefOr[scala.Double] = js.undefined
  var to: js.UndefOr[scala.Double] = js.undefined
}

object WorkbookSheetFilter {
  @scala.inline
  def apply(from: scala.Int | scala.Double = null, to: scala.Int | scala.Double = null): WorkbookSheetFilter = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookSheetFilter]
  }
}

