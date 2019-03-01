package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionEditable extends js.Object {
  var tools: js.UndefOr[js.Array[DiagramConnectionEditableTool]] = js.undefined
}

object DiagramConnectionEditable {
  @scala.inline
  def apply(tools: js.Array[DiagramConnectionEditableTool] = null): DiagramConnectionEditable = {
    val __obj = js.Dynamic.literal()
    if (tools != null) __obj.updateDynamic("tools")(tools)
    __obj.asInstanceOf[DiagramConnectionEditable]
  }
}

