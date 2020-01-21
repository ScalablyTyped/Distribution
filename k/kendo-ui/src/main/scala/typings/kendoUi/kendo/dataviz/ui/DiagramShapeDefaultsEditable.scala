package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsEditable extends js.Object {
  var connect: js.UndefOr[Boolean] = js.undefined
  var drag: js.UndefOr[Boolean] = js.undefined
  var remove: js.UndefOr[Boolean] = js.undefined
  var tools: js.UndefOr[js.Array[DiagramShapeDefaultsEditableTool]] = js.undefined
}

object DiagramShapeDefaultsEditable {
  @scala.inline
  def apply(
    connect: js.UndefOr[Boolean] = js.undefined,
    drag: js.UndefOr[Boolean] = js.undefined,
    remove: js.UndefOr[Boolean] = js.undefined,
    tools: js.Array[DiagramShapeDefaultsEditableTool] = null
  ): DiagramShapeDefaultsEditable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connect)) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    if (!js.isUndefined(drag)) __obj.updateDynamic("drag")(drag.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsEditable]
  }
}

