package typings
package atIonicCoreLib.distTypesComponentsAlertAlertDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertOptions extends js.Object {
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var backdropDismiss: js.UndefOr[scala.Boolean] = js.undefined
  var buttons: js.UndefOr[js.Array[AlertButton | java.lang.String]] = js.undefined
  var cssClass: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var enterAnimation: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inputs: js.UndefOr[js.Array[AlertInput]] = js.undefined
  var keyboardClose: js.UndefOr[scala.Boolean] = js.undefined
  var leaveAnimation: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  ] = js.undefined
  var subHeader: js.UndefOr[java.lang.String] = js.undefined
  var translucent: js.UndefOr[scala.Boolean] = js.undefined
}

object AlertOptions {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    backdropDismiss: js.UndefOr[scala.Boolean] = js.undefined,
    buttons: js.Array[AlertButton | java.lang.String] = null,
    cssClass: java.lang.String | js.Array[java.lang.String] = null,
    enterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    header: java.lang.String = null,
    id: java.lang.String = null,
    inputs: js.Array[AlertInput] = null,
    keyboardClose: js.UndefOr[scala.Boolean] = js.undefined,
    leaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    message: java.lang.String = null,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = null,
    subHeader: java.lang.String = null,
    translucent: js.UndefOr[scala.Boolean] = js.undefined
  ): AlertOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (!js.isUndefined(backdropDismiss)) __obj.updateDynamic("backdropDismiss")(backdropDismiss)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(enterAnimation)
    if (header != null) __obj.updateDynamic("header")(header)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose)
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(leaveAnimation)
    if (message != null) __obj.updateDynamic("message")(message)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (subHeader != null) __obj.updateDynamic("subHeader")(subHeader)
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    __obj.asInstanceOf[AlertOptions]
  }
}

