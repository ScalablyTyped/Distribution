package typings.kendoDashUi.kendo.dataviz.ui

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
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramConnectionDefaultsEditableTool]
  }
}

