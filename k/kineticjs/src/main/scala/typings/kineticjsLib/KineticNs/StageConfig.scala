package typings
package kineticjsLib.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StageConfig extends ObjectOptionsConfig {
  var container: java.lang.String
  @JSName("height")
  var height_StageConfig: scala.Double
  @JSName("width")
  var width_StageConfig: scala.Double
}

object StageConfig {
  @scala.inline
  def apply(
    container: java.lang.String,
    height: scala.Double,
    width: scala.Double,
    dragBoundFunc: js.Function1[/* pos */ Vector2d, Vector2d] = null,
    dragBounds: js.Any = null,
    dragConstraint: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    listening: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    offset: Vector2d = null,
    opacity: js.Any = null,
    rotation: scala.Int | scala.Double = null,
    rotationDeg: scala.Int | scala.Double = null,
    scale: Vector2d = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): StageConfig = {
    val __obj = js.Dynamic.literal(container = container, height = height, width = width)
    if (dragBoundFunc != null) __obj.updateDynamic("dragBoundFunc")(dragBoundFunc)
    if (dragBounds != null) __obj.updateDynamic("dragBounds")(dragBounds)
    if (dragConstraint != null) __obj.updateDynamic("dragConstraint")(dragConstraint)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(listening)) __obj.updateDynamic("listening")(listening)
    if (name != null) __obj.updateDynamic("name")(name)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (rotationDeg != null) __obj.updateDynamic("rotationDeg")(rotationDeg.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageConfig]
  }
}

