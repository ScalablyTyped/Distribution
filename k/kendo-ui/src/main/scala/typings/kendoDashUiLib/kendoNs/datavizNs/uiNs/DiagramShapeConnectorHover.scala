package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeConnectorHover extends js.Object {
  var fill: js.UndefOr[java.lang.String | DiagramShapeConnectorHoverFill] = js.undefined
  var stroke: js.UndefOr[java.lang.String | DiagramShapeConnectorHoverStroke] = js.undefined
}

object DiagramShapeConnectorHover {
  @scala.inline
  def apply(
    fill: java.lang.String | DiagramShapeConnectorHoverFill = null,
    stroke: java.lang.String | DiagramShapeConnectorHoverStroke = null
  ): DiagramShapeConnectorHover = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeConnectorHover]
  }
}

