package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsConnectorHover extends js.Object {
  var fill: js.UndefOr[java.lang.String | DiagramShapeDefaultsConnectorHoverFill] = js.undefined
  var stroke: js.UndefOr[java.lang.String | DiagramShapeDefaultsConnectorHoverStroke] = js.undefined
}

object DiagramShapeDefaultsConnectorHover {
  @scala.inline
  def apply(
    fill: java.lang.String | DiagramShapeDefaultsConnectorHoverFill = null,
    stroke: java.lang.String | DiagramShapeDefaultsConnectorHoverStroke = null
  ): DiagramShapeDefaultsConnectorHover = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsConnectorHover]
  }
}

