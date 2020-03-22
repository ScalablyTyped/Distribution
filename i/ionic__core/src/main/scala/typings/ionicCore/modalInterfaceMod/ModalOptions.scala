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

trait ModalOptions[T /* <: ComponentRef */] extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  var component: T
  var componentProps: js.UndefOr[ComponentProps[T]] = js.undefined
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var delegate: js.UndefOr[FrameworkDelegate] = js.undefined
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var presentingElement: js.UndefOr[HTMLElement] = js.undefined
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
  var swipeToClose: js.UndefOr[Boolean] = js.undefined
}

object ModalOptions {
  @scala.inline
  def apply[T /* <: ComponentRef */](
    component: T,
    animated: js.UndefOr[Boolean] = js.undefined,
    backdropDismiss: js.UndefOr[Boolean] = js.undefined,
    componentProps: ComponentProps[T] = null,
    cssClass: String | js.Array[String] = null,
    delegate: FrameworkDelegate = null,
    enterAnimation: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    id: String = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leaveAnimation: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    mode: Mode = null,
    presentingElement: HTMLElement = null,
    showBackdrop: js.UndefOr[Boolean] = js.undefined,
    swipeToClose: js.UndefOr[Boolean] = js.undefined
  ): ModalOptions[T] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (!js.isUndefined(backdropDismiss)) __obj.updateDynamic("backdropDismiss")(backdropDismiss.asInstanceOf[js.Any])
    if (componentProps != null) __obj.updateDynamic("componentProps")(componentProps.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(js.Any.fromFunction2(enterAnimation))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose.asInstanceOf[js.Any])
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(js.Any.fromFunction2(leaveAnimation))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (presentingElement != null) __obj.updateDynamic("presentingElement")(presentingElement.asInstanceOf[js.Any])
    if (!js.isUndefined(showBackdrop)) __obj.updateDynamic("showBackdrop")(showBackdrop.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeToClose)) __obj.updateDynamic("swipeToClose")(swipeToClose.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalOptions[T]]
  }
}

