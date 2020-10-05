package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreBooleans.`false`
import typings.materialUiCore.materialUiCoreStrings.onClick
import typings.materialUiCore.materialUiCoreStrings.onMouseDown
import typings.materialUiCore.materialUiCoreStrings.onMouseUp
import typings.materialUiCore.materialUiCoreStrings.onTouchEnd
import typings.materialUiCore.materialUiCoreStrings.onTouchStart
import typings.react.mod.ChangeEvent
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/ClickAwayListener.ClickAwayListenerProps> */
@js.native
trait PartialClickAwayListenerP extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var mouseEvent: js.UndefOr[onClick | onMouseDown | onMouseUp | `false`] = js.native
  var onClickAway: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.native
  var touchEvent: js.UndefOr[onTouchStart | onTouchEnd | `false`] = js.native
}

object PartialClickAwayListenerP {
  @scala.inline
  def apply(): PartialClickAwayListenerP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClickAwayListenerP]
  }
  @scala.inline
  implicit class PartialClickAwayListenerPOps[Self <: PartialClickAwayListenerP] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setMouseEvent(value: onClick | onMouseDown | onMouseUp | `false`): Self = this.set("mouseEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseEvent: Self = this.set("mouseEvent", js.undefined)
    @scala.inline
    def setOnClickAway(value: /* event */ ChangeEvent[js.Object] => Unit): Self = this.set("onClickAway", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClickAway: Self = this.set("onClickAway", js.undefined)
    @scala.inline
    def setTouchEvent(value: onTouchStart | onTouchEnd | `false`): Self = this.set("touchEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchEvent: Self = this.set("touchEvent", js.undefined)
  }
  
}

