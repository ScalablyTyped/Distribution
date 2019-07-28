package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionDefaultsHoverStroke extends js.Object {
  var color: js.UndefOr[String] = js.undefined
}

object DiagramConnectionDefaultsHoverStroke {
  @scala.inline
  def apply(color: String = null): DiagramConnectionDefaultsHoverStroke = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[DiagramConnectionDefaultsHoverStroke]
  }
}

