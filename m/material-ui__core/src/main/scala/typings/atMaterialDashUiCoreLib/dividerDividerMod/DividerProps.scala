package typings
package atMaterialDashUiCoreLib.dividerDividerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.HTMLAttributes<std.HTMLHRElement>, 'classes' | never> ]: react.react.React.HTMLAttributes<std.HTMLHRElement>[P]} */ trait DividerProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[DividerClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var absolute: js.UndefOr[scala.Boolean] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[DividerProps]] = js.undefined
  var inset: js.UndefOr[scala.Boolean] = js.undefined
  var light: js.UndefOr[scala.Boolean] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.fullWidth | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inset | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.middle
  ] = js.undefined
}

object DividerProps {
  @scala.inline
  def apply(
    absolute: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[DividerClassKey]] = null,
    component: reactLib.reactMod.ReactNs.ReactType[DividerProps] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    inset: js.UndefOr[scala.Boolean] = js.undefined,
    light: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.fullWidth | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inset | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.middle = null
  ): DividerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset)
    if (!js.isUndefined(light)) __obj.updateDynamic("light")(light)
    if (style != null) __obj.updateDynamic("style")(style)
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[DividerProps]
  }
}

