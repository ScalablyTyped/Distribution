package typings.kendoDashUi.kendoNs.datavizNs.uiNs

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
    height: Int | Double = null,
    hover: DiagramShapeHover = null,
    id: String = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    path: String = null,
    rotation: DiagramShapeRotation = null,
    source: String = null,
    stroke: DiagramShapeStroke = null,
    `type`: String = null,
    visual: js.Function = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): DiagramShape = {
    val __obj = js.Dynamic.literal()
    if (connectorDefaults != null) __obj.updateDynamic("connectorDefaults")(connectorDefaults)
    if (connectors != null) __obj.updateDynamic("connectors")(connectors)
    if (content != null) __obj.updateDynamic("content")(content)
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (id != null) __obj.updateDynamic("id")(id)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation)
    if (source != null) __obj.updateDynamic("source")(source)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (visual != null) __obj.updateDynamic("visual")(visual)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShape]
  }
}

