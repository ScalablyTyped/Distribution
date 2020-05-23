package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionDefaultsEditable extends js.Object {
  var drag: js.UndefOr[Boolean] = js.undefined
  var remove: js.UndefOr[Boolean] = js.undefined
  var tools: js.UndefOr[js.Array[DiagramConnectionDefaultsEditableTool]] = js.undefined
}

object DiagramConnectionDefaultsEditable {
  @scala.inline
  def apply(
    drag: js.UndefOr[Boolean] = js.undefined,
    remove: js.UndefOr[Boolean] = js.undefined,
    tools: js.Array[DiagramConnectionDefaultsEditableTool] = null
  ): DiagramConnectionDefaultsEditable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drag)) __obj.updateDynamic("drag")(drag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.get.asInstanceOf[js.Any])
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramConnectionDefaultsEditable]
  }
}

