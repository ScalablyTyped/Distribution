package typings
package atMaterialDashUiCoreLib.internalSwitchBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/IconButton/IconButton.IconButtonProps, 'classes' | 'onChange' | 'value'> ]: @material-ui/core.@material-ui/core/IconButton/IconButton.IconButtonProps[P]} */ trait SwitchBaseProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[SwitchBaseClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var checked: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var checkedIcon: reactLib.reactMod.ReactNode
  var defaultChecked: js.UndefOr[scala.Boolean] = js.undefined
  var disableRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var icon: reactLib.reactMod.ReactNode
  var inputProps: js.UndefOr[reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement]] = js.undefined
  var inputRef: js.UndefOr[reactLib.reactMod.Ref[_]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement], 
      /* checked */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[java.lang.String | scala.Double | scala.Boolean] = js.undefined
}

object SwitchBaseProps {
  @scala.inline
  def apply(
    checkedIcon: reactLib.reactMod.ReactNode,
    icon: reactLib.reactMod.ReactNode,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    checked: scala.Boolean | java.lang.String = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[SwitchBaseClassKey]] = null,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    disableRipple: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    inputProps: reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] = null,
    inputRef: reactLib.reactMod.Ref[_] = null,
    name: java.lang.String = null,
    onChange: (/* event */ reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement], /* checked */ scala.Boolean) => scala.Unit = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    value: java.lang.String | scala.Double | scala.Boolean = null
  ): SwitchBaseProps = {
    val __obj = js.Dynamic.literal(checkedIcon = checkedIcon.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disableRipple)) __obj.updateDynamic("disableRipple")(disableRipple)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchBaseProps]
  }
}

