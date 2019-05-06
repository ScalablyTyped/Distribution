package typings
package atIonicCoreLib.distTypesComponentsPickerPickerDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerOptions extends js.Object {
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var backdropDismiss: js.UndefOr[scala.Boolean] = js.undefined
  var buttons: js.UndefOr[js.Array[PickerButton]] = js.undefined
  var columns: js.Array[PickerColumn]
  var cssClass: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var enterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var keyboardClose: js.UndefOr[scala.Boolean] = js.undefined
  var leaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  ] = js.undefined
}

object PickerOptions {
  @scala.inline
  def apply(
    columns: js.Array[PickerColumn],
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    backdropDismiss: js.UndefOr[scala.Boolean] = js.undefined,
    buttons: js.Array[PickerButton] = null,
    cssClass: java.lang.String | js.Array[java.lang.String] = null,
    enterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    id: java.lang.String = null,
    keyboardClose: js.UndefOr[scala.Boolean] = js.undefined,
    leaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = null
  ): PickerOptions = {
    val __obj = js.Dynamic.literal(columns = columns)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (!js.isUndefined(backdropDismiss)) __obj.updateDynamic("backdropDismiss")(backdropDismiss)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(enterAnimation)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(keyboardClose)) __obj.updateDynamic("keyboardClose")(keyboardClose)
    if (leaveAnimation != null) __obj.updateDynamic("leaveAnimation")(leaveAnimation)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[PickerOptions]
  }
}

