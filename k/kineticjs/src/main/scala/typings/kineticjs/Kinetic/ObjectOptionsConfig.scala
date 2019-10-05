package typings.kineticjs.Kinetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectOptionsConfig extends js.Object {
  var dragBoundFunc: js.UndefOr[js.Function1[/* pos */ Vector2d, Vector2d]] = js.undefined
  var dragBounds: js.UndefOr[js.Any] = js.undefined
  var dragConstraint: js.UndefOr[String] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var listening: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Vector2d] = js.undefined
  var opacity: js.UndefOr[js.Any] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var rotationDeg: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Vector2d] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object ObjectOptionsConfig {
  @scala.inline
  def apply(
    dragBoundFunc: /* pos */ Vector2d => Vector2d = null,
    dragBounds: js.Any = null,
    dragConstraint: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    id: String = null,
    listening: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    offset: Vector2d = null,
    opacity: js.Any = null,
    rotation: Int | Double = null,
    rotationDeg: Int | Double = null,
    scale: Vector2d = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): ObjectOptionsConfig = {
    val __obj = js.Dynamic.literal()
    if (dragBoundFunc != null) __obj.updateDynamic("dragBoundFunc")(js.Any.fromFunction1(dragBoundFunc))
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
    __obj.asInstanceOf[ObjectOptionsConfig]
  }
}

