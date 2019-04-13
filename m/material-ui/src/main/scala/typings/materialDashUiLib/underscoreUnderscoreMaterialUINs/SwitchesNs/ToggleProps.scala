package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.SwitchesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleProps extends CommonEnhancedSwitchProps[Toggle] {
  // <EnhancedSwitch/> is element that get the 'other' properties
  var defaultToggled: js.UndefOr[scala.Boolean] = js.undefined
  var elementStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var iconStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var inputStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var labelPosition: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.left | materialDashUiLib.materialDashUiLibStrings.right
  ] = js.undefined
  var labelStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var onToggle: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* isInputChecked */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var rippleStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var thumbStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var thumbSwitchedStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var toggled: js.UndefOr[scala.Boolean] = js.undefined
  var trackStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var trackSwitchedStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var valueLink: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.ReactLink[scala.Boolean]] = js.undefined
}

object ToggleProps {
  @scala.inline
  def apply(
    CommonEnhancedSwitchProps: CommonEnhancedSwitchProps[Toggle] = null,
    defaultToggled: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    elementStyle: reactLib.reactMod.CSSProperties = null,
    iconStyle: reactLib.reactMod.CSSProperties = null,
    inputStyle: reactLib.reactMod.CSSProperties = null,
    label: reactLib.reactMod.ReactNode = null,
    labelPosition: materialDashUiLib.materialDashUiLibStrings.left | materialDashUiLib.materialDashUiLibStrings.right = null,
    labelStyle: reactLib.reactMod.CSSProperties = null,
    onToggle: (/* e */ reactLib.reactMod.MouseEvent[js.Object, reactLib.NativeMouseEvent], /* isInputChecked */ scala.Boolean) => scala.Unit = null,
    rippleStyle: reactLib.reactMod.CSSProperties = null,
    style: reactLib.reactMod.CSSProperties = null,
    thumbStyle: reactLib.reactMod.CSSProperties = null,
    thumbSwitchedStyle: reactLib.reactMod.CSSProperties = null,
    toggled: js.UndefOr[scala.Boolean] = js.undefined,
    trackStyle: reactLib.reactMod.CSSProperties = null,
    trackSwitchedStyle: reactLib.reactMod.CSSProperties = null,
    valueLink: materialDashUiLib.underscoreUnderscoreMaterialUINs.ReactLink[scala.Boolean] = null
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

