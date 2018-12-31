package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.SwitchesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps extends CommonEnhancedSwitchProps[Checkbox] {
  var checkedIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[materialDashUiLib.Anon_Style]] = js.undefined
  var iconStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var inputStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var labelPosition: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.left | materialDashUiLib.materialDashUiLibStrings.right
  ] = js.undefined
  var labelStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var onCheck: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[js.Object, reactLib.NativeMouseEvent], 
      /* checked */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var uncheckedIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[materialDashUiLib.Anon_Style]] = js.undefined
   // Normally an SvgIcon
  var valueLink: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.ReactLink[scala.Boolean]] = js.undefined
}

