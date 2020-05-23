package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShape extends js.Object {
  var connectorDefaults: js.UndefOr[DiagramShapeConnectorDefaults] = js.undefined
  var connectors: js.UndefOr[js.Array[DiagramShapeConnector]] = js.undefined
  var content: js.UndefOr[DiagramShapeContent] = js.undefined
  var editable: js.UndefOr[Boolean | DiagramShapeEditable] = js.undefined
  var fill: js.UndefOr[String | DiagramShapeFill] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hover: js.UndefOr[DiagramShapeHover] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var rotation: js.UndefOr[DiagramShapeRotation] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var stroke: js.UndefOr[DiagramShapeStroke] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object DiagramShape {
  @scala.inline
  def apply(
    connectorDefaults: DiagramShapeConnectorDefaults = null,
    connectors: js.Array[DiagramShapeConnector] = null,
    content: DiagramShapeContent = null,
    editable: Boolean | DiagramShapeEditable = null,
    fill: String | DiagramShapeFill = null,
    height: js.UndefOr[Double] = js.undefined,
    hover: DiagramShapeHover = null,
    id: String = null,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    path: String = null,
    rotation: DiagramShapeRotation = null,
    source: String = null,
    stroke: DiagramShapeStroke = null,
    `type`: String = null,
    visual: js.Function = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): DiagramShape = {
    val __obj = js.Dynamic.literal()
    if (connectorDefaults != null) __obj.updateDynamic("connectorDefaults")(connectorDefaults.asInstanceOf[js.Any])
    if (connectors != null) __obj.updateDynamic("connectors")(connectors.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (visual != null) __obj.updateDynamic("visual")(visual.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShape]
  }
}

