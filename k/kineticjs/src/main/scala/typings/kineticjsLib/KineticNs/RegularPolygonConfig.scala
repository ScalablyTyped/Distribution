package typings
package kineticjsLib.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegularPolygonConfig
  extends DrawOptionsConfig
     with ObjectOptionsConfig {
  var radius: scala.Double
  var sides: scala.Double
}

object RegularPolygonConfig {
  @scala.inline
  def apply(
    radius: scala.Double,
    sides: scala.Double,
    dragBoundFunc: js.Function1[/* pos */ Vector2d, Vector2d] = null,
    dragBounds: js.Any = null,
    dragConstraint: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    fill: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    lineJoin: java.lang.String = null,
    listening: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    offset: Vector2d = null,
    opacity: js.Any = null,
    rotation: scala.Int | scala.Double = null,
    rotationDeg: scala.Int | scala.Double = null,
    scale: Vector2d = null,
    shadow: js.Any = null,
    stroke: java.lang.String = null,
    strokeWidth: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): RegularPolygonConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("radius")(radius)
    __obj.updateDynamic("sides")(sides)
    if (dragBoundFunc != null) __obj.updateDynamic("dragBoundFunc")(dragBoundFunc)
    if (dragBounds != null) __obj.updateDynamic("dragBounds")(dragBounds)
    if (dragConstraint != null) __obj.updateDynamic("dragConstraint")(dragConstraint)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (fill != null) __obj.updateDynamic("fill")(fill)
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
    __obj.asInstanceOf[RegularPolygonConfig]
  }
}

