package typings
package atMaterialDashUiCoreLib.chipChipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<std.HTMLDivElement>, 'classes' | never> ]: react.react.HTMLAttributes<std.HTMLDivElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<std.HTMLDivElement>, @material-ui/core.@material-ui/core/Chip/Chip.ChipClassKey, never>) */ trait ChipProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ChipClassKey] {
  var avatar: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[ChipProps]] = js.undefined
  var deleteIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var onDelete: js.UndefOr[reactLib.reactMod.ReactNs.EventHandler[_]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.default | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined
  ] = js.undefined
}

object ChipProps {
  @scala.inline
  def apply(
    avatar: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[ChipClassKey]] = null,
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    color: atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color = null,
    component: reactLib.reactMod.ReactNs.ReactType[ChipProps] = null,
    deleteIcon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    icon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    onDelete: reactLib.reactMod.ReactNs.EventHandler[_] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.default | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined = null
  ): ChipProps = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (color != null) __obj.updateDynamic("color")(color)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (deleteIcon != null) __obj.updateDynamic("deleteIcon")(deleteIcon)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete)
    if (style != null) __obj.updateDynamic("style")(style)
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChipProps]
  }
}

