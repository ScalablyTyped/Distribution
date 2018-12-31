package typings
package atMaterialDashUiCoreLib.dialogDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Pick<@material-ui/core.@material-ui/core/Modal.ModalProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, std.Exclude<keyof @material-ui/core.@material-ui/core/Modal.ModalProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, 'classes' | 'children'>>, @material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/Modal.ModalProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, @material-ui/core.@material-ui/core/Dialog/Dialog.DialogClassKey, 'children'>) */ trait DialogProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[DialogClassKey] {
  var PaperProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.paperPaperMod.PaperProps]] = js.undefined
  var TransitionComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var TransitionProps: js.UndefOr[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var fullScreen: js.UndefOr[scala.Boolean] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var maxWidth: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.xs | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.sm | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.md | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.lg | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.xl | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibNumbers.`false`
  ] = js.undefined
  var scroll: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.body | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.paper
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var transitionDuration: js.UndefOr[js.Any] = js.undefined
}

