package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsConnectorDefaultsHover extends js.Object {
  var fill: js.UndefOr[java.lang.String | DiagramShapeDefaultsConnectorDefaultsHoverFill] = js.undefined
  var stroke: js.UndefOr[java.lang.String | DiagramShapeDefaultsConnectorDefaultsHoverStroke] = js.undefined
}

object DiagramShapeDefaultsConnectorDefaultsHover {
  @scala.inline
  def apply(
    fill: java.lang.String | DiagramShapeDefaultsConnectorDefaultsHoverFill = null,
    stroke: java.lang.String | DiagramShapeDefaultsConnectorDefaultsHoverStroke = null
  ): DiagramShapeDefaultsConnectorDefaultsHover = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsConnectorDefaultsHover]
  }
}

