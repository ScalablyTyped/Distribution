package typings.mapsjs.anon

import typings.mapsjs.mod.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownAction extends js.Object {
  var downAction: js.UndefOr[js.Function1[/* downPoint */ point, _]] = js.native
  var dragEnabled: Boolean = js.native
  var moveAction: js.UndefOr[js.Function1[/* movePoint */ point, Unit]] = js.native
  var upAction: js.UndefOr[js.Function1[/* upPoint */ point, Unit]] = js.native
  var useElementInsteadOfNewGestureOverlay: Boolean = js.native
  var wheelAction: js.UndefOr[js.Function1[/* delta */ Double, Unit]] = js.native
}

object DownAction {
  @scala.inline
  def apply(dragEnabled: Boolean, useElementInsteadOfNewGestureOverlay: Boolean): DownAction = {
    val __obj = js.Dynamic.literal(dragEnabled = dragEnabled.asInstanceOf[js.Any], useElementInsteadOfNewGestureOverlay = useElementInsteadOfNewGestureOverlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownAction]
  }
  @scala.inline
  implicit class DownActionOps[Self <: DownAction] (val x: Self) extends AnyVal {
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
    def setDragEnabled(value: Boolean): Self = this.set("dragEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseElementInsteadOfNewGestureOverlay(value: Boolean): Self = this.set("useElementInsteadOfNewGestureOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownAction(value: /* downPoint */ point => _): Self = this.set("downAction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDownAction: Self = this.set("downAction", js.undefined)
    @scala.inline
    def setMoveAction(value: /* movePoint */ point => Unit): Self = this.set("moveAction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMoveAction: Self = this.set("moveAction", js.undefined)
    @scala.inline
    def setUpAction(value: /* upPoint */ point => Unit): Self = this.set("upAction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpAction: Self = this.set("upAction", js.undefined)
    @scala.inline
    def setWheelAction(value: /* delta */ Double => Unit): Self = this.set("wheelAction", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWheelAction: Self = this.set("wheelAction", js.undefined)
  }
  
}

