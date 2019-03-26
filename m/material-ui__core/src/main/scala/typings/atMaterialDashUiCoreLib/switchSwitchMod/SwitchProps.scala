package typings
package atMaterialDashUiCoreLib.switchSwitchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseProps, 'classes' | 'checkedIcon' | 'color' | 'icon'> ]: @material-ui/core.@material-ui/core/internal/SwitchBase.SwitchBaseProps[P]} */ trait SwitchProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[SwitchClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var checkedIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var color: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.default
  ] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object SwitchProps {
  @scala.inline
  def apply(
    checkedIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[SwitchClassKey]] = null,
    color: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.primary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.secondary | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.default = null,
    icon: reactLib.reactMod.ReactNs.ReactNode = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): SwitchProps = {
    val __obj = js.Dynamic.literal()
    if (checkedIcon != null) __obj.updateDynamic("checkedIcon")(checkedIcon.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SwitchProps]
  }
}

