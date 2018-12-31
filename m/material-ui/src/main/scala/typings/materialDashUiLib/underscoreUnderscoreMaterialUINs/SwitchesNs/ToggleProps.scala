package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.SwitchesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleProps extends CommonEnhancedSwitchProps[Toggle] {
  // <EnhancedSwitch/> is element that get the 'other' properties
  var defaultToggled: js.UndefOr[scala.Boolean] = js.undefined
  var elementStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var iconStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var inputStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var labelPosition: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.left | materialDashUiLib.materialDashUiLibStrings.right
  ] = js.undefined
  var labelStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var onToggle: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* isInputChecked */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var rippleStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var thumbStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var thumbSwitchedStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var toggled: js.UndefOr[scala.Boolean] = js.undefined
  var trackStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var trackSwitchedStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var valueLink: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.ReactLink[scala.Boolean]] = js.undefined
}

