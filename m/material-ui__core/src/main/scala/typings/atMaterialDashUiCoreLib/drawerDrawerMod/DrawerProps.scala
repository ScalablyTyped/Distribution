package typings
package atMaterialDashUiCoreLib.drawerDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/Modal.ModalProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, 'classes' | 'open' | 'children'> ]: @material-ui/core.@material-ui/core/Modal.ModalProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/Modal.ModalProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, @material-ui/core.@material-ui/core/Drawer/Drawer.DrawerClassKey, 'open' | 'children'>) */ trait DrawerProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[DrawerClassKey] {
  var ModalProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.modalModalMod.ModalProps]] = js.undefined
  var PaperProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.paperPaperMod.PaperProps]] = js.undefined
  var SlideProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.slideSlideMod.SlideProps]] = js.undefined
  var anchor: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.left | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.top | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.right | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.bottom
  ] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var elevation: js.UndefOr[scala.Double] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var theme: js.UndefOr[atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme] = js.undefined
  var transitionDuration: js.UndefOr[js.Any] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.permanent | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.persistent | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.temporary
  ] = js.undefined
}

object DrawerProps {
  @scala.inline
  def apply(
    ModalProps: stdLib.Partial[atMaterialDashUiCoreLib.modalModalMod.ModalProps] = null,
    PaperProps: stdLib.Partial[atMaterialDashUiCoreLib.paperPaperMod.PaperProps] = null,
    SlideProps: stdLib.Partial[atMaterialDashUiCoreLib.slideSlideMod.SlideProps] = null,
    anchor: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.left | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.top | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.right | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.bottom = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[DrawerClassKey]] = null,
    elevation: scala.Int | scala.Double = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    theme: atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme = null,
    transitionDuration: js.Any = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.permanent | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.persistent | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.temporary = null
  ): DrawerProps = {
    val __obj = js.Dynamic.literal()
    if (ModalProps != null) __obj.updateDynamic("ModalProps")(ModalProps)
    if (PaperProps != null) __obj.updateDynamic("PaperProps")(PaperProps)
    if (SlideProps != null) __obj.updateDynamic("SlideProps")(SlideProps)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration)
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerProps]
  }
}

