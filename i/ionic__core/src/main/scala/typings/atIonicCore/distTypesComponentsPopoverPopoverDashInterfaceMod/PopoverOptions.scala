package typings.atIonicCore.distTypesComponentsPopoverPopoverDashInterfaceMod

import typings.atIonicCore.distTypesInterfaceMod.ComponentProps
import typings.atIonicCore.distTypesInterfaceMod.ComponentRef
import typings.atIonicCore.distTypesInterfaceMod.FrameworkDelegate
import typings.atIonicCore.distTypesInterfaceMod.Mode
import typings.atIonicCore.distTypesUtilsAnimationAnimationDashInterfaceMod.AnimationBuilder
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverOptions[T /* <: ComponentRef */] extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  var component: T
  var componentProps: js.UndefOr[ComponentProps[T]] = js.undefined
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var delegate: js.UndefOr[FrameworkDelegate] = js.undefined
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var event: js.UndefOr[Event] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
  var translucent: js.UndefOr[Boolean] = js.undefined
}

object PopoverOptions {
  @scala.inline
  def apply[T /* <: ComponentRef */](
    component: T,
    animated: js.UndefOr[Boolean] = js.undefined,
    backdropDismiss: js.UndefOr[Boolean] = js.undefined,
    componentProps: ComponentProps[T] = null,
    cssClass: String | js.Array[String] = null,
    delegate: FrameworkDelegate = null,
    enterAnimation: AnimationBuilder = null,
    event: Event = null,
    id: String = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leaveAnimation: AnimationBuilder = null,
    mode: Mode = null,
    showBackdrop: js.UndefOr[Boolean] = js.undefined,
    translucent: js.UndefOr[Boolean] = js.undefined
  ): PopoverOptions[T] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (!js.isUndefined(backdropDismiss)) __obj.updateDynamic("backdropDismiss")(backdropDismiss)
    if (componentProps != null) __obj.updateDynamic("componentProps")(componentProps)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (delegate != null) __obj.updateDynamic("delegate")(delegate)
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(enterAnimation)
    if (event != null) __obj.updateDynamic("event")(event)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose)
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(leaveAnimation)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(showBackdrop)) __obj.updateDynamic("showBackdrop")(showBackdrop)
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    __obj.asInstanceOf[PopoverOptions[T]]
  }
}

