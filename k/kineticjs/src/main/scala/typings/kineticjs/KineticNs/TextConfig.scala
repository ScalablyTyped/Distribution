package typings.kineticjs.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextConfig
  extends DrawOptionsConfig
     with ObjectOptionsConfig {
  var align: js.UndefOr[String] = js.undefined
  var cornerRadius: js.UndefOr[Double] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[String] = js.undefined
  var text: String
  var textFill: js.UndefOr[js.Any] = js.undefined
  var textStroke: js.UndefOr[js.Any] = js.undefined
  var textStrokeWidth: js.UndefOr[Double] = js.undefined
}

object TextConfig {
  @scala.inline
  def apply(
    text: String,
    align: String = null,
    cornerRadius: Int | Double = null,
    dragBoundFunc: /* pos */ Vector2d => Vector2d = null,
    dragBounds: js.Any = null,
    dragConstraint: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    fill: String = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontStyle: String = null,
    height: Int | Double = null,
    id: String = null,
    lineHeight: Int | Double = null,
    lineJoin: String = null,
    listening: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    offset: Vector2d = null,
    opacity: js.Any = null,
    padding: String = null,
    rotation: Int | Double = null,
    rotationDeg: Int | Double = null,
    scale: Vector2d = null,
    shadow: js.Any = null,
    stroke: String = null,
    strokeWidth: Int | Double = null,
    textFill: js.Any = null,
    textStroke: js.Any = null,
    textStrokeWidth: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): TextConfig = {
    val __obj = js.Dynamic.literal(text = text)
    if (align != null) __obj.updateDynamic("align")(align)
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (dragBoundFunc != null) __obj.updateDynamic("dragBoundFunc")(js.Any.fromFunction1(dragBoundFunc))
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

