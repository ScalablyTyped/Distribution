package typings.kendoDashUi.kendo.dataviz.ui

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
    height: Int | Double = null,
    hover: DiagramShapeDefaultsHover = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    path: String = null,
    rotation: DiagramShapeDefaultsRotation = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    stroke: DiagramShapeDefaultsStroke = null,
    `type`: String = null,
    visual: js.Function = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): DiagramShapeDefaults = {
    val __obj = js.Dynamic.literal()
    if (connectorDefaults != null) __obj.updateDynamic("connectorDefaults")(connectorDefaults)
    if (connectors != null) __obj.updateDynamic("connectors")(connectors)
    if (content != null) __obj.updateDynamic("content")(content)
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (source != null) __obj.updateDynamic("source")(source)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (visual != null) __obj.updateDynamic("visual")(visual)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaults]
  }
}

