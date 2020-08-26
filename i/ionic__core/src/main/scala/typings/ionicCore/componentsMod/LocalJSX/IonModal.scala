package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.mod.ComponentRef
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonModal extends js.Object {
  /**
    * If `true`, the modal will animate.
    */
  var animated: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the modal will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: js.UndefOr[Boolean] = js.native
  /**
    * The component to display inside of the modal.
    */
  var component: ComponentRef = js.native
  /**
    * The data to pass to the modal component.
    */
  var componentProps: js.UndefOr[ComponentProps[Null]] = js.native
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Animation to use when the modal is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: js.UndefOr[Boolean] = js.native
  /**
    * Animation to use when the modal is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  /**
    * Emitted after the modal has dismissed.
    */
  var onIonModalDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.native
  /**
    * Emitted after the modal has presented.
    */
  var onIonModalDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * Emitted before the modal has dismissed.
    */
  var onIonModalWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.native
  /**
    * Emitted before the modal has presented.
    */
  var onIonModalWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.native
  /**
    * The element that presented the modal. This is used for card presentation effects and for stacking multiple modals on top of each other. Only applies in iOS mode.
    */
  var presentingElement: js.UndefOr[HTMLElement] = js.native
  /**
    * If `true`, a backdrop will be displayed behind the modal.
    */
  var showBackdrop: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the modal can be swiped to dismiss. Only applies in iOS mode.
    */
  var swipeToClose: js.UndefOr[Boolean] = js.native
}

object IonModal {
  @scala.inline
  def apply(): IonModal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonModal]
  }
  @scala.inline
  implicit class IonModalOps[Self <: IonModal] (val x: Self) extends AnyVal {
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setBackdropDismiss(value: Boolean): Self = this.set("backdropDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropDismiss: Self = this.set("backdropDismiss", js.undefined)
    @scala.inline
    def setComponent(value: ComponentRef): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentNull: Self = this.set("component", null)
    @scala.inline
    def setComponentProps(value: ComponentProps[Null]): Self = this.set("componentProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentProps: Self = this.set("componentProps", js.undefined)
    @scala.inline
    def setCssClassVarargs(value: String*): Self = this.set("cssClass", js.Array(value :_*))
    @scala.inline
    def setCssClass(value: String | js.Array[String]): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setEnterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("enterAnimation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEnterAnimation: Self = this.set("enterAnimation", js.undefined)
    @scala.inline
    def setKeyboardClose(value: Boolean): Self = this.set("keyboardClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardClose: Self = this.set("keyboardClose", js.undefined)
    @scala.inline
    def setLeaveAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("leaveAnimation", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLeaveAnimation: Self = this.set("leaveAnimation", js.undefined)
    @scala.inline
    def setMode(value: ios | md): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOnIonModalDidDismiss(value: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit): Self = this.set("onIonModalDidDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonModalDidDismiss: Self = this.set("onIonModalDidDismiss", js.undefined)
    @scala.inline
    def setOnIonModalDidPresent(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonModalDidPresent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonModalDidPresent: Self = this.set("onIonModalDidPresent", js.undefined)
    @scala.inline
    def setOnIonModalWillDismiss(value: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit): Self = this.set("onIonModalWillDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonModalWillDismiss: Self = this.set("onIonModalWillDismiss", js.undefined)
    @scala.inline
    def setOnIonModalWillPresent(value: /* event */ CustomEvent[Unit] => Unit): Self = this.set("onIonModalWillPresent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnIonModalWillPresent: Self = this.set("onIonModalWillPresent", js.undefined)
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

