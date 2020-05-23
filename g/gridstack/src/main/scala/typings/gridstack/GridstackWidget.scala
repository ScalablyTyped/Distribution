package typings.gridstack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gridstack Widget creation options
  * @param x widget position x (default?: 0)
  * @param y widget position y (default?: 0)
  * @param width  widget dimension width (default?: 1)
  * @param height widget dimension height (default?: 1)
  * @param autoPosition if true then x, y parameters will be ignored and widget will be places on the first available position (default?: false)
  * @param minWidth minimum width allowed during resize/creation (default?: undefined = un-constrained)
  * @param maxWidth maximum width allowed during resize/creation (default?: undefined = un-constrained)
  * @param minHeight minimum height allowed during resize/creation (default?: undefined = un-constrained)
  * @param maxHeight maximum height allowed during resize/creation (default?: undefined = un-constrained)
  * @param noResize prevent resizing (default?: undefined = un-constrained)
  * @param noMove prevents moving (default?: undefined = un-constrained)
  * @param locked prevents moving and resizing (default?: undefined = un-constrained)
  * @param resizeHandles widgets can have their own resize handles. For example 'e,w' will make the particular widget only resize east and west.
  * @param id value for `data-gs-id` stored on the widget (default?: undefined)
  */
trait GridstackWidget extends js.Object {
  var autoPosition: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[Double | String] = js.undefined
  var locked: js.UndefOr[Boolean] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var noMove: js.UndefOr[Boolean] = js.undefined
  var noResize: js.UndefOr[Boolean] = js.undefined
  var resizeHandles: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object GridstackWidget {
  @scala.inline
  def apply(
    autoPosition: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    id: Double | String = null,
    locked: js.UndefOr[Boolean] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    noMove: js.UndefOr[Boolean] = js.undefined,
    noResize: js.UndefOr[Boolean] = js.undefined,
    resizeHandles: String = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): GridstackWidget = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPosition)) __obj.updateDynamic("autoPosition")(autoPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noMove)) __obj.updateDynamic("noMove")(noMove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noResize)) __obj.updateDynamic("noResize")(noResize.get.asInstanceOf[js.Any])
    if (resizeHandles != null) __obj.updateDynamic("resizeHandles")(resizeHandles.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridstackWidget]
  }
}

