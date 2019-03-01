package typings
package atMaterialDashUiCoreLib.inputInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/InputBase.InputBaseProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/InputBase.InputBaseProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/InputBase.InputBaseProps, @material-ui/core.@material-ui/core/Input/Input.InputClassKey, never>) */ trait InputProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[InputClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disableUnderline: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object InputProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[InputClassKey]] = null,
    disableUnderline: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): InputProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disableUnderline)) __obj.updateDynamic("disableUnderline")(disableUnderline)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[InputProps]
  }
}

