package typings
package kineticjsLib.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerConfig extends ObjectOptionsConfig {
  var clearBeforeDraw: js.UndefOr[scala.Boolean] = js.undefined
}

object LayerConfig {
  @scala.inline
  def apply(
    clearBeforeDraw: js.UndefOr[scala.Boolean] = js.undefined,
    dragBoundFunc: js.Function1[/* pos */ Vector2d, Vector2d] = null,
    dragBounds: js.Any = null,
    dragConstraint: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    listening: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    offset: Vector2d = null,
    opacity: js.Any = null,
    rotation: scala.Int | scala.Double = null,
    rotationDeg: scala.Int | scala.Double = null,
    scale: Vector2d = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): LayerConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearBeforeDraw)) __obj.updateDynamic("clearBeforeDraw")(clearBeforeDraw)
    if (dragBoundFunc != null) __obj.updateDynamic("dragBoundFunc")(dragBoundFunc)
    if (dragBounds != null) __obj.updateDynamic("dragBounds")(dragBounds)
    if (dragConstraint != null) __obj.updateDynamic("dragConstraint")(dragConstraint)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(listening)) __obj.updateDynamic("listening")(listening)
    if (name != null) __obj.updateDynamic("name")(name)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (rotationDeg != null) __obj.updateDynamic("rotationDeg")(rotationDeg.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerConfig]
  }
}

