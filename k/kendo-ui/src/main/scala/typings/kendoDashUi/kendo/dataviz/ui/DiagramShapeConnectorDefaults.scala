package typings.kendoDashUi.kendo.dataviz.ui

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
    height: Int | Double = null,
    hover: DiagramShapeConnectorDefaultsHover = null,
    stroke: String | DiagramShapeConnectorDefaultsStroke = null,
    width: Int | Double = null
  ): DiagramShapeConnectorDefaults = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeConnectorDefaults]
  }
}

