package typings
package atMaterialDashUiCoreLib.textfieldTextFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Pick<@material-ui/core.@material-ui/core/FormControl.FormControlProps, std.Exclude<keyof @material-ui/core.@material-ui/core/FormControl.FormControlProps, 'classes' | 'onChange' | 'defaultValue'>>, @material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/FormControl.FormControlProps, @material-ui/core.@material-ui/core/TextField/TextField.TextFieldClassKey, 'onChange' | 'defaultValue'>) */ trait BaseTextFieldProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TextFieldClassKey] {
  var FormHelperTextProps: js.UndefOr[
    stdLib.Partial[atMaterialDashUiCoreLib.formhelpertextFormHelperTextMod.FormHelperTextProps]
  ] = js.undefined
  var InputLabelProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.inputlabelInputLabelMod.InputLabelProps]] = js.undefined
  var SelectProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.selectSelectMod.SelectProps]] = js.undefined
  var autoComplete: js.UndefOr[java.lang.String] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var helperText: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inputRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_]] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var margin: js.UndefOr[atMaterialDashUiCoreLib.coreMod.PropTypesNs.Margin] = js.undefined
  var multiline: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    reactLib.reactMod.ReactNs.ChangeEventHandler[
      reactLib.HTMLInputElement | reactLib.HTMLTextAreaElement | reactLib.HTMLSelectElement
    ]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var rows: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var rowsMax: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var select: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[
    (js.Array[java.lang.String | scala.Double | scala.Boolean]) | java.lang.String | scala.Double | scala.Boolean
  ] = js.undefined
}

