package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeConnectorDefaultsHover extends js.Object {
  var fill: js.UndefOr[String | DiagramShapeConnectorDefaultsHoverFill] = js.undefined
  var stroke: js.UndefOr[String | DiagramShapeConnectorDefaultsHoverStroke] = js.undefined
}

object DiagramShapeConnectorDefaultsHover {
  @scala.inline
  def apply(
    fill: String | DiagramShapeConnectorDefaultsHoverFill = null,
    stroke: String | DiagramShapeConnectorDefaultsHoverStroke = null
  ): DiagramShapeConnectorDefaultsHover = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeConnectorDefaultsHover]
  }
}

