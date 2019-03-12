package typings
package atMaterialDashUiCoreLib.popoverPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/Modal.ModalProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, 'classes' | 'children'> ]: @material-ui/core.@material-ui/core/Modal.ModalProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/Modal.ModalProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, @material-ui/core.@material-ui/core/Popover/Popover.PopoverClassKey, 'children'>) */ trait PopoverProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[PopoverClassKey] {
  var ModalClasses: js.UndefOr[
    stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[atMaterialDashUiCoreLib.modalModalMod.ModalClassKey]
    ]
  ] = js.undefined
  var PaperProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.paperPaperMod.PaperProps]] = js.undefined
  var TransitionComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps]
  ] = js.undefined
  var TransitionProps: js.UndefOr[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps] = js.undefined
  var action: js.UndefOr[js.Function1[/* actions */ PopoverActions, scala.Unit]] = js.undefined
  var anchorEl: js.UndefOr[
    scala.Null | stdLib.HTMLElement | (js.Function1[/* element */ stdLib.HTMLElement, stdLib.HTMLElement])
  ] = js.undefined
  var anchorOrigin: js.UndefOr[PopoverOrigin] = js.undefined
  var anchorPosition: js.UndefOr[PopoverPosition] = js.undefined
  var anchorReference: js.UndefOr[PopoverReference] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var elevation: js.UndefOr[scala.Double] = js.undefined
  var getContentAnchorEl: js.UndefOr[
    scala.Null | (js.Function1[/* element */ stdLib.HTMLElement, stdLib.HTMLElement])
  ] = js.undefined
  var marginThreshold: js.UndefOr[scala.Double] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var transformOrigin: js.UndefOr[PopoverOrigin] = js.undefined
  var transitionDuration: js.UndefOr[js.Any | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    ModalClasses: stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[atMaterialDashUiCoreLib.modalModalMod.ModalClassKey]
    ] = null,
    PaperProps: stdLib.Partial[atMaterialDashUiCoreLib.paperPaperMod.PaperProps] = null,
    TransitionComponent: reactLib.reactMod.ReactNs.ComponentType[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps] = null,
    TransitionProps: atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps = null,
    action: /* actions */ PopoverActions => scala.Unit = null,
    anchorEl: stdLib.HTMLElement | (js.Function1[/* element */ stdLib.HTMLElement, stdLib.HTMLElement]) = null,
    anchorOrigin: PopoverOrigin = null,
    anchorPosition: PopoverPosition = null,
    anchorReference: PopoverReference = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[PopoverClassKey]] = null,
    elevation: scala.Int | scala.Double = null,
    getContentAnchorEl: /* element */ stdLib.HTMLElement => stdLib.HTMLElement = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    marginThreshold: scala.Int | scala.Double = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    role: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    transformOrigin: PopoverOrigin = null,
    transitionDuration: js.Any | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto = null
  ): PopoverProps = {
    val __obj = js.Dynamic.literal()
    if (ModalClasses != null) __obj.updateDynamic("ModalClasses")(ModalClasses)
    if (PaperProps != null) __obj.updateDynamic("PaperProps")(PaperProps)
    if (TransitionComponent != null) __obj.updateDynamic("TransitionComponent")(TransitionComponent.asInstanceOf[js.Any])
    if (TransitionProps != null) __obj.updateDynamic("TransitionProps")(TransitionProps)
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1(action))
    if (anchorEl != null) __obj.updateDynamic("anchorEl")(anchorEl.asInstanceOf[js.Any])
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin)
    if (anchorPosition != null) __obj.updateDynamic("anchorPosition")(anchorPosition)
    if (anchorReference != null) __obj.updateDynamic("anchorReference")(anchorReference)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (getContentAnchorEl != null) __obj.updateDynamic("getContentAnchorEl")(js.Any.fromFunction1(getContentAnchorEl))
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (marginThreshold != null) __obj.updateDynamic("marginThreshold")(marginThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (role != null) __obj.updateDynamic("role")(role)
    if (style != null) __obj.updateDynamic("style")(style)
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
}

