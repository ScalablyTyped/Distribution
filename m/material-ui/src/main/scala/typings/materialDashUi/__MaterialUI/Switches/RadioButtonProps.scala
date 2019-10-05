package typings.materialDashUi.__MaterialUI.Switches

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FormEvent
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonProps extends CommonEnhancedSwitchProps[RadioButton] {
  // <EnhancedSwitch/> is element that get the 'other' properties
  var checkedIcon: js.UndefOr[ReactElement] = js.undefined
  var iconStyle: js.UndefOr[CSSProperties] = js.undefined
  var inputStyle: js.UndefOr[CSSProperties] = js.undefined
  var labelStyle: js.UndefOr[CSSProperties] = js.undefined
  var onCheck: js.UndefOr[js.Function2[/* e */ FormEvent[js.Object], /* selected */ String, Unit]] = js.undefined
  var uncheckedIcon: js.UndefOr[ReactElement] = js.undefined
   // Normally an SvgIcon
  @JSName("value")
  var value_RadioButtonProps: js.UndefOr[js.Any] = js.undefined
}

object RadioButtonProps {
  @scala.inline
  def apply(
    CommonEnhancedSwitchProps: CommonEnhancedSwitchProps[RadioButton] = null,
    checkedIcon: ReactElement = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    iconStyle: CSSProperties = null,
    inputStyle: CSSProperties = null,
    labelStyle: CSSProperties = null,
    onCheck: (/* e */ FormEvent[js.Object], /* selected */ String) => Unit = null,
    style: CSSProperties = null,
    uncheckedIcon: ReactElement = null,
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

