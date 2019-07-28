package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsConnector extends js.Object {
  var fill: js.UndefOr[String | DiagramShapeDefaultsConnectorFill] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hover: js.UndefOr[DiagramShapeDefaultsConnectorHover] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[js.Function] = js.undefined
  var stroke: js.UndefOr[String | DiagramShapeDefaultsConnectorStroke] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DiagramShapeDefaultsConnector {
  @scala.inline
  def apply(
    fill: String | DiagramShapeDefaultsConnectorFill = null,
    height: Int | Double = null,
    hover: DiagramShapeDefaultsConnectorHover = null,
    name: String = null,
    position: js.Function = null,
    stroke: String | DiagramShapeDefaultsConnectorStroke = null,
    width: Int | Double = null
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

