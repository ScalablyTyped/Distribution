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
    height: Int | Double = null,
    id: Double | String = null,
    locked: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    noMove: js.UndefOr[Boolean] = js.undefined,
    noResize: js.UndefOr[Boolean] = js.undefined,
    resizeHandles: String = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): GridStackNode = {
    val __obj = js.Dynamic.literal(_grid = _grid.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPosition)) __obj.updateDynamic("autoPosition")(autoPosition.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(noMove)) __obj.updateDynamic("noMove")(noMove.asInstanceOf[js.Any])
    if (!js.isUndefined(noResize)) __obj.updateDynamic("noResize")(noResize.asInstanceOf[js.Any])
    if (resizeHandles != null) __obj.updateDynamic("resizeHandles")(resizeHandles.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridStackNode]
  }
}

