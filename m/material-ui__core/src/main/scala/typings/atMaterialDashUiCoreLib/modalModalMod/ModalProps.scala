package typings
package atMaterialDashUiCoreLib.modalModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HtmlHTMLAttributes<react.HTMLDivElement>, 'classes' | never> ]: react.react.HtmlHTMLAttributes<react.HTMLDivElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HtmlHTMLAttributes<react.HTMLDivElement>, @material-ui/core.@material-ui/core/Modal/Modal.ModalClassKey, never>) */ trait ModalProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ModalClassKey] {
  var BackdropComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactType[atMaterialDashUiCoreLib.backdropBackdropMod.BackdropProps]
  ] = js.undefined
  var BackdropProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.backdropBackdropMod.BackdropProps]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var closeAfterTransition: js.UndefOr[scala.Boolean] = js.undefined
  var container: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactInstance | js.Function0[reactLib.reactMod.ReactNs.ReactInstance] | scala.Null
  ] = js.undefined
  var disableAutoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var disableBackdropClick: js.UndefOr[scala.Boolean] = js.undefined
  var disableEnforceFocus: js.UndefOr[scala.Boolean] = js.undefined
  var disableEscapeKeyDown: js.UndefOr[scala.Boolean] = js.undefined
  var disablePortal: js.UndefOr[scala.Boolean] = js.undefined
  var disableRestoreFocus: js.UndefOr[scala.Boolean] = js.undefined
  var hideBackdrop: js.UndefOr[scala.Boolean] = js.undefined
  var keepMounted: js.UndefOr[scala.Boolean] = js.undefined
  var manager: js.UndefOr[atMaterialDashUiCoreLib.modalModalManagerMod.ModalManager] = js.undefined
  var onBackdropClick: js.UndefOr[reactLib.reactMod.ReactNs.ReactEventHandler[js.Object]] = js.undefined
  var onClose: js.UndefOr[reactLib.reactMod.ReactNs.ReactEventHandler[js.Object]] = js.undefined
  var onEscapeKeyDown: js.UndefOr[reactLib.reactMod.ReactNs.ReactEventHandler[js.Object]] = js.undefined
  var onRendered: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var open: scala.Boolean
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    open: scala.Boolean,
    BackdropComponent: reactLib.reactMod.ReactNs.ReactType[atMaterialDashUiCoreLib.backdropBackdropMod.BackdropProps] = null,
    BackdropProps: stdLib.Partial[atMaterialDashUiCoreLib.backdropBackdropMod.BackdropProps] = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[ModalClassKey]] = null,
    closeAfterTransition: js.UndefOr[scala.Boolean] = js.undefined,
    container: reactLib.reactMod.ReactNs.ReactInstance | js.Function0[reactLib.reactMod.ReactNs.ReactInstance] = null,
    disableAutoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    disableBackdropClick: js.UndefOr[scala.Boolean] = js.undefined,
    disableEnforceFocus: js.UndefOr[scala.Boolean] = js.undefined,
    disableEscapeKeyDown: js.UndefOr[scala.Boolean] = js.undefined,
    disablePortal: js.UndefOr[scala.Boolean] = js.undefined,
    disableRestoreFocus: js.UndefOr[scala.Boolean] = js.undefined,
    hideBackdrop: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    keepMounted: js.UndefOr[scala.Boolean] = js.undefined,
    manager: atMaterialDashUiCoreLib.modalModalManagerMod.ModalManager = null,
    onBackdropClick: reactLib.reactMod.ReactNs.ReactEventHandler[js.Object] = null,
    onClose: reactLib.reactMod.ReactNs.ReactEventHandler[js.Object] = null,
    onEscapeKeyDown: reactLib.reactMod.ReactNs.ReactEventHandler[js.Object] = null,
    onRendered: js.Function0[scala.Unit] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal(open = open)
    if (BackdropComponent != null) __obj.updateDynamic("BackdropComponent")(BackdropComponent.asInstanceOf[js.Any])
    if (BackdropProps != null) __obj.updateDynamic("BackdropProps")(BackdropProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(closeAfterTransition)) __obj.updateDynamic("closeAfterTransition")(closeAfterTransition)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAutoFocus)) __obj.updateDynamic("disableAutoFocus")(disableAutoFocus)
    if (!js.isUndefined(disableBackdropClick)) __obj.updateDynamic("disableBackdropClick")(disableBackdropClick)
    if (!js.isUndefined(disableEnforceFocus)) __obj.updateDynamic("disableEnforceFocus")(disableEnforceFocus)
    if (!js.isUndefined(disableEscapeKeyDown)) __obj.updateDynamic("disableEscapeKeyDown")(disableEscapeKeyDown)
    if (!js.isUndefined(disablePortal)) __obj.updateDynamic("disablePortal")(disablePortal)
    if (!js.isUndefined(disableRestoreFocus)) __obj.updateDynamic("disableRestoreFocus")(disableRestoreFocus)
    if (!js.isUndefined(hideBackdrop)) __obj.updateDynamic("hideBackdrop")(hideBackdrop)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(keepMounted)) __obj.updateDynamic("keepMounted")(keepMounted)
    if (manager != null) __obj.updateDynamic("manager")(manager)
    if (onBackdropClick != null) __obj.updateDynamic("onBackdropClick")(onBackdropClick)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onEscapeKeyDown != null) __obj.updateDynamic("onEscapeKeyDown")(onEscapeKeyDown)
    if (onRendered != null) __obj.updateDynamic("onRendered")(onRendered)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ModalProps]
  }
}

