package typings
package atMaterialDashUiCoreLib.iconIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<std.HTMLSpanElement>, 'classes' | never> ]: react.react.HTMLAttributes<std.HTMLSpanElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<std.HTMLSpanElement>, @material-ui/core.@material-ui/core/Icon/Icon.IconClassKey, never>) */ trait IconProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[IconClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.action | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.disabled | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.error
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[IconProps]] = js.undefined
  var fontSize: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.default | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.small | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.large
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[IconClassKey]] = null,
    color: atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Color | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.action | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.disabled | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.error = null,
    component: reactLib.reactMod.ReactNs.ReactType[IconProps] = null,
    fontSize: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.default | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.small | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.large = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IconProps]
  }
}

