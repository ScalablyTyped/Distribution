package typings.materialUiCore.transitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-transition-group.react-transition-group/Transition.TransitionProps<undefined>, @material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerKeys> */
@js.native
trait TransitionHandlerProps extends js.Object {
  var onEnter: js.UndefOr[js.Any] = js.native
  var onEntered: js.UndefOr[js.Any] = js.native
  var onEntering: js.UndefOr[js.Any] = js.native
  var onExit: js.UndefOr[js.Any] = js.native
  var onExited: js.UndefOr[js.Any] = js.native
  var onExiting: js.UndefOr[js.Any] = js.native
}

object TransitionHandlerProps {
  @scala.inline
  def apply(): TransitionHandlerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionHandlerProps]
  }
  @scala.inline
  implicit class TransitionHandlerPropsOps[Self <: TransitionHandlerProps] (val x: Self) extends AnyVal {
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
    def setOnEnter(value: js.Any): Self = this.set("onEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnEntered(value: js.Any): Self = this.set("onEntered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEntered: Self = this.set("onEntered", js.undefined)
    @scala.inline
    def setOnEntering(value: js.Any): Self = this.set("onEntering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEntering: Self = this.set("onEntering", js.undefined)
    @scala.inline
    def setOnExit(value: js.Any): Self = this.set("onExit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    @scala.inline
    def setOnExited(value: js.Any): Self = this.set("onExited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExited: Self = this.set("onExited", js.undefined)
    @scala.inline
    def setOnExiting(value: js.Any): Self = this.set("onExiting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExiting: Self = this.set("onExiting", js.undefined)
  }
  
}

