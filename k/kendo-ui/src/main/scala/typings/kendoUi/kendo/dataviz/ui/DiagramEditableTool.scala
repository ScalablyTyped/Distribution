package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramEditableTool extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object DiagramEditableTool {
  @scala.inline
  def apply(name: String = null, step: js.UndefOr[Double] = js.undefined): DiagramEditableTool = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramEditableTool]
  }
}

