package typings.gridstack

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * internal descriptions describing the items in the grid
  */
@js.native
trait GridStackNode extends GridstackWidget {
  var _grid: GridStack = js.native
  var el: HTMLElement = js.native
}

object GridStackNode {
  @scala.inline
  def apply(_grid: GridStack, el: HTMLElement): GridStackNode = {
    val __obj = js.Dynamic.literal(_grid = _grid.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridStackNode]
  }
  @scala.inline
  implicit class GridStackNodeOps[Self <: GridStackNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_grid(value: GridStack): Self = this.set("_grid", value.asInstanceOf[js.Any])
    @scala.inline
    def setEl(value: HTMLElement): Self = this.set("el", value.asInstanceOf[js.Any])
  }
  
}

