package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionDefaultsStartCapFill extends js.Object {
  var color: js.UndefOr[String] = js.undefined
}

object DiagramConnectionDefaultsStartCapFill {
  @scala.inline
  def apply(color: String = null): DiagramConnectionDefaultsStartCapFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[DiagramConnectionDefaultsStartCapFill]
  }
}

