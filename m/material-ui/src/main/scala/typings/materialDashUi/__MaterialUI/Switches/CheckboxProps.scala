package typings.materialDashUi.__MaterialUI.Switches

import typings.materialDashUi.__MaterialUI.ReactLink
import typings.materialDashUi.materialDashUiStrings.left
import typings.materialDashUi.materialDashUiStrings.right
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps extends CommonEnhancedSwitchProps[Checkbox] {
  var checkedIcon: js.UndefOr[ReactElement] = js.undefined
  var iconStyle: js.UndefOr[CSSProperties] = js.undefined
  var inputStyle: js.UndefOr[CSSProperties] = js.undefined
  var labelPosition: js.UndefOr[left | right] = js.undefined
  var labelStyle: js.UndefOr[CSSProperties] = js.undefined
  var onCheck: js.UndefOr[
    js.Function2[/* event */ MouseEvent[js.Object, NativeMouseEvent], /* checked */ Boolean, Unit]
  ] = js.undefined
  var uncheckedIcon: js.UndefOr[ReactElement] = js.undefined
   // Normally an SvgIcon
  var valueLink: js.UndefOr[ReactLink[Boolean]] = js.undefined
}

object CheckboxProps {
  @scala.inline
  def apply(
    CommonEnhancedSwitchProps: CommonEnhancedSwitchProps[Checkbox] = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    checkedIcon: ReactElement = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    iconStyle: CSSProperties = null,
    inputStyle: CSSProperties = null,
    labelPosition: left | right = null,
    labelStyle: CSSProperties = null,
    onCheck: (/* event */ MouseEvent[js.Object, NativeMouseEvent], /* checked */ Boolean) => Unit = null,
    style: CSSProperties = null,
    uncheckedIcon: ReactElement = null,
    valueLink: ReactLink[Boolean] = null
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, CommonEnhancedSwitchProps)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (checkedIcon != null) __obj.updateDynamic("checkedIcon")(checkedIcon)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (onCheck != null) __obj.updateDynamic("onCheck")(js.Any.fromFunction2(onCheck))
    if (style != null) __obj.updateDynamic("style")(style)
    if (uncheckedIcon != null) __obj.updateDynamic("uncheckedIcon")(uncheckedIcon)
    if (valueLink != null) __obj.updateDynamic("valueLink")(valueLink)
    __obj.asInstanceOf[CheckboxProps]
  }
}

