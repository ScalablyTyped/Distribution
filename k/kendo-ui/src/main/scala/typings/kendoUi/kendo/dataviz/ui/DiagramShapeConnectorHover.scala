package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeConnectorHover extends js.Object {
  var fill: js.UndefOr[String | DiagramShapeConnectorHoverFill] = js.undefined
  var stroke: js.UndefOr[String | DiagramShapeConnectorHoverStroke] = js.undefined
}

object DiagramShapeConnectorHover {
  @scala.inline
  def apply(
    fill: String | DiagramShapeConnectorHoverFill = null,
    stroke: String | DiagramShapeConnectorHoverStroke = null
  ): DiagramShapeConnectorHover = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeConnectorHover]
  }
}

