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
    ANIMATING_DEACTIVATE: atMaterialTabLib.atMaterialTabLibStrings.`mdc-tab--animating-deactivate`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE, ANIMATING_ACTIVATE = ANIMATING_ACTIVATE, ANIMATING_DEACTIVATE = ANIMATING_DEACTIVATE)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

