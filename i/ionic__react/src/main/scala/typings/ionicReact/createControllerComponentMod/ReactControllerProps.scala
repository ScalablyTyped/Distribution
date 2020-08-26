package typings.ionicReact.createControllerComponentMod

import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactControllerProps extends js.Object {
  var isOpen: Boolean = js.native
  var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.native
  var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.native
  var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.native
  var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.native
}

object ReactControllerProps {
  @scala.inline
  def apply(isOpen: Boolean): ReactControllerProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactControllerProps]
  }
  @scala.inline
  implicit class ReactControllerPropsOps[Self <: ReactControllerProps] (val x: Self) extends AnyVal {
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
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDidDismiss(value: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit): Self = this.set("onDidDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDidDismiss: Self = this.set("onDidDismiss", js.undefined)
    @scala.inline
    def setOnDidPresent(value: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit): Self = this.set("onDidPresent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDidPresent: Self = this.set("onDidPresent", js.undefined)
    @scala.inline
    def setOnWillDismiss(value: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit): Self = this.set("onWillDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWillDismiss: Self = this.set("onWillDismiss", js.undefined)
    @scala.inline
    def setOnWillPresent(value: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit): Self = this.set("onWillPresent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWillPresent: Self = this.set("onWillPresent", js.undefined)
  }
  
}

