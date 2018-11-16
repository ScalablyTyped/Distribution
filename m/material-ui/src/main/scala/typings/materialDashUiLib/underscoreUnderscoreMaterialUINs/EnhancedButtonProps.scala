package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(materialDashUiLib.underscoreUnderscoreMaterialUINs.SharedEnhancedButtonProps because Would inherit conflicting mutable fields List(onBlur, onClick, onFocus, onKeyDown, onKeyUp, style, tabIndex))*/

trait EnhancedButtonProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[js.Object] {
  // container element, <button/>, or <span/>(if disabled link) is the element that get the 'other' properties
  var containerElement: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
}

