package typings.kineticjs.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpriteConfig
  extends DrawOptionsConfig
     with ObjectOptionsConfig {
  var animation: js.UndefOr[js.Any] = js.undefined
  var animations: js.UndefOr[js.Any] = js.undefined
  var frameRate: js.UndefOr[Double] = js.undefined
  var image: js.Any
}

object SpriteConfig {
  @scala.inline
  def apply(
    image: js.Any,
    animation: js.Any = null,
    animations: js.Any = null,
    dragBoundFunc: /* pos */ Vector2d => Vector2d = null,
    dragBounds: js.Any = null,
    dragConstraint: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    fill: String = null,
    frameRate: Int | Double = null,
    height: Int | Double = null,
    id: String = null,
    lineJoin: String = null,
    listening: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    offset: Vector2d = null,
    opacity: js.Any = null,
    rotation: Int | Double = null,
    rotationDeg: Int | Double = null,
    scale: Vector2d = null,
    shadow: js.Any = null,
    stroke: String = null,
    strokeWidth: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): SpriteConfig = {
    val __obj = js.Dynamic.literal(image = image)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (animations != null) __obj.updateDynamic("animations")(animations)
    if (dragBoundFunc != null) __obj.updateDynamic("dragBoundFunc")(js.Any.fromFunction1(dragBoundFunc))
    if (dragBounds != null) __obj.updateDynamic("dragBounds")(dragBounds)
    if (dragConstraint != null) __obj.updateDynamic("dragConstraint")(dragConstraint)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (!js.isUndefined(listening)) __obj.updateDynamic("listening")(listening)
    if (name != null) __obj.updateDynamic("name")(name)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (rotationDeg != null) __obj.updateDynamic("rotationDeg")(rotationDeg.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteConfig]
  }
}

