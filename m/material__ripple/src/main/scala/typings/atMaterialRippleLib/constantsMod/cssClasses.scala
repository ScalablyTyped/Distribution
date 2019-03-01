package typings
package atMaterialRippleLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var BG_FOCUSED: atMaterialRippleLib.atMaterialRippleLibStrings.`mdc-ripple-upgraded--background-focused`
  var FG_ACTIVATION: atMaterialRippleLib.atMaterialRippleLibStrings.`mdc-ripple-upgraded--foreground-activation`
  var FG_DEACTIVATION: atMaterialRippleLib.atMaterialRippleLibStrings.`mdc-ripple-upgraded--foreground-deactivation`
  // Ripple is a special case where the "root" component is really a "mixin" of sorts,
  // given that it's an 'upgrade' to an existing component. That being said it is the root
  // CSS class that all other CSS classes derive from.
  var ROOT: atMaterialRippleLib.atMaterialRippleLibStrings.`mdc-ripple-upgraded`
  var UNBOUNDED: atMaterialRippleLib.atMaterialRippleLibStrings.`mdc-ripple-upgraded--unbounded`
}

object cssClasses {
  @scala.inline
  def apply(
    BG_FOCUSED: atMaterialRippleLib.atMaterialRippleLibStrings.`mdc-ripple-upgraded--background-focused`,
    FG_ACTIVATION: atMaterialRippleLib.atMaterialRippleLibStrings.`mdc-ripple-upgraded--foreground-activation`,
    FG_DEACTIVATION: atMaterialRippleLib.atMaterialRippleLibStrings.`mdc-ripple-upgraded--foreground-deactivation`,
    ROOT: atMaterialRippleLib.atMaterialRippleLibStrings.`mdc-ripple-upgraded`,
    UNBOUNDED: atMaterialRippleLib.atMaterialRippleLibStrings.`mdc-ripple-upgraded--unbounded`
  ): cssClasses = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BG_FOCUSED")(BG_FOCUSED)
    __obj.updateDynamic("FG_ACTIVATION")(FG_ACTIVATION)
    __obj.updateDynamic("FG_DEACTIVATION")(FG_DEACTIVATION)
    __obj.updateDynamic("ROOT")(ROOT)
    __obj.updateDynamic("UNBOUNDED")(UNBOUNDED)
    __obj.asInstanceOf[cssClasses]
  }
}

