package typings
package atMaterialDashUiCoreLib.filledInputFilledInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/InputBase/InputBase.InputBaseProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/InputBase/InputBase.InputBaseProps[P]} */ trait FilledInputProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[FilledInputClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var disableUnderline: js.UndefOr[scala.Boolean] = js.undefined
}

object FilledInputProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[FilledInputClassKey]] = null,
    disableUnderline: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): FilledInputProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disableUnderline)) __obj.updateDynamic("disableUnderline")(disableUnderline)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[FilledInputProps]
  }
}

