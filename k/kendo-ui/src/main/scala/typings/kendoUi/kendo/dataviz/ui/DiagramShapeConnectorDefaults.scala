package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeConnectorDefaults extends js.Object {
  var fill: js.UndefOr[String | DiagramShapeConnectorDefaultsFill] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hover: js.UndefOr[DiagramShapeConnectorDefaultsHover] = js.undefined
  var stroke: js.UndefOr[String | DiagramShapeConnectorDefaultsStroke] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DiagramShapeConnectorDefaults {
  @scala.inline
  def apply(
    fill: String | DiagramShapeConnectorDefaultsFill = null,
    height: js.UndefOr[Double] = js.undefined,
    hover: DiagramShapeConnectorDefaultsHover = null,
    stroke: String | DiagramShapeConnectorDefaultsStroke = null,
    width: js.UndefOr[Double] = js.undefined
  ): DiagramShapeConnectorDefaults = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeConnectorDefaults]
  }
}

