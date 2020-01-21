package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsConnectorHover extends js.Object {
  var fill: js.UndefOr[String | DiagramShapeDefaultsConnectorHoverFill] = js.undefined
  var stroke: js.UndefOr[String | DiagramShapeDefaultsConnectorHoverStroke] = js.undefined
}

object DiagramShapeDefaultsConnectorHover {
  @scala.inline
  def apply(
    fill: String | DiagramShapeDefaultsConnectorHoverFill = null,
    stroke: String | DiagramShapeDefaultsConnectorHoverStroke = null
  ): DiagramShapeDefaultsConnectorHover = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsConnectorHover]
  }
}

