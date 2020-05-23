package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeConnectorDefaults extends js.Object {
  var fill: js.UndefOr[String | ShapeConnectorDefaultsFill] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hover: js.UndefOr[ShapeConnectorDefaultsHover] = js.undefined
  var stroke: js.UndefOr[String | ShapeConnectorDefaultsStroke] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ShapeConnectorDefaults {
  @scala.inline
  def apply(
    fill: String | ShapeConnectorDefaultsFill = null,
    height: js.UndefOr[Double] = js.undefined,
    hover: ShapeConnectorDefaultsHover = null,
    stroke: String | ShapeConnectorDefaultsStroke = null,
    width: js.UndefOr[Double] = js.undefined
  ): ShapeConnectorDefaults = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeConnectorDefaults]
  }
}

