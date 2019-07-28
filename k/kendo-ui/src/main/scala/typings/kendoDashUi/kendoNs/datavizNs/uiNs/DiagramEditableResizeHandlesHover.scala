package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramEditableResizeHandlesHover extends js.Object {
  var fill: js.UndefOr[String | DiagramEditableResizeHandlesHoverFill] = js.undefined
  var stroke: js.UndefOr[DiagramEditableResizeHandlesHoverStroke] = js.undefined
}

object DiagramEditableResizeHandlesHover {
  @scala.inline
  def apply(
    fill: String | DiagramEditableResizeHandlesHoverFill = null,
    stroke: DiagramEditableResizeHandlesHoverStroke = null
  ): DiagramEditableResizeHandlesHover = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[DiagramEditableResizeHandlesHover]
  }
}

