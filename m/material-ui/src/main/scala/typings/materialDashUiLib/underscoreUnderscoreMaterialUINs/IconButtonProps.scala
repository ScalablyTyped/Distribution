package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(materialDashUiLib.underscoreUnderscoreMaterialUINs.SharedEnhancedButtonProps because Would inherit conflicting mutable fields List(onBlur, onClick, onFocus, onKeyDown, onKeyUp, style, tabIndex))*/
trait IconButtonProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[js.Object] {
  var disableTouchRipple: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var hoveredStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var iconClassName: js.UndefOr[java.lang.String] = js.undefined
  var iconStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var onKeyboardFocus: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.FocusEvent[js.Object], 
      /* isKeyboardFocused */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var tooltip: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | java.lang.String] = js.undefined
  var tooltipPosition: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.cornersAndCenter] = js.undefined
  var tooltipStyles: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var touch: js.UndefOr[scala.Boolean] = js.undefined
}

