package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeConnector extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var fill: js.UndefOr[String | DiagramShapeConnectorFill] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hover: js.UndefOr[DiagramShapeConnectorHover] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[js.Function] = js.undefined
  var stroke: js.UndefOr[String | DiagramShapeConnectorStroke] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DiagramShapeConnector {
  @scala.inline
  def apply(
    description: String = null,
    fill: String | DiagramShapeConnectorFill = null,
    height: Int | Double = null,
    hover: DiagramShapeConnectorHover = null,
    name: String = null,
    position: js.Function = null,
    stroke: String | DiagramShapeConnectorStroke = null,
    width: Int | Double = null
  ): DiagramShapeConnector = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (name != null) __obj.updateDynamic("name")(name)
    if (position != null) __obj.updateDynamic("position")(position)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeConnector]
  }
}

