package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeConnectorDefaultsHover extends js.Object {
  var fill: js.UndefOr[java.lang.String | ShapeConnectorDefaultsHoverFill] = js.undefined
  var stroke: js.UndefOr[java.lang.String | ShapeConnectorDefaultsHoverStroke] = js.undefined
}

object ShapeConnectorDefaultsHover {
  @scala.inline
  def apply(
    fill: java.lang.String | ShapeConnectorDefaultsHoverFill = null,
    stroke: java.lang.String | ShapeConnectorDefaultsHoverStroke = null
  ): ShapeConnectorDefaultsHover = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeConnectorDefaultsHover]
  }
}

