package typings
package atMaterialDashUiCoreLib.nativeSelectNativeSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/Input/Input.InputProps, 'classes' | 'value' | 'onChange'> ]: @material-ui/core.@material-ui/core/Input/Input.InputProps[P]}
- Dropped {[ P in 'onChange' ]: @material-ui/core.@material-ui/core/NativeSelect/NativeSelectInput.NativeSelectInputProps[P]} */ trait NativeSelectProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[NativeSelectClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var IconComponent: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var input: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var value: js.UndefOr[
    (js.Array[java.lang.String | scala.Double | scala.Boolean]) | java.lang.String | scala.Double | scala.Boolean
  ] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled
  ] = js.undefined
}

object NativeSelectProps {
  @scala.inline
  def apply(
    IconComponent: reactLib.reactMod.ReactType[_] = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[NativeSelectClassKey]] = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    input: reactLib.reactMod.ReactNode = null,
    style: reactLib.reactMod.CSSProperties = null,
    value: (js.Array[java.lang.String | scala.Double | scala.Boolean]) | java.lang.String | scala.Double | scala.Boolean = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.standard | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.outlined | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.filled = null
  ): NativeSelectProps = {
    val __obj = js.Dynamic.literal()
    if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeSelectProps]
  }
}

