package typings.materialUi.MaterialUI.Stepper

import typings.materialUi.MaterialUI.SharedEnhancedButtonProps
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepButtonProps extends SharedEnhancedButtonProps[StepButton] {
  var active: js.UndefOr[Boolean] = js.native
  var completed: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[ReactNode | String | Double] = js.native
  var onMouseEnter: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  var onMouseLeave: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  var onTouchStart: js.UndefOr[TouchEventHandler[js.Object]] = js.native
}

object StepButtonProps {
  @scala.inline
  def apply(): StepButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepButtonProps]
  }
  @scala.inline
  implicit class StepButtonPropsOps[Self <: StepButtonProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setCompleted(value: Boolean): Self = this.set("completed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleted: Self = this.set("completed", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIcon(value: ReactNode | String | Double): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnTouchStart(value: TouchEvent[js.Object] => Unit): Self = this.set("onTouchStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
  }
  
}

