package typings.materialUi.overlayMod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayProps extends Props[Overlay] {
  var autoLockScrolling: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  var show: Boolean = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var transitionEnabled: js.UndefOr[Boolean] = js.native
}

object OverlayProps {
  @scala.inline
  def apply(show: Boolean): OverlayProps = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
  @scala.inline
  implicit class OverlayPropsOps[Self <: OverlayProps] (val x: Self) extends AnyVal {
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
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoLockScrolling(value: Boolean): Self = this.set("autoLockScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoLockScrolling: Self = this.set("autoLockScrolling", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTransitionEnabled(value: Boolean): Self = this.set("transitionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionEnabled: Self = this.set("transitionEnabled", js.undefined)
  }
  
}

