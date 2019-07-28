package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionDefaultsEditableTool extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object DiagramConnectionDefaultsEditableTool {
  @scala.inline
  def apply(name: String = null): DiagramConnectionDefaultsEditableTool = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DiagramConnectionDefaultsEditableTool]
  }
}

