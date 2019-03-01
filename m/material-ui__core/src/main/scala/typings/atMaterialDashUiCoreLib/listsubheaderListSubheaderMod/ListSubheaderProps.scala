package typings
package atMaterialDashUiCoreLib.listsubheaderListSubheaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.HTMLDivElement>, 'classes' | never> ]: react.react.HTMLAttributes<react.HTMLDivElement>[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<react.react.HTMLAttributes<react.HTMLDivElement>, @material-ui/core.@material-ui/core/ListSubheader/ListSubheader.ListSubheaderClassKey, never>) */ trait ListSubheaderProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[ListSubheaderClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.default | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[ListSubheaderProps]] = js.undefined
  var disableGutters: js.UndefOr[scala.Boolean] = js.undefined
  var disableSticky: js.UndefOr[scala.Boolean] = js.undefined
  var inset: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object ListSubheaderProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[ListSubheaderClassKey]] = null,
    color: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.default | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit = null,
    component: reactLib.reactMod.ReactNs.ReactType[ListSubheaderProps] = null,
    disableGutters: js.UndefOr[scala.Boolean] = js.undefined,
    disableSticky: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    inset: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): ListSubheaderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(disableGutters)) __obj.updateDynamic("disableGutters")(disableGutters)
    if (!js.isUndefined(disableSticky)) __obj.updateDynamic("disableSticky")(disableSticky)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ListSubheaderProps]
  }
}

