package typings
package atMaterialDashUiCoreLib.badgeBadgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement>, 'classes' | never> ]: react.react.HTMLAttributes<react.HTMLDivElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLDivElement>, @material-ui/core.@material-ui/core/Badge/Badge.BadgeClassKey, never>) */ trait BadgeProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[BadgeClassKey] {
  var badgeContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var children: reactLib.reactMod.ReactNs.ReactNode
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.error
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[BadgeProps]] = js.undefined
  var invisible: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var showZero: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.dot
  ] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    badgeContent: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[BadgeClassKey]] = null,
    color: atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.error = null,
    component: reactLib.reactMod.ReactNs.ReactType[BadgeProps] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    invisible: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    showZero: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.dot = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (badgeContent != null) __obj.updateDynamic("badgeContent")(badgeContent.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(invisible)) __obj.updateDynamic("invisible")(invisible)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (!js.isUndefined(showZero)) __obj.updateDynamic("showZero")(showZero)
    if (style != null) __obj.updateDynamic("style")(style)
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
}

