package typings
package atMaterialDashUiCoreLib.outlinedInputOutlinedInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/InputBase/InputBase.InputBaseProps, 'classes' | never> ]: @material-ui/core.@material-ui/core/InputBase/InputBase.InputBaseProps[P]} */ trait OutlinedInputProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[OutlinedInputClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var labelWidth: scala.Double
  var notched: js.UndefOr[scala.Boolean] = js.undefined
}

object OutlinedInputProps {
  @scala.inline
  def apply(
    labelWidth: scala.Double,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[OutlinedInputClassKey]] = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    notched: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null
  ): OutlinedInputProps = {
    val __obj = js.Dynamic.literal(labelWidth = labelWidth)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(notched)) __obj.updateDynamic("notched")(notched)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[OutlinedInputProps]
  }
}

