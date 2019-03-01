package typings
package atMaterialDashUiCoreLib.dialogDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/Modal.ModalProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, 'classes' | 'children'> ]: @material-ui/core.@material-ui/core/Modal.ModalProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/Modal.ModalProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, @material-ui/core.@material-ui/core/Dialog/Dialog.DialogClassKey, 'children'>) */ trait DialogProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[DialogClassKey] {
  var PaperComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[atMaterialDashUiCoreLib.paperPaperMod.PaperProps]
  ] = js.undefined
  var PaperProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.paperPaperMod.PaperProps]] = js.undefined
  var TransitionComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps]
  ] = js.undefined
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

object DialogProps {
  @scala.inline
  def apply(
    PaperComponent: reactLib.reactMod.ReactNs.ComponentType[atMaterialDashUiCoreLib.paperPaperMod.PaperProps] = null,
    PaperProps: stdLib.Partial[atMaterialDashUiCoreLib.paperPaperMod.PaperProps] = null,
    TransitionComponent: reactLib.reactMod.ReactNs.ComponentType[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps] = null,
    TransitionProps: atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[DialogClassKey]] = null,
    fullScreen: js.UndefOr[scala.Boolean] = js.undefined,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    maxWidth: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.xs | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.sm | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.md | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.lg | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.xl | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibNumbers.`false` = null,
    scroll: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.body | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.paper = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    transitionDuration: js.Any = null
  ): DialogProps = {
    val __obj = js.Dynamic.literal()
    if (PaperComponent != null) __obj.updateDynamic("PaperComponent")(PaperComponent.asInstanceOf[js.Any])
    if (PaperProps != null) __obj.updateDynamic("PaperProps")(PaperProps)
    if (TransitionComponent != null) __obj.updateDynamic("TransitionComponent")(TransitionComponent.asInstanceOf[js.Any])
    if (TransitionProps != null) __obj.updateDynamic("TransitionProps")(TransitionProps)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration)
    __obj.asInstanceOf[DialogProps]
  }
}

