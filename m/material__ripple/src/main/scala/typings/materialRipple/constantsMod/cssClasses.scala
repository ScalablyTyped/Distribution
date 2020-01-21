package typings.materialRipple.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialRipple.materialRippleStrings.`mdc-ripple-upgraded--background-focused`
import typings.materialRipple.materialRippleStrings.`mdc-ripple-upgraded--foreground-activation`
import typings.materialRipple.materialRippleStrings.`mdc-ripple-upgraded--foreground-deactivation`
import typings.materialRipple.materialRippleStrings.`mdc-ripple-upgraded--unbounded`
import typings.materialRipple.materialRippleStrings.`mdc-ripple-upgraded`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var BG_FOCUSED: `mdc-ripple-upgraded--background-focused`
  var FG_ACTIVATION: `mdc-ripple-upgraded--foreground-activation`
  var FG_DEACTIVATION: `mdc-ripple-upgraded--foreground-deactivation`
  // Ripple is a special case where the "root" component is really a "mixin" of sorts,
  // given that it's an 'upgrade' to an existing component. That being said it is the root
  // CSS class that all other CSS classes derive from.
  var ROOT: `mdc-ripple-upgraded`
  var UNBOUNDED: `mdc-ripple-upgraded--unbounded`
}

object cssClasses {
  @scala.inline
  def apply(
    BG_FOCUSED: `mdc-ripple-upgraded--background-focused`,
    FG_ACTIVATION: `mdc-ripple-upgraded--foreground-activation`,
    FG_DEACTIVATION: `mdc-ripple-upgraded--foreground-deactivation`,
    ROOT: `mdc-ripple-upgraded`,
    UNBOUNDED: `mdc-ripple-upgraded--unbounded`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(BG_FOCUSED = BG_FOCUSED.asInstanceOf[js.Any], FG_ACTIVATION = FG_ACTIVATION.asInstanceOf[js.Any], FG_DEACTIVATION = FG_DEACTIVATION.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any], UNBOUNDED = UNBOUNDED.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

