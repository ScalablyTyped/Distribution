package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionHover extends js.Object {
  var stroke: js.UndefOr[DiagramConnectionHoverStroke] = js.undefined
}

object DiagramConnectionHover {
  @scala.inline
  def apply(stroke: DiagramConnectionHoverStroke = null): DiagramConnectionHover = {
    val __obj = js.Dynamic.literal()
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramConnectionHover]
  }
}

