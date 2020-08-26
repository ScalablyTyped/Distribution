package typings.ionicCore.modalInterfaceMod

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.mod.FrameworkDelegate
import typings.ionicCore.mod.Mode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalOptions[T /* <: ComponentRef */] extends js.Object {
  var animated: js.UndefOr[Boolean] = js.native
  var backdropDismiss: js.UndefOr[Boolean] = js.native
  var component: T = js.native
  var componentProps: js.UndefOr[ComponentProps[T]] = js.native
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  var delegate: js.UndefOr[FrameworkDelegate] = js.native
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  var id: js.UndefOr[String] = js.native
  var keyboardClose: js.UndefOr[Boolean] = js.native
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  var mode: js.UndefOr[Mode] = js.native
  var presentingElement: js.UndefOr[HTMLElement] = js.native
  var showBackdrop: js.UndefOr[Boolean] = js.native
  var swipeToClose: js.UndefOr[Boolean] = js.native
}

object ModalOptions {
  @scala.inline
  def apply[/* <: typings.ionicCore.mod.ComponentRef */ T](component: T): ModalOptions[T] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalOptions[T]]
  }
  @scala.inline
  implicit class ModalOptionsOps[Self <: ModalOptions[_], /* <: typings.ionicCore.mod.ComponentRef */ T] (val x: Self with ModalOptions[T]) extends AnyVal {
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
    def setComponent(value: T): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setBackdropDismiss(value: Boolean): Self = this.set("backdropDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropDismiss: Self = this.set("backdropDismiss", js.undefined)
    @scala.inline
    def setComponentProps(value: ComponentProps[T]): Self = this.set("componentProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentProps: Self = this.set("componentProps", js.undefined)
    @scala.inline
    def setCssClassVarargs(value: String*): Self = this.set("cssClass", js.Array(value :_*))
    @scala.inline
    def setCssClass(value: String | js.Array[String]): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDelegate(value: FrameworkDelegate): Self = this.set("delegate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegate: Self = this.set("delegate", js.undefined)
    @scala.inline
    def setEnterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("enterAnimation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEnterAnimation: Self = this.set("enterAnimation", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKeyboardClose(value: Boolean): Self = this.set("keyboardClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardClose: Self = this.set("keyboardClose", js.undefined)
    @scala.inline
    def setLeaveAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("leaveAnimation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLeaveAnimation: Self = this.set("leaveAnimation", js.undefined)
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setPresentingElement(value: HTMLElement): Self = this.set("presentingElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresentingElement: Self = this.set("presentingElement", js.undefined)
    @scala.inline
    def setShowBackdrop(value: Boolean): Self = this.set("showBackdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBackdrop: Self = this.set("showBackdrop", js.undefined)
    @scala.inline
    def setSwipeToClose(value: Boolean): Self = this.set("swipeToClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeToClose: Self = this.set("swipeToClose", js.undefined)
  }
  
}

