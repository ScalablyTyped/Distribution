package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeEditable extends js.Object {
  var connect: js.UndefOr[scala.Boolean] = js.undefined
  var tools: js.UndefOr[js.Array[DiagramShapeEditableTool]] = js.undefined
}

object DiagramShapeEditable {
  @scala.inline
  def apply(
    connect: js.UndefOr[scala.Boolean] = js.undefined,
    tools: js.Array[DiagramShapeEditableTool] = null
  ): DiagramShapeEditable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connect)) __obj.updateDynamic("connect")(connect)
    if (tools != null) __obj.updateDynamic("tools")(tools)
    __obj.asInstanceOf[DiagramShapeEditable]
  }
}

