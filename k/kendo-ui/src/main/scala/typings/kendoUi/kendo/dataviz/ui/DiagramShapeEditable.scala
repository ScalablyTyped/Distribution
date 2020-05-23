package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeEditable extends js.Object {
  var connect: js.UndefOr[Boolean] = js.undefined
  var tools: js.UndefOr[js.Array[DiagramShapeEditableTool]] = js.undefined
}

object DiagramShapeEditable {
  @scala.inline
  def apply(connect: js.UndefOr[Boolean] = js.undefined, tools: js.Array[DiagramShapeEditableTool] = null): DiagramShapeEditable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connect)) __obj.updateDynamic("connect")(connect.get.asInstanceOf[js.Any])
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeEditable]
  }
}

