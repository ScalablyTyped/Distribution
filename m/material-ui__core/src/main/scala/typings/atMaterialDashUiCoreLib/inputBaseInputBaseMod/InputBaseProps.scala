package typings
package atMaterialDashUiCoreLib.inputBaseInputBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<std.HTMLDivElement>, 'classes' | 'onChange' | 'onKeyUp' | 'onKeyDown' | 'defaultValue'> ]: react.react.HTMLAttributes<std.HTMLDivElement>[P]} */ trait InputBaseProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[InputBaseClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var autoComplete: js.UndefOr[java.lang.String] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var defaultValue: js.UndefOr[
    (js.Array[java.lang.String | scala.Double | scala.Boolean | js.Object]) | java.lang.String | scala.Double | scala.Boolean | js.Object
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var endAdornment: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inputComponent: js.UndefOr[reactLib.reactMod.ReactType[InputBaseComponentProps]] = js.undefined
  var inputProps: js.UndefOr[InputBaseComponentProps] = js.undefined
  var inputRef: js.UndefOr[reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_]] = js.undefined
  var margin: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.dense | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.none
  ] = js.undefined
  var multiline: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * `onChange`, `onKeyUp` + `onKeyDown` are applied to the inner `InputComponent`,
    * which by default is an input or textarea. Since these handlers differ from the
    * ones inherited by `React.HTMLAttributes<HTMLDivElement>` we need to omit them.
    *
    * Note that  `blur` and `focus` event handler are applied to the outer `<div>`.
    * So these can just be inherited from the native `<div>`.
    */
  var onChange: js.UndefOr[
    reactLib.reactMod.ChangeEventHandler[stdLib.HTMLTextAreaElement | stdLib.HTMLInputElement]
  ] = js.undefined
  var onFilled: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onKeyDown: js.UndefOr[
    reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLTextAreaElement | stdLib.HTMLInputElement]
  ] = js.undefined
  var onKeyUp: js.UndefOr[
    reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLTextAreaElement | stdLib.HTMLInputElement]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var renderPrefix: js.UndefOr[
    js.Function1[/* state */ atMaterialDashUiCoreLib.Anon_Dense, reactLib.reactMod.ReactNode]
  ] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var rows: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var rowsMax: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var startAdornment: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[
    (js.Array[java.lang.String | scala.Double | scala.Boolean | js.Object]) | java.lang.String | scala.Double | scala.Boolean | js.Object
  ] = js.undefined
}

object InputBaseProps {
  @scala.inline
  def apply(
    autoComplete: java.lang.String = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[InputBaseClassKey]] = null,
    defaultValue: (js.Array[java.lang.String | scala.Double | scala.Boolean | js.Object]) | java.lang.String | scala.Double | scala.Boolean | js.Object = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    endAdornment: reactLib.reactMod.ReactNode = null,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    inputComponent: reactLib.reactMod.ReactType[InputBaseComponentProps] = null,
    inputProps: InputBaseComponentProps = null,
    inputRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    margin: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.dense | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.none = null,
    multiline: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onChange: reactLib.reactMod.ChangeEventHandler[stdLib.HTMLTextAreaElement | stdLib.HTMLInputElement] = null,
    onFilled: () => scala.Unit = null,
    onKeyDown: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLTextAreaElement | stdLib.HTMLInputElement] = null,
    onKeyUp: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLTextAreaElement | stdLib.HTMLInputElement] = null,
    placeholder: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    renderPrefix: /* state */ atMaterialDashUiCoreLib.Anon_Dense => reactLib.reactMod.ReactNode = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    rows: java.lang.String | scala.Double = null,
    rowsMax: java.lang.String | scala.Double = null,
    startAdornment: reactLib.reactMod.ReactNode = null,
    style: reactLib.reactMod.CSSProperties = null,
    `type`: java.lang.String = null,
    value: (js.Array[java.lang.String | scala.Double | scala.Boolean | js.Object]) | java.lang.String | scala.Double | scala.Boolean | js.Object = null
  ): InputBaseProps = {
    val __obj = js.Dynamic.literal()
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (endAdornment != null) __obj.updateDynamic("endAdornment")(endAdornment.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (id != null) __obj.updateDynamic("id")(id)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (inputComponent != null) __obj.updateDynamic("inputComponent")(inputComponent.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onFilled != null) __obj.updateDynamic("onFilled")(js.Any.fromFunction0(onFilled))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (renderPrefix != null) __obj.updateDynamic("renderPrefix")(js.Any.fromFunction1(renderPrefix))
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsMax != null) __obj.updateDynamic("rowsMax")(rowsMax.asInstanceOf[js.Any])
    if (startAdornment != null) __obj.updateDynamic("startAdornment")(startAdornment.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputBaseProps]
  }
}

