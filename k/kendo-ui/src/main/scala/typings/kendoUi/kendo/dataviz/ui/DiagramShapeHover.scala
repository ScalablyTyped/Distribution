package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeHover extends js.Object {
  var fill: js.UndefOr[String | DiagramShapeHoverFill] = js.undefined
}

object DiagramShapeHover {
  @scala.inline
  def apply(fill: String | DiagramShapeHoverFill = null): DiagramShapeHover = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeHover]
  }
}

