package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListColumnMenu extends js.Object {
  var columns: js.UndefOr[scala.Boolean] = js.undefined
  var filterable: js.UndefOr[scala.Boolean] = js.undefined
  var messages: js.UndefOr[TreeListColumnMenuMessages] = js.undefined
  var sortable: js.UndefOr[scala.Boolean] = js.undefined
}

object TreeListColumnMenu {
  @scala.inline
  def apply(
    columns: js.UndefOr[scala.Boolean] = js.undefined,
    filterable: js.UndefOr[scala.Boolean] = js.undefined,
    messages: TreeListColumnMenuMessages = null,
    sortable: js.UndefOr[scala.Boolean] = js.undefined
  ): TreeListColumnMenu = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns)
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    __obj.asInstanceOf[TreeListColumnMenu]
  }
}

