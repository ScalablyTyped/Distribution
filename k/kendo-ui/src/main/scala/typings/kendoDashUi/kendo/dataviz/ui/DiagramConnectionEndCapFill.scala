package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionEndCapFill extends js.Object {
  var color: js.UndefOr[String] = js.undefined
}

object DiagramConnectionEndCapFill {
  @scala.inline
  def apply(color: String = null): DiagramConnectionEndCapFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramConnectionEndCapFill]
  }
}

