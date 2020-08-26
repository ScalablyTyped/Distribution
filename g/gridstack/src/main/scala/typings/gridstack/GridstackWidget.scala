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
@js.native
trait GridstackWidget extends js.Object {
  var autoPosition: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var id: js.UndefOr[Double | String] = js.native
  var locked: js.UndefOr[Boolean] = js.native
  var maxHeight: js.UndefOr[Double] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var minHeight: js.UndefOr[Double] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var noMove: js.UndefOr[Boolean] = js.native
  var noResize: js.UndefOr[Boolean] = js.native
  var resizeHandles: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
}

object GridstackWidget {
  @scala.inline
  def apply(): GridstackWidget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridstackWidget]
  }
  @scala.inline
  implicit class GridstackWidgetOps[Self <: GridstackWidget] (val x: Self) extends AnyVal {
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
    def setAutoPosition(value: Boolean): Self = this.set("autoPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPosition: Self = this.set("autoPosition", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setId(value: Double | String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setNoMove(value: Boolean): Self = this.set("noMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoMove: Self = this.set("noMove", js.undefined)
    @scala.inline
    def setNoResize(value: Boolean): Self = this.set("noResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoResize: Self = this.set("noResize", js.undefined)
    @scala.inline
    def setResizeHandles(value: String): Self = this.set("resizeHandles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeHandles: Self = this.set("resizeHandles", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

