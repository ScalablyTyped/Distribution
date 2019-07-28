package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsConnectorDefaultsHover extends js.Object {
  var fill: js.UndefOr[String | DiagramShapeDefaultsConnectorDefaultsHoverFill] = js.undefined
  var stroke: js.UndefOr[String | DiagramShapeDefaultsConnectorDefaultsHoverStroke] = js.undefined
}

object DiagramShapeDefaultsConnectorDefaultsHover {
  @scala.inline
  def apply(
    fill: String | DiagramShapeDefaultsConnectorDefaultsHoverFill = null,
    stroke: String | DiagramShapeDefaultsConnectorDefaultsHoverStroke = null
  ): DiagramShapeDefaultsConnectorDefaultsHover = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsConnectorDefaultsHover]
  }
}

