package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListColumnMenu extends js.Object {
  var columns: js.UndefOr[Boolean] = js.undefined
  var filterable: js.UndefOr[Boolean] = js.undefined
  var messages: js.UndefOr[TreeListColumnMenuMessages] = js.undefined
  var sortable: js.UndefOr[Boolean] = js.undefined
}

object TreeListColumnMenu {
  @scala.inline
  def apply(
    columns: js.UndefOr[Boolean] = js.undefined,
    filterable: js.UndefOr[Boolean] = js.undefined,
    messages: TreeListColumnMenuMessages = null,
    sortable: js.UndefOr[Boolean] = js.undefined
  ): TreeListColumnMenu = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListColumnMenu]
  }
}

