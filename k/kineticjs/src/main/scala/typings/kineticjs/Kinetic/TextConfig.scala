package typings.kineticjs.Kinetic

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
    cornerRadius: js.UndefOr[Double] = js.undefined,
    dragBoundFunc: /* pos */ Vector2d => Vector2d = null,
    dragBounds: js.Any = null,
    dragConstraint: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    fill: String = null,
    fontFamily: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    fontStyle: String = null,
    height: js.UndefOr[Double] = js.undefined,
    id: String = null,
    lineHeight: js.UndefOr[Double] = js.undefined,
    lineJoin: String = null,
    listening: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    offset: Vector2d = null,
    opacity: js.Any = null,
    padding: String = null,
    rotation: js.UndefOr[Double] = js.undefined,
    rotationDeg: js.UndefOr[Double] = js.undefined,
    scale: Vector2d = null,
    shadow: js.Any = null,
    stroke: String = null,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    textFill: js.Any = null,
    textStroke: js.Any = null,
    textStrokeWidth: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): TextConfig = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(cornerRadius)) __obj.updateDynamic("cornerRadius")(cornerRadius.get.asInstanceOf[js.Any])
    if (dragBoundFunc != null) __obj.updateDynamic("dragBoundFunc")(js.Any.fromFunction1(dragBoundFunc))
    if (dragBounds != null) __obj.updateDynamic("dragBounds")(dragBounds.asInstanceOf[js.Any])
    if (dragConstraint != null) __obj.updateDynamic("dragConstraint")(dragConstraint.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(lineHeight)) __obj.updateDynamic("lineHeight")(lineHeight.get.asInstanceOf[js.Any])
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin.asInstanceOf[js.Any])
    if (!js.isUndefined(listening)) __obj.updateDynamic("listening")(listening.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationDeg)) __obj.updateDynamic("rotationDeg")(rotationDeg.get.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    if (textFill != null) __obj.updateDynamic("textFill")(textFill.asInstanceOf[js.Any])
    if (textStroke != null) __obj.updateDynamic("textStroke")(textStroke.asInstanceOf[js.Any])
    if (!js.isUndefined(textStrokeWidth)) __obj.updateDynamic("textStrokeWidth")(textStrokeWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextConfig]
  }
}

