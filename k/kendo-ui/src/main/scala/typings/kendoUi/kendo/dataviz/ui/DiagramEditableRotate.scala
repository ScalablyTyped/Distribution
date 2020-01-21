package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramEditableRotate extends js.Object {
  var fill: js.UndefOr[DiagramEditableRotateFill] = js.undefined
  var stroke: js.UndefOr[DiagramEditableRotateStroke] = js.undefined
}

object DiagramEditableRotate {
  @scala.inline
  def apply(fill: DiagramEditableRotateFill = null, stroke: DiagramEditableRotateStroke = null): DiagramEditableRotate = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramEditableRotate]
  }
}

