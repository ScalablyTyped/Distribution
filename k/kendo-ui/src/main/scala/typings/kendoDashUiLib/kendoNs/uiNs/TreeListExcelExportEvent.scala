package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListExcelExportEvent extends TreeListEvent {
  var data: js.UndefOr[js.Any] = js.undefined
  var workbook: js.UndefOr[js.Any] = js.undefined
}

object TreeListExcelExportEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: TreeList,
    data: js.Any = null,
    workbook: js.Any = null
  ): TreeListExcelExportEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (data != null) __obj.updateDynamic("data")(data)
    if (workbook != null) __obj.updateDynamic("workbook")(workbook)
    __obj.asInstanceOf[TreeListExcelExportEvent]
  }
}

