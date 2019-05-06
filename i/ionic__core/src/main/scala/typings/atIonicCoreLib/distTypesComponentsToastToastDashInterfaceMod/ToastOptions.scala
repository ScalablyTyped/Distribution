package typings
package atIonicCoreLib.distTypesComponentsToastToastDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOptions extends js.Object {
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var buttons: js.UndefOr[js.Array[ToastButton | java.lang.String]] = js.undefined
  var closeButtonText: js.UndefOr[java.lang.String] = js.undefined
  var color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  var cssClass: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var enterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var keyboardClose: js.UndefOr[scala.Boolean] = js.undefined
  var leaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  ] = js.undefined
  var position: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.top | atIonicCoreLib.atIonicCoreLibStrings.bottom | atIonicCoreLib.atIonicCoreLibStrings.middle
  ] = js.undefined
  var showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  var translucent: js.UndefOr[scala.Boolean] = js.undefined
}

object ToastOptions {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    buttons: js.Array[ToastButton | java.lang.String] = null,
    closeButtonText: java.lang.String = null,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    cssClass: java.lang.String | js.Array[java.lang.String] = null,
    duration: scala.Int | scala.Double = null,
    enterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    header: java.lang.String = null,
    id: java.lang.String = null,
    keyboardClose: js.UndefOr[scala.Boolean] = js.undefined,
    leaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    message: java.lang.String = null,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = null,
    position: atIonicCoreLib.atIonicCoreLibStrings.top | atIonicCoreLib.atIonicCoreLibStrings.bottom | atIonicCoreLib.atIonicCoreLibStrings.middle = null,
    showCloseButton: js.UndefOr[scala.Boolean] = js.undefined,
    translucent: js.UndefOr[scala.Boolean] = js.undefined
  ): ToastOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (closeButtonText != null) __obj.updateDynamic("closeButtonText")(closeButtonText)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(enterAnimation)
    if (header != null) __obj.updateDynamic("header")(header)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose)
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(leaveAnimation)
    if (message != null) __obj.updateDynamic("message")(message)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    __obj.asInstanceOf[ToastOptions]
  }
}

