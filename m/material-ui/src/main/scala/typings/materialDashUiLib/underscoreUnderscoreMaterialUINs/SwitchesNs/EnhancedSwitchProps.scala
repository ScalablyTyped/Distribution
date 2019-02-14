package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.SwitchesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnhancedSwitchProps extends CommonEnhancedSwitchProps[EnhancedSwitch] {
  var defaultSwitched: js.UndefOr[scala.Boolean] = js.undefined
  var disableFocusRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disableTouchRipple: js.UndefOr[scala.Boolean] = js.undefined
  var iconStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var inputStyle: reactLib.reactMod.ReactNs.CSSProperties
  var inputType: java.lang.String
  var labelPosition: js.UndefOr[java.lang.String] = js.undefined
   // oneOf(['left', 'right'])
  var labelStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var onSwitch: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* isInputChecked */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var rippleColor: js.UndefOr[java.lang.String] = js.undefined
  var rippleStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var switchElement: reactLib.reactMod.ReactNs.ReactElement
  var switched: scala.Boolean
  var thumbStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var trackStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  @JSName("value")
  var value_EnhancedSwitchProps: js.UndefOr[java.lang.String] = js.undefined
  def onParentShouldUpdate(isInputChecked: scala.Boolean): scala.Unit
}

