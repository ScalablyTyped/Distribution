package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnMenu extends js.Object {
  var columns: js.UndefOr[scala.Boolean] = js.undefined
  var filterable: js.UndefOr[scala.Boolean] = js.undefined
  var messages: js.UndefOr[GridColumnMenuMessages] = js.undefined
  var sortable: js.UndefOr[scala.Boolean] = js.undefined
}

object GridColumnMenu {
  @scala.inline
  def apply(
    columns: js.UndefOr[scala.Boolean] = js.undefined,
    filterable: js.UndefOr[scala.Boolean] = js.undefined,
    messages: GridColumnMenuMessages = null,
    sortable: js.UndefOr[scala.Boolean] = js.undefined
  ): GridColumnMenu = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns)
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    __obj.asInstanceOf[GridColumnMenu]
  }
}

