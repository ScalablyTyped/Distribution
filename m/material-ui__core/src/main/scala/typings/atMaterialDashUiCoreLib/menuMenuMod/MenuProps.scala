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

object MenuProps {
  @scala.inline
  def apply(
    MenuListProps: stdLib.Partial[atMaterialDashUiCoreLib.menulistMenuListMod.MenuListProps] = null,
    PaperProps: stdLib.Partial[atMaterialDashUiCoreLib.paperPaperMod.PaperProps] = null,
    PopoverClasses: stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[atMaterialDashUiCoreLib.popoverPopoverMod.PopoverClassKey]
    ] = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[MenuClassKey]] = null,
    disableAutoFocusItem: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    transitionDuration: js.Any | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (MenuListProps != null) __obj.updateDynamic("MenuListProps")(MenuListProps)
    if (PaperProps != null) __obj.updateDynamic("PaperProps")(PaperProps)
    if (PopoverClasses != null) __obj.updateDynamic("PopoverClasses")(PopoverClasses)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disableAutoFocusItem)) __obj.updateDynamic("disableAutoFocusItem")(disableAutoFocusItem)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

