package typings
package atMaterialRippleLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait numbers
  extends atMaterialBaseLib.foundationMod.MDCNumbers {
  var DEACTIVATION_TIMEOUT_MS: atMaterialRippleLib.atMaterialRippleLibNumbers.`225`
   // Corresponds to $mdc-ripple-translate-duration (i.e. activation animation duration)
  var FG_DEACTIVATION_MS: atMaterialRippleLib.atMaterialRippleLibNumbers.`150`
  var INITIAL_ORIGIN_SCALE: atMaterialRippleLib.atMaterialRippleLibNumbers.`0DOT6`
  var PADDING: atMaterialRippleLib.atMaterialRippleLibNumbers.`10`
   // Corresponds to $mdc-ripple-fade-out-duration (i.e. deactivation animation duration)
  var TAP_DELAY_MS: atMaterialRippleLib.atMaterialRippleLibNumbers.`300`
}

object numbers {
  @scala.inline
  def apply(
    DEACTIVATION_TIMEOUT_MS: atMaterialRippleLib.atMaterialRippleLibNumbers.`225`,
    FG_DEACTIVATION_MS: atMaterialRippleLib.atMaterialRippleLibNumbers.`150`,
    INITIAL_ORIGIN_SCALE: atMaterialRippleLib.atMaterialRippleLibNumbers.`0DOT6`,
    PADDING: atMaterialRippleLib.atMaterialRippleLibNumbers.`10`,
    TAP_DELAY_MS: atMaterialRippleLib.atMaterialRippleLibNumbers.`300`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): numbers = {
    val __obj = js.Dynamic.literal(DEACTIVATION_TIMEOUT_MS = DEACTIVATION_TIMEOUT_MS, FG_DEACTIVATION_MS = FG_DEACTIVATION_MS, INITIAL_ORIGIN_SCALE = INITIAL_ORIGIN_SCALE, PADDING = PADDING, TAP_DELAY_MS = TAP_DELAY_MS)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[numbers]
  }
}

