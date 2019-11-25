package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramEditableTool extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object DiagramEditableTool {
  @scala.inline
  def apply(name: String = null, step: Int | Double = null): DiagramEditableTool = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramEditableTool]
  }
}

