package typings
package atMaterialDashUiCoreLib.modalModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Pick<react.react.HtmlHTMLAttributes<react.HTMLDivElement>, std.Exclude<keyof react.react.HtmlHTMLAttributes<react.HTMLDivElement>, 'classes' | never>>, @material-ui/core.@material-ui/core.StandardProps<react.react.HtmlHTMLAttributes<react.HTMLDivElement>, @material-ui/core.@material-ui/core/Modal/Modal.ModalClassKey, never>) */ trait ModalProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ModalClassKey] {
  var BackdropComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactType[atMaterialDashUiCoreLib.backdropBackdropMod.BackdropProps]
  ] = js.undefined
  var BackdropProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.backdropBackdropMod.BackdropProps]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
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

