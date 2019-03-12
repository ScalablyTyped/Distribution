package typings
package atMaterialDashUiCoreLib.listItemListItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps & react.react.LiHTMLAttributes<std.HTMLElement>, 'classes' | 'component'> ]: @material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps & react.react.LiHTMLAttributes<std.HTMLElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/ButtonBase.ButtonBaseProps & react.react.LiHTMLAttributes<std.HTMLElement>, @material-ui/core.@material-ui/core/ListItem/ListItem.ListItemClassKey, 'component'>) */ trait ListItemProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ListItemClassKey] {
  var ContainerComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactType[reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLDivElement]]
  ] = js.undefined
  var ContainerProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLDivElement]] = js.undefined
  var alignItems: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`flex-start` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.center
  ] = js.undefined
  var button: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[ListItemProps]] = js.undefined
  var dense: js.UndefOr[scala.Boolean] = js.undefined
  var disableGutters: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var divider: js.UndefOr[scala.Boolean] = js.undefined
  var focusVisibleClassName: js.UndefOr[java.lang.String] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    ContainerComponent: reactLib.reactMod.ReactNs.ReactType[reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLDivElement]] = null,
    ContainerProps: reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLDivElement] = null,
    alignItems: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.`flex-start` | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.center = null,
    button: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[ListItemClassKey]] = null,
    component: reactLib.reactMod.ReactNs.ReactType[ListItemProps] = null,
    dense: js.UndefOr[scala.Boolean] = js.undefined,
    disableGutters: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    divider: js.UndefOr[scala.Boolean] = js.undefined,
    focusVisibleClassName: java.lang.String = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    if (ContainerComponent != null) __obj.updateDynamic("ContainerComponent")(ContainerComponent.asInstanceOf[js.Any])
    if (ContainerProps != null) __obj.updateDynamic("ContainerProps")(ContainerProps)
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(dense)) __obj.updateDynamic("dense")(dense)
    if (!js.isUndefined(disableGutters)) __obj.updateDynamic("disableGutters")(disableGutters)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider)
    if (focusVisibleClassName != null) __obj.updateDynamic("focusVisibleClassName")(focusVisibleClassName)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ListItemProps]
  }
}

