package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionEditableTool extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object DiagramConnectionEditableTool {
  @scala.inline
  def apply(name: String = null): DiagramConnectionEditableTool = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DiagramConnectionEditableTool]
  }
}

