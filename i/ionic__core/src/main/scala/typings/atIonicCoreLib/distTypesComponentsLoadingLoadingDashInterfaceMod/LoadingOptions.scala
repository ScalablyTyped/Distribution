package typings
package atIonicCoreLib.distTypesComponentsLoadingLoadingDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingOptions extends js.Object {
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var backdropDismiss: js.UndefOr[scala.Boolean] = js.undefined
  var cssClass: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var enterAnimation: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var keyboardClose: js.UndefOr[scala.Boolean] = js.undefined
  var leaveAnimation: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  ] = js.undefined
  var showBackdrop: js.UndefOr[scala.Boolean] = js.undefined
  var spinner: js.UndefOr[
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any) | scala.Null
  ] = js.undefined
  var translucent: js.UndefOr[scala.Boolean] = js.undefined
}

object LoadingOptions {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    backdropDismiss: js.UndefOr[scala.Boolean] = js.undefined,
    cssClass: java.lang.String | js.Array[java.lang.String] = null,
    duration: scala.Int | scala.Double = null,
    enterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    id: java.lang.String = null,
    keyboardClose: js.UndefOr[scala.Boolean] = js.undefined,
    leaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    message: java.lang.String = null,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = null,
    showBackdrop: js.UndefOr[scala.Boolean] = js.undefined,
    spinner: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any = null,
    translucent: js.UndefOr[scala.Boolean] = js.undefined
  ): LoadingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (!js.isUndefined(backdropDismiss)) __obj.updateDynamic("backdropDismiss")(backdropDismiss)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(enterAnimation)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose)
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(leaveAnimation)
    if (message != null) __obj.updateDynamic("message")(message)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(showBackdrop)) __obj.updateDynamic("showBackdrop")(showBackdrop)
    if (spinner != null) __obj.updateDynamic("spinner")(spinner)
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    __obj.asInstanceOf[LoadingOptions]
  }
}

