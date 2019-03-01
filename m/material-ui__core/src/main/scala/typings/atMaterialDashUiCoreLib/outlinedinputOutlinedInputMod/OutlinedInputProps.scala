package typings
package atMaterialDashUiCoreLib.outlinedinputOutlinedInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/InputBase.InputBaseProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/InputBase.InputBaseProps[P]}
- Lifted 2 members from Set(@material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/InputBase.InputBaseProps, @material-ui/core.@material-ui/core/OutlinedInput/OutlinedInput.OutlinedInputClassKey, never>) */ trait OutlinedInputProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[OutlinedInputClassKey] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var labelWidth: scala.Double
  var notched: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object OutlinedInputProps {
  @scala.inline
  def apply(
    labelWidth: scala.Double,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[OutlinedInputClassKey]] = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    notched: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): OutlinedInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("labelWidth")(labelWidth)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(notched)) __obj.updateDynamic("notched")(notched)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[OutlinedInputProps]
  }
}

