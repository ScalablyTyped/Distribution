package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.SwitchesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonProps extends CommonEnhancedSwitchProps[RadioButton] {
  // <EnhancedSwitch/> is element that get the 'other' properties
  var checkedIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[materialDashUiLib.Anon_Style]] = js.undefined
  var iconStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var inputStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var labelStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var onCheck: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.FormEvent[js.Object], 
      /* selected */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var uncheckedIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[materialDashUiLib.Anon_Style]] = js.undefined
   // Normally an SvgIcon
  @JSName("value")
  var value_RadioButtonProps: js.UndefOr[js.Any] = js.undefined
}

object RadioButtonProps {
  @scala.inline
  def apply(
    CommonEnhancedSwitchProps: CommonEnhancedSwitchProps[RadioButton] = null,
    checkedIcon: reactLib.reactMod.ReactNs.ReactElement[materialDashUiLib.Anon_Style] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    iconStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    inputStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    labelStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    onCheck: (/* e */ reactLib.reactMod.ReactNs.FormEvent[js.Object], /* selected */ java.lang.String) => scala.Unit = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    uncheckedIcon: reactLib.reactMod.ReactNs.ReactElement[materialDashUiLib.Anon_Style] = null,
    value: js.Any = null
  ): RadioButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, CommonEnhancedSwitchProps)
    if (checkedIcon != null) __obj.updateDynamic("checkedIcon")(checkedIcon)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (onCheck != null) __obj.updateDynamic("onCheck")(js.Any.fromFunction2(onCheck))
    if (style != null) __obj.updateDynamic("style")(style)
    if (uncheckedIcon != null) __obj.updateDynamic("uncheckedIcon")(uncheckedIcon)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RadioButtonProps]
  }
}

