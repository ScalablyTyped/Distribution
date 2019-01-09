package typings
package atMaterialDashUiCoreLib.menuMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/Popover.PopoverProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, 'classes' | never> ]: @material-ui/core.@material-ui/core/Popover.PopoverProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/Popover.PopoverProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, @material-ui/core.@material-ui/core/Menu/Menu.MenuClassKey, never>) */ trait MenuProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[MenuClassKey] {
  var MenuListProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.menulistMenuListMod.MenuListProps]] = js.undefined
  var PaperProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.paperPaperMod.PaperProps]] = js.undefined
  var PopoverClasses: js.UndefOr[
    stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[atMaterialDashUiCoreLib.popoverPopoverMod.PopoverClassKey]
    ]
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disableAutoFocusItem: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var transitionDuration: js.UndefOr[js.Any | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto] = js.undefined
}

