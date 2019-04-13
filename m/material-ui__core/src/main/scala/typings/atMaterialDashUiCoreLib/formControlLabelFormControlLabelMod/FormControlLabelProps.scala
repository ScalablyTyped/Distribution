package typings
package atMaterialDashUiCoreLib.formControlLabelFormControlLabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.LabelHTMLAttributes<std.HTMLLabelElement>, 'classes' | 'onChange'> ]: react.react.LabelHTMLAttributes<std.HTMLLabelElement>[P]} */ trait FormControlLabelProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[FormControlLabelClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var checked: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var control: reactLib.reactMod.ReactElement[_]
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var inputRef: js.UndefOr[reactLib.reactMod.Ref[_]] = js.undefined
  var label: reactLib.reactMod.ReactNode
  var labelPlacement: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.end | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.start | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.top | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.bottom
  ] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ChangeEvent[js.Object], 
      /* checked */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object FormControlLabelProps {
  @scala.inline
  def apply(
    control: reactLib.reactMod.ReactElement[_],
    label: reactLib.reactMod.ReactNode,
    checked: scala.Boolean | java.lang.String = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[FormControlLabelClassKey]
    ] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    inputRef: reactLib.reactMod.Ref[_] = null,
    labelPlacement: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.end | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.start | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.top | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.bottom = null,
    name: java.lang.String = null,
    onChange: (/* event */ reactLib.reactMod.ChangeEvent[js.Object], /* checked */ scala.Boolean) => scala.Unit = null,
    style: reactLib.reactMod.CSSProperties = null,
    value: java.lang.String = null
  ): FormControlLabelProps = {
    val __obj = js.Dynamic.literal(control = control, label = label.asInstanceOf[js.Any])
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FormControlLabelProps]
  }
}

