package typings.materialUiCore.clickAwayListenerClickAwayListenerMod

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
import scala.scalajs.js.annotation._

@js.native
trait ClickAwayListenerProps extends js.Object {
  var children: ReactNode = js.native
  var mouseEvent: js.UndefOr[onClick | onMouseDown | onMouseUp | `false`] = js.native
  var touchEvent: js.UndefOr[onTouchStart | onTouchEnd | `false`] = js.native
  def onClickAway(event: ChangeEvent[js.Object]): Unit = js.native
}

object ClickAwayListenerProps {
  @scala.inline
  def apply(onClickAway: ChangeEvent[js.Object] => Unit): ClickAwayListenerProps = {
    val __obj = js.Dynamic.literal(onClickAway = js.Any.fromFunction1(onClickAway))
    __obj.asInstanceOf[ClickAwayListenerProps]
  }
  @scala.inline
  implicit class ClickAwayListenerPropsOps[Self <: ClickAwayListenerProps] (val x: Self) extends AnyVal {
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
    def setOnClickAway(value: ChangeEvent[js.Object] => Unit): Self = this.set("onClickAway", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setMouseEvent(value: onClick | onMouseDown | onMouseUp | `false`): Self = this.set("mouseEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouseEvent: Self = this.set("mouseEvent", js.undefined)
    @scala.inline
    def setTouchEvent(value: onTouchStart | onTouchEnd | `false`): Self = this.set("touchEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchEvent: Self = this.set("touchEvent", js.undefined)
  }
  
}

