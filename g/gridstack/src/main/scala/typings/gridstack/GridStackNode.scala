package typings.gridstack

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * internal descriptions describing the items in the grid
  */
trait GridStackNode extends GridstackWidget {
  var _grid: GridStack
  var el: HTMLElement
}

object GridStackNode {
  @scala.inline
  def apply(
    _grid: GridStack,
    el: HTMLElement,
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
  ): GridStackNode = {
    val __obj = js.Dynamic.literal(_grid = _grid.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[GridStackNode]
  }
}

