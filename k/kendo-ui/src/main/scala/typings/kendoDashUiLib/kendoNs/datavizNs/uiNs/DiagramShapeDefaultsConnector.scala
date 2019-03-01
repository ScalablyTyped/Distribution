package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsConnector extends js.Object {
  var fill: js.UndefOr[java.lang.String | DiagramShapeDefaultsConnectorFill] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var hover: js.UndefOr[DiagramShapeDefaultsConnectorHover] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[js.Function] = js.undefined
  var stroke: js.UndefOr[java.lang.String | DiagramShapeDefaultsConnectorStroke] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object DiagramShapeDefaultsConnector {
  @scala.inline
  def apply(
    fill: java.lang.String | DiagramShapeDefaultsConnectorFill = null,
    height: scala.Int | scala.Double = null,
    hover: DiagramShapeDefaultsConnectorHover = null,
    name: java.lang.String = null,
    position: js.Function = null,
    stroke: java.lang.String | DiagramShapeDefaultsConnectorStroke = null,
    width: scala.Int | scala.Double = null
  ): DiagramShapeDefaultsConnector = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (name != null) __obj.updateDynamic("name")(name)
    if (position != null) __obj.updateDynamic("position")(position)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsConnector]
  }
}

