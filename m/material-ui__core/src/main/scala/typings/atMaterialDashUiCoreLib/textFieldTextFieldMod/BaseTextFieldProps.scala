package typings
package atMaterialDashUiCoreLib.textFieldTextFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/FormControl/FormControl.FormControlProps, 'classes' | 'onChange' | 'defaultValue'> ]: @material-ui/core.@material-ui/core/FormControl/FormControl.FormControlProps[P]} */ trait BaseTextFieldProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TextFieldClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var FormHelperTextProps: js.UndefOr[
    stdLib.Partial[atMaterialDashUiCoreLib.formHelperTextFormHelperTextMod.FormHelperTextProps]
  ] = js.undefined
  var InputLabelProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.inputLabelInputLabelMod.InputLabelProps]] = js.undefined
  var SelectProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.selectSelectMod.SelectProps]] = js.undefined
  var autoComplete: js.UndefOr[java.lang.String] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var helperText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inputRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_]] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var margin: js.UndefOr[atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Margin] = js.undefined
  var multiline: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    reactLib.reactMod.ReactNs.ChangeEventHandler[stdLib.HTMLInputElement | stdLib.HTMLTextAreaElement | stdLib.HTMLSelectElement]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var rows: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var rowsMax: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var select: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[
    (js.Array[java.lang.String | scala.Double | scala.Boolean]) | java.lang.String | scala.Double | scala.Boolean
  ] = js.undefined
}

object BaseTextFieldProps {
  @scala.inline
  def apply(
    FormHelperTextProps: stdLib.Partial[atMaterialDashUiCoreLib.formHelperTextFormHelperTextMod.FormHelperTextProps] = null,
    InputLabelProps: stdLib.Partial[atMaterialDashUiCoreLib.inputLabelInputLabelMod.InputLabelProps] = null,
    SelectProps: stdLib.Partial[atMaterialDashUiCoreLib.selectSelectMod.SelectProps] = null,
    autoComplete: java.lang.String = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[TextFieldClassKey]] = null,
    defaultValue: java.lang.String | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    helperText: reactLib.reactMod.ReactNs.ReactNode = null,
    id: java.lang.String = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    inputRef: reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_] = null,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    margin: atMaterialDashUiCoreLib.atMaterialDashUiCoreMod.PropTypesNs.Margin = null,
    multiline: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onChange: reactLib.reactMod.ReactNs.ChangeEventHandler[stdLib.HTMLInputElement | stdLib.HTMLTextAreaElement | stdLib.HTMLSelectElement] = null,
    placeholder: java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    rows: java.lang.String | scala.Double = null,
    rowsMax: java.lang.String | scala.Double = null,
    select: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    `type`: java.lang.String = null,
    value: (js.Array[java.lang.String | scala.Double | scala.Boolean]) | java.lang.String | scala.Double | scala.Boolean = null
  ): BaseTextFieldProps = {
    val __obj = js.Dynamic.literal()
    if (FormHelperTextProps != null) __obj.updateDynamic("FormHelperTextProps")(FormHelperTextProps)
    if (InputLabelProps != null) __obj.updateDynamic("InputLabelProps")(InputLabelProps)
    if (SelectProps != null) __obj.updateDynamic("SelectProps")(SelectProps)
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select)
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTextFieldProps]
  }
}

