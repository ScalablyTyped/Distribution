package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaults extends js.Object {
  var connectorDefaults: js.UndefOr[DiagramShapeDefaultsConnectorDefaults] = js.undefined
  var connectors: js.UndefOr[js.Array[DiagramShapeDefaultsConnector]] = js.undefined
  var content: js.UndefOr[DiagramShapeDefaultsContent] = js.undefined
  var editable: js.UndefOr[Boolean | DiagramShapeDefaultsEditable] = js.undefined
  var fill: js.UndefOr[String | DiagramShapeDefaultsFill] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hover: js.UndefOr[DiagramShapeDefaultsHover] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var rotation: js.UndefOr[DiagramShapeDefaultsRotation] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var stroke: js.UndefOr[DiagramShapeDefaultsStroke] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object DiagramShapeDefaults {
  @scala.inline
  def apply(
    connectorDefaults: DiagramShapeDefaultsConnectorDefaults = null,
    connectors: js.Array[DiagramShapeDefaultsConnector] = null,
    content: DiagramShapeDefaultsContent = null,
    editable: Boolean | DiagramShapeDefaultsEditable = null,
    fill: String | DiagramShapeDefaultsFill = null,
    height: js.UndefOr[Double] = js.undefined,
    hover: DiagramShapeDefaultsHover = null,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    path: String = null,
    rotation: DiagramShapeDefaultsRotation = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    stroke: DiagramShapeDefaultsStroke = null,
    `type`: String = null,
    visual: js.Function = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): DiagramShapeDefaults = {
    val __obj = js.Dynamic.literal()
    if (connectorDefaults != null) __obj.updateDynamic("connectorDefaults")(connectorDefaults.asInstanceOf[js.Any])
    if (connectors != null) __obj.updateDynamic("connectors")(connectors.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (visual != null) __obj.updateDynamic("visual")(visual.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaults]
  }
}

