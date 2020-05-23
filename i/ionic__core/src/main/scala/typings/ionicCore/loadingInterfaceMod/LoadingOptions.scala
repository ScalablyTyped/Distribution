package typings.ionicCore.loadingInterfaceMod

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.Mode
import typings.ionicCore.spinnerConfigsMod.SpinnerTypes
import typings.ionicCore.typesMod.IonicSafeString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingOptions extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var message: js.UndefOr[String | IonicSafeString] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var showBackdrop: js.UndefOr[Boolean] = js.undefined
  var spinner: js.UndefOr[SpinnerTypes | Null] = js.undefined
  var translucent: js.UndefOr[Boolean] = js.undefined
}

object LoadingOptions {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    backdropDismiss: js.UndefOr[Boolean] = js.undefined,
    cssClass: String | js.Array[String] = null,
    duration: js.UndefOr[Double] = js.undefined,
    enterAnimation: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    id: String = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leaveAnimation: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    message: String | IonicSafeString = null,
    mode: Mode = null,
    showBackdrop: js.UndefOr[Boolean] = js.undefined,
    spinner: js.UndefOr[Null | SpinnerTypes] = js.undefined,
    translucent: js.UndefOr[Boolean] = js.undefined
  ): LoadingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backdropDismiss)) __obj.updateDynamic("backdropDismiss")(backdropDismiss.get.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(js.Any.fromFunction2(enterAnimation))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose.get.asInstanceOf[js.Any])
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(js.Any.fromFunction2(leaveAnimation))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(showBackdrop)) __obj.updateDynamic("showBackdrop")(showBackdrop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spinner)) __obj.updateDynamic("spinner")(spinner.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingOptions]
  }
}

