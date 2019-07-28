package typings.materialDashUi.underscoreUnderscoreMaterialUINs.SwitchesNs

import typings.materialDashUi.materialDashUiStrings.left
import typings.materialDashUi.materialDashUiStrings.right
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.ReactLink
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleProps extends CommonEnhancedSwitchProps[Toggle] {
  // <EnhancedSwitch/> is element that get the 'other' properties
  var defaultToggled: js.UndefOr[Boolean] = js.undefined
  var elementStyle: js.UndefOr[CSSProperties] = js.undefined
  var iconStyle: js.UndefOr[CSSProperties] = js.undefined
  var inputStyle: js.UndefOr[CSSProperties] = js.undefined
  var labelPosition: js.UndefOr[left | right] = js.undefined
  var labelStyle: js.UndefOr[CSSProperties] = js.undefined
  var onToggle: js.UndefOr[
    js.Function2[/* e */ MouseEvent[js.Object, NativeMouseEvent], /* isInputChecked */ Boolean, Unit]
  ] = js.undefined
  var rippleStyle: js.UndefOr[CSSProperties] = js.undefined
  var thumbStyle: js.UndefOr[CSSProperties] = js.undefined
  var thumbSwitchedStyle: js.UndefOr[CSSProperties] = js.undefined
  var toggled: js.UndefOr[Boolean] = js.undefined
  var trackStyle: js.UndefOr[CSSProperties] = js.undefined
  var trackSwitchedStyle: js.UndefOr[CSSProperties] = js.undefined
  var valueLink: js.UndefOr[ReactLink[Boolean]] = js.undefined
}

object ToggleProps {
  @scala.inline
  def apply(
    CommonEnhancedSwitchProps: CommonEnhancedSwitchProps[Toggle] = null,
    defaultToggled: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementStyle: CSSProperties = null,
    iconStyle: CSSProperties = null,
    inputStyle: CSSProperties = null,
    label: ReactNode = null,
    labelPosition: left | right = null,
    labelStyle: CSSProperties = null,
    onToggle: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* isInputChecked */ Boolean) => Unit = null,
    rippleStyle: CSSProperties = null,
    style: CSSProperties = null,
    thumbStyle: CSSProperties = null,
    thumbSwitchedStyle: CSSProperties = null,
    toggled: js.UndefOr[Boolean] = js.undefined,
    trackStyle: CSSProperties = null,
    trackSwitchedStyle: CSSProperties = null,
    valueLink: ReactLink[Boolean] = null
  ): ToggleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, CommonEnhancedSwitchProps)
    if (!js.isUndefined(defaultToggled)) __obj.updateDynamic("defaultToggled")(defaultToggled)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (elementStyle != null) __obj.updateDynamic("elementStyle")(elementStyle)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction2(onToggle))
    if (rippleStyle != null) __obj.updateDynamic("rippleStyle")(rippleStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    if (thumbStyle != null) __obj.updateDynamic("thumbStyle")(thumbStyle)
    if (thumbSwitchedStyle != null) __obj.updateDynamic("thumbSwitchedStyle")(thumbSwitchedStyle)
    if (!js.isUndefined(toggled)) __obj.updateDynamic("toggled")(toggled)
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle)
    if (trackSwitchedStyle != null) __obj.updateDynamic("trackSwitchedStyle")(trackSwitchedStyle)
    if (valueLink != null) __obj.updateDynamic("valueLink")(valueLink)
    __obj.asInstanceOf[ToggleProps]
  }
}

