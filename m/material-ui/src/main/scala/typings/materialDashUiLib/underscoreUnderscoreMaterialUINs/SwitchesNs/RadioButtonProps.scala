package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.SwitchesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonProps extends CommonEnhancedSwitchProps[RadioButton] {
  // <EnhancedSwitch/> is element that get the 'other' properties
  var checkedIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement] = js.undefined
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
  var uncheckedIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement] = js.undefined
   // Normally an SvgIcon
  @JSName("value")
  var value_RadioButtonProps: js.UndefOr[js.Any] = js.undefined
}

