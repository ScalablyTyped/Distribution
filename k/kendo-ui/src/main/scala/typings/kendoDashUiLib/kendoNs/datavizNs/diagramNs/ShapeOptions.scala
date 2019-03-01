package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeOptions extends js.Object {
  var connectorDefaults: js.UndefOr[ShapeConnectorDefaults] = js.undefined
  var connectors: js.UndefOr[js.Array[ShapeConnector]] = js.undefined
  var content: js.UndefOr[ShapeContent] = js.undefined
  var editable: js.UndefOr[scala.Boolean | ShapeEditable] = js.undefined
  var fill: js.UndefOr[java.lang.String | ShapeFill] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var hover: js.UndefOr[ShapeHover] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var rotation: js.UndefOr[ShapeRotation] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var stroke: js.UndefOr[ShapeStroke] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object ShapeOptions {
  @scala.inline
  def apply(
    connectorDefaults: ShapeConnectorDefaults = null,
    connectors: js.Array[ShapeConnector] = null,
    content: ShapeContent = null,
    editable: scala.Boolean | ShapeEditable = null,
    fill: java.lang.String | ShapeFill = null,
    height: scala.Int | scala.Double = null,
    hover: ShapeHover = null,
    id: java.lang.String = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    path: java.lang.String = null,
    rotation: ShapeRotation = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    stroke: ShapeStroke = null,
    `type`: java.lang.String = null,
    visual: js.Function = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): ShapeOptions = {
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
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (visual != null) __obj.updateDynamic("visual")(visual)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeOptions]
  }
}

