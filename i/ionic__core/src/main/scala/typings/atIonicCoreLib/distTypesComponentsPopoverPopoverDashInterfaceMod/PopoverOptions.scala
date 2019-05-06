package typings
package atIonicCoreLib.distTypesComponentsPopoverPopoverDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverOptions[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentRef */ js.Any */] extends js.Object {
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var backdropDismiss: js.UndefOr[scala.Boolean] = js.undefined
  var component: T
  var componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<T> */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<T> */ js.Any
  ] = js.undefined
  var cssClass: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var delegate: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FrameworkDelegate */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FrameworkDelegate */ js.Any
  ] = js.undefined
  var enterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  var event: js.UndefOr[stdLib.Event] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var keyboardClose: js.UndefOr[scala.Boolean] = js.undefined
  var leaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ] = js.undefined
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  ] = js.undefined
  var showBackdrop: js.UndefOr[scala.Boolean] = js.undefined
  var translucent: js.UndefOr[scala.Boolean] = js.undefined
}

object PopoverOptions {
  @scala.inline
  def apply[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentRef */ js.Any */](
    component: T,
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    backdropDismiss: js.UndefOr[scala.Boolean] = js.undefined,
    componentProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps<T> */ js.Any = null,
    cssClass: java.lang.String | js.Array[java.lang.String] = null,
    delegate: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FrameworkDelegate */ js.Any = null,
    enterAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    event: stdLib.Event = null,
    id: java.lang.String = null,
    keyboardClose: js.UndefOr[scala.Boolean] = js.undefined,
    leaveAnimation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any = null,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = null,
    showBackdrop: js.UndefOr[scala.Boolean] = js.undefined,
    translucent: js.UndefOr[scala.Boolean] = js.undefined
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

