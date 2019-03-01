package typings
package atMaterialTabLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var ACTIVE: atMaterialTabLib.atMaterialTabLibStrings.`mdc-tab--active`
  var ANIMATING_ACTIVATE: atMaterialTabLib.atMaterialTabLibStrings.`mdc-tab--animating-activate`
  var ANIMATING_DEACTIVATE: atMaterialTabLib.atMaterialTabLibStrings.`mdc-tab--animating-deactivate`
}

object cssClasses {
  @scala.inline
  def apply(
    ACTIVE: atMaterialTabLib.atMaterialTabLibStrings.`mdc-tab--active`,
    ANIMATING_ACTIVATE: atMaterialTabLib.atMaterialTabLibStrings.`mdc-tab--animating-activate`,
    ANIMATING_DEACTIVATE: atMaterialTabLib.atMaterialTabLibStrings.`mdc-tab--animating-deactivate`
  ): cssClasses = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ACTIVE")(ACTIVE)
    __obj.updateDynamic("ANIMATING_ACTIVATE")(ANIMATING_ACTIVATE)
    __obj.updateDynamic("ANIMATING_DEACTIVATE")(ANIMATING_DEACTIVATE)
    __obj.asInstanceOf[cssClasses]
  }
}

