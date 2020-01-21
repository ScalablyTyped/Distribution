package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeConnectorDefaultsHover extends js.Object {
  var fill: js.UndefOr[String | ShapeConnectorDefaultsHoverFill] = js.undefined
  var stroke: js.UndefOr[String | ShapeConnectorDefaultsHoverStroke] = js.undefined
}

object ShapeConnectorDefaultsHover {
  @scala.inline
  def apply(
    fill: String | ShapeConnectorDefaultsHoverFill = null,
    stroke: String | ShapeConnectorDefaultsHoverStroke = null
  ): ShapeConnectorDefaultsHover = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeConnectorDefaultsHover]
  }
}

