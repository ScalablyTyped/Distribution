package typings
package atMaterialDashUiCoreLib.inputbaseInputBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Pick, @material-ui/core.@material-ui/core.StandardProps) */ 
trait InputBaseProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[InputBaseClassKey] {
  var autoComplete: js.UndefOr[java.lang.String] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var disableUnderline: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var endAdornment: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inputComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[InputBaseComponentProps]] = js.undefined
  var inputProps: js.UndefOr[InputBaseComponentProps] = js.undefined
  var inputRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[_] | reactLib.reactMod.ReactNs.RefObject[_]] = js.undefined
  var margin: js.UndefOr[atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.dense] = js.undefined
  var multiline: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
     * `onChange`, `onKeyUp` + `onKeyDown` are applied to the inner `InputComponent`,
     * which by default is an input or textarea. Since these handlers differ from the
     * ones inherited by `React.HTMLAttributes<HTMLDivElement>` we need to omit them.
     *
     * Note that  `blur` and `focus` event handler are applied to the outter `<div>`.
     * So these can just be inherited from the native `<div>`.
     */
  var onChange: js.UndefOr[
    reactLib.reactMod.ReactNs.ChangeEventHandler[reactLib.HTMLTextAreaElement | reactLib.HTMLInputElement]
  ] = js.undefined
  var onKeyDown: js.UndefOr[
    reactLib.reactMod.ReactNs.KeyboardEventHandler[reactLib.HTMLTextAreaElement | reactLib.HTMLInputElement]
  ] = js.undefined
  var onKeyUp: js.UndefOr[
    reactLib.reactMod.ReactNs.KeyboardEventHandler[reactLib.HTMLTextAreaElement | reactLib.HTMLInputElement]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var rows: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var rowsMax: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var startAdornment: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[
    (js.Array[java.lang.String | scala.Double | scala.Boolean]) | java.lang.String | scala.Double | scala.Boolean
  ] = js.undefined
}

