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
    height: js.UndefOr[Double] = js.undefined,
    id: String = null,
    listening: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    offset: Vector2d = null,
    opacity: js.Any = null,
    rotation: js.UndefOr[Double] = js.undefined,
    rotationDeg: js.UndefOr[Double] = js.undefined,
    scale: Vector2d = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): ObjectOptionsConfig = {
    val __obj = js.Dynamic.literal()
    if (dragBoundFunc != null) __obj.updateDynamic("dragBoundFunc")(js.Any.fromFunction1(dragBoundFunc))
    if (dragBounds != null) __obj.updateDynamic("dragBounds")(dragBounds.asInstanceOf[js.Any])
    if (dragConstraint != null) __obj.updateDynamic("dragConstraint")(dragConstraint.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(listening)) __obj.updateDynamic("listening")(listening.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationDeg)) __obj.updateDynamic("rotationDeg")(rotationDeg.get.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectOptionsConfig]
  }
}

