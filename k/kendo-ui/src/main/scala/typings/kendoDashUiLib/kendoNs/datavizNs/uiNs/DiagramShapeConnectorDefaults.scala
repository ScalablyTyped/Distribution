package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeConnectorDefaults extends js.Object {
  var fill: js.UndefOr[java.lang.String | DiagramShapeConnectorDefaultsFill] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var hover: js.UndefOr[DiagramShapeConnectorDefaultsHover] = js.undefined
  var stroke: js.UndefOr[java.lang.String | DiagramShapeConnectorDefaultsStroke] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object DiagramShapeConnectorDefaults {
  @scala.inline
  def apply(
    fill: java.lang.String | DiagramShapeConnectorDefaultsFill = null,
    height: scala.Int | scala.Double = null,
    hover: DiagramShapeConnectorDefaultsHover = null,
    stroke: java.lang.String | DiagramShapeConnectorDefaultsStroke = null,
    width: scala.Int | scala.Double = null
  ): DiagramShapeConnectorDefaults = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeConnectorDefaults]
  }
}

