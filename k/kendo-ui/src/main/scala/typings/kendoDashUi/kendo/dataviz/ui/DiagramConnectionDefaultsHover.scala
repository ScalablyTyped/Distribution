package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionDefaultsHover extends js.Object {
  var stroke: js.UndefOr[DiagramConnectionDefaultsHoverStroke] = js.undefined
}

object DiagramConnectionDefaultsHover {
  @scala.inline
  def apply(stroke: DiagramConnectionDefaultsHoverStroke = null): DiagramConnectionDefaultsHover = {
    val __obj = js.Dynamic.literal()
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[DiagramConnectionDefaultsHover]
  }
}

