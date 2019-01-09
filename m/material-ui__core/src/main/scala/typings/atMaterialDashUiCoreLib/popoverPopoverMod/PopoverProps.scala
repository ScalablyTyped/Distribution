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
  var TransitionComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var TransitionProps: js.UndefOr[atMaterialDashUiCoreLib.transitionsTransitionMod.TransitionProps] = js.undefined
  var action: js.UndefOr[js.Function1[/* actions */ PopoverActions, scala.Unit]] = js.undefined
  var anchorEl: js.UndefOr[
    scala.Null | reactLib.HTMLElement | (js.Function1[/* element */ reactLib.HTMLElement, reactLib.HTMLElement])
  ] = js.undefined
  var anchorOrigin: js.UndefOr[PopoverOrigin] = js.undefined
  var anchorPosition: js.UndefOr[PopoverPosition] = js.undefined
  var anchorReference: js.UndefOr[PopoverReference] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var elevation: js.UndefOr[scala.Double] = js.undefined
  var getContentAnchorEl: js.UndefOr[
    scala.Null | (js.Function1[/* element */ reactLib.HTMLElement, reactLib.HTMLElement])
  ] = js.undefined
  var marginThreshold: js.UndefOr[scala.Double] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var transformOrigin: js.UndefOr[PopoverOrigin] = js.undefined
  var transitionDuration: js.UndefOr[js.Any | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto] = js.undefined
}

