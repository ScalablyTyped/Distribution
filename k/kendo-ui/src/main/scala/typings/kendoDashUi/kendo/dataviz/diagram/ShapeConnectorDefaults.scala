package typings.kendoDashUi.kendo.dataviz.diagram

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
    height: Int | Double = null,
    hover: ShapeConnectorDefaultsHover = null,
    stroke: String | ShapeConnectorDefaultsStroke = null,
    width: Int | Double = null
  ): ShapeConnectorDefaults = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeConnectorDefaults]
  }
}

