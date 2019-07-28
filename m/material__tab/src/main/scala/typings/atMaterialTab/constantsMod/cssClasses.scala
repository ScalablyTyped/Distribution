package typings.atMaterialTab.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialTab.atMaterialTabStrings.`mdc-tab--active`
import typings.atMaterialTab.atMaterialTabStrings.`mdc-tab--animating-activate`
import typings.atMaterialTab.atMaterialTabStrings.`mdc-tab--animating-deactivate`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var ACTIVE: `mdc-tab--active`
  var ANIMATING_ACTIVATE: `mdc-tab--animating-activate`
  var ANIMATING_DEACTIVATE: `mdc-tab--animating-deactivate`
}

object cssClasses {
  @scala.inline
  def apply(
    ACTIVE: `mdc-tab--active`,
    ANIMATING_ACTIVATE: `mdc-tab--animating-activate`,
    ANIMATING_DEACTIVATE: `mdc-tab--animating-deactivate`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE, ANIMATING_ACTIVATE = ANIMATING_ACTIVATE, ANIMATING_DEACTIVATE = ANIMATING_DEACTIVATE)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

