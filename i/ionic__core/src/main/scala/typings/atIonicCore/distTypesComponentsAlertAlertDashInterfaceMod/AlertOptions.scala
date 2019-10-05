package typings.atIonicCore.distTypesComponentsAlertAlertDashInterfaceMod

import typings.atIonicCore.distTypesInterfaceMod.Mode
import typings.atIonicCore.distTypesUtilsAnimationOldDashAnimationAnimationDashInterfaceMod.Animation
import typings.atIonicCore.distTypesUtilsAnimationOldDashAnimationAnimationDashInterfaceMod.AnimationBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertOptions extends js.Object {
  var animated: js.UndefOr[Boolean] = js.undefined
  var backdropDismiss: js.UndefOr[Boolean] = js.undefined
  var buttons: js.UndefOr[js.Array[AlertButton | String]] = js.undefined
  var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inputs: js.UndefOr[js.Array[AlertInput]] = js.undefined
  var keyboardClose: js.UndefOr[Boolean] = js.undefined
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
  var subHeader: js.UndefOr[String] = js.undefined
  var translucent: js.UndefOr[Boolean] = js.undefined
}

object AlertOptions {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    backdropDismiss: js.UndefOr[Boolean] = js.undefined,
    buttons: js.Array[AlertButton | String] = null,
    cssClass: String | js.Array[String] = null,
    enterAnimation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation] = null,
    header: String = null,
    id: String = null,
    inputs: js.Array[AlertInput] = null,
    keyboardClose: js.UndefOr[Boolean] = js.undefined,
    leaveAnimation: (/* Animation */ Animation, /* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => js.Promise[Animation] = null,
    message: String = null,
    mode: Mode = null,
    subHeader: String = null,
    translucent: js.UndefOr[Boolean] = js.undefined
  ): AlertOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (!js.isUndefined(backdropDismiss)) __obj.updateDynamic("backdropDismiss")(backdropDismiss)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(js.Any.fromFunction3(enterAnimation))
    if (header != null) __obj.updateDynamic("header")(header)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose)
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(js.Any.fromFunction3(leaveAnimation))
    if (message != null) __obj.updateDynamic("message")(message)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (subHeader != null) __obj.updateDynamic("subHeader")(subHeader)
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    __obj.asInstanceOf[AlertOptions]
  }
}

