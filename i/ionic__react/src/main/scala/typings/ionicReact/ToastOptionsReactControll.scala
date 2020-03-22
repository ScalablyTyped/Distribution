package typings.ionicReact

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.componentsMod._Global_.HTMLIonToastElement
import typings.ionicCore.mod.Color
import typings.ionicCore.mod.Mode
import typings.ionicCore.overlaysInterfaceMod.OverlayEventDetail
import typings.ionicReact.ionToastMod.ToastButton
import typings.ionicReact.ionicReactStrings.bottom
import typings.ionicReact.ionicReactStrings.middle
import typings.ionicReact.ionicReactStrings.top
import typings.react.mod.Key
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @ionic/react.@ionic/react/dist/types/components/IonToast.ToastOptions & @ionic/react.@ionic/react/dist/types/components/createControllerComponent.ReactControllerProps & {  forwardedRef ? :react.react.RefObject<@ionic/core.@ionic/core/dist/types/components._Global_.HTMLIonToastElement> | undefined} & react.react.RefAttributes<@ionic/core.@ionic/core/dist/types/components._Global_.HTMLIonToastElement> */
trait ToastOptionsReactControll extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var buttons: js.UndefOr[js.Array[ToastButton | String]] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var forwardedRef: js.UndefOr[RefObject[HTMLIonToastElement]] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isOpen: Boolean
  var key: js.UndefOr[Key] = js.undefined
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var onDidDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.undefined
  var onDidPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.undefined
  var onWillDismiss: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.undefined
  var onWillPresent: js.UndefOr[js.Function1[/* event */ CustomEvent[OverlayEventDetail[_]], Unit]] = js.undefined
  var position: js.UndefOr[top | bottom | middle] = js.undefined
  var ref: js.UndefOr[Ref[HTMLIonToastElement]] = js.undefined
  var translucent: js.UndefOr[Boolean] = js.undefined
}

object ToastOptionsReactControll {
  @scala.inline
  def apply(
    isOpen: Boolean,
    animated: js.UndefOr[Boolean] = js.undefined,
    buttons: js.Array[ToastButton | String] = null,
    color: Color = null,
    cssClass: String | js.Array[String] = null,
    duration: Int | Double = null,
    enterAnimation: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    forwardedRef: RefObject[HTMLIonToastElement] = null,
    header: String = null,
    id: String = null,
    key: Key = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leaveAnimation: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    message: String = null,
    mode: Mode = null,
    onDidDismiss: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit = null,
    onDidPresent: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit = null,
    onWillDismiss: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit = null,
    onWillPresent: /* event */ CustomEvent[OverlayEventDetail[_]] => Unit = null,
    position: top | bottom | middle = null,
    ref: Ref[HTMLIonToastElement] = null,
    translucent: js.UndefOr[Boolean] = js.undefined
  ): ToastOptionsReactControll = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(js.Any.fromFunction2(enterAnimation))
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose.asInstanceOf[js.Any])
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(js.Any.fromFunction2(leaveAnimation))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onDidDismiss != null) __obj.updateDynamic("onDidDismiss")(js.Any.fromFunction1(onDidDismiss))
    if (onDidPresent != null) __obj.updateDynamic("onDidPresent")(js.Any.fromFunction1(onDidPresent))
    if (onWillDismiss != null) __obj.updateDynamic("onWillDismiss")(js.Any.fromFunction1(onWillDismiss))
    if (onWillPresent != null) __obj.updateDynamic("onWillPresent")(js.Any.fromFunction1(onWillPresent))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptionsReactControll]
  }
}

