package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsConnectorDefaults extends js.Object {
  var fill: js.UndefOr[String | DiagramShapeDefaultsConnectorDefaultsFill] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hover: js.UndefOr[DiagramShapeDefaultsConnectorDefaultsHover] = js.undefined
  var stroke: js.UndefOr[String | DiagramShapeDefaultsConnectorDefaultsStroke] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DiagramShapeDefaultsConnectorDefaults {
  @scala.inline
  def apply(
    fill: String | DiagramShapeDefaultsConnectorDefaultsFill = null,
    height: Int | Double = null,
    hover: DiagramShapeDefaultsConnectorDefaultsHover = null,
    stroke: String | DiagramShapeDefaultsConnectorDefaultsStroke = null,
    width: Int | Double = null
  ): DiagramShapeDefaultsConnectorDefaults = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsConnectorDefaults]
  }
}

