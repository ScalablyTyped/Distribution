package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(materialDashUiLib.underscoreUnderscoreMaterialUINs.SharedEnhancedButtonProps because Would inherit conflicting mutable fields List(onBlur, onClick, onFocus, onKeyDown, onKeyUp))*/
trait FlatButtonProps
  extends reactLib.reactMod.ReactNs.DOMAttributes[js.Object] {
  // <EnhancedButton/> is the element that get the 'other' properties
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var hoverColor: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var labelPosition: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.before | materialDashUiLib.materialDashUiLibStrings.after
  ] = js.undefined
  var labelStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var linkButton: js.UndefOr[scala.Boolean] = js.undefined
  var onKeyboardFocus: js.UndefOr[
    js.Function2[
      /* e */ reactLib.reactMod.ReactNs.FocusEvent[js.Object], 
      /* isKeyboardFocused */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var rippleColor: js.UndefOr[java.lang.String] = js.undefined
  var secondary: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

