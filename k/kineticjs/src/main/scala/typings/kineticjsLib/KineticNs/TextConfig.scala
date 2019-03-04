package typings
package kineticjsLib.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextConfig
  extends DrawOptionsConfig
     with ObjectOptionsConfig {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var cornerRadius: js.UndefOr[scala.Double] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var fontStyle: js.UndefOr[java.lang.String] = js.undefined
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
  var textFill: js.UndefOr[js.Any] = js.undefined
  var textStroke: js.UndefOr[js.Any] = js.undefined
  var textStrokeWidth: js.UndefOr[scala.Double] = js.undefined
}

object TextConfig {
  @scala.inline
  def apply(
    text: java.lang.String,
    align: java.lang.String = null,
    cornerRadius: scala.Int | scala.Double = null,
    dragBoundFunc: js.Function1[/* pos */ Vector2d, Vector2d] = null,
    dragBounds: js.Any = null,
    dragConstraint: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    fill: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    fontStyle: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    lineHeight: scala.Int | scala.Double = null,
    lineJoin: java.lang.String = null,
    listening: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    offset: Vector2d = null,
    opacity: js.Any = null,
    padding: java.lang.String = null,
    rotation: scala.Int | scala.Double = null,
    rotationDeg: scala.Int | scala.Double = null,
    scale: Vector2d = null,
    shadow: js.Any = null,
    stroke: java.lang.String = null,
    strokeWidth: scala.Int | scala.Double = null,
    textFill: js.Any = null,
    textStroke: js.Any = null,
    textStrokeWidth: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): TextConfig = {
    val __obj = js.Dynamic.literal(text = text)
    if (align != null) __obj.updateDynamic("align")(align)
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (dragBoundFunc != null) __obj.updateDynamic("dragBoundFunc")(dragBoundFunc)
    if (dragBounds != null) __obj.updateDynamic("dragBounds")(dragBounds)
    if (dragConstraint != null) __obj.updateDynamic("dragConstraint")(dragConstraint)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (!js.isUndefined(listening)) __obj.updateDynamic("listening")(listening)
    if (name != null) __obj.updateDynamic("name")(name)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (rotationDeg != null) __obj.updateDynamic("rotationDeg")(rotationDeg.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (textFill != null) __obj.updateDynamic("textFill")(textFill)
    if (textStroke != null) __obj.updateDynamic("textStroke")(textStroke)
    if (textStrokeWidth != null) __obj.updateDynamic("textStrokeWidth")(textStrokeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextConfig]
  }
}

