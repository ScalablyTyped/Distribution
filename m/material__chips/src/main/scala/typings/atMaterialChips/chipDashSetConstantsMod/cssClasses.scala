package typings.atMaterialChips.chipDashSetConstantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialChips.atMaterialChipsStrings.`mdc-chip-set--choice`
import typings.atMaterialChips.atMaterialChipsStrings.`mdc-chip-set--filter`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var CHOICE: `mdc-chip-set--choice`
  var FILTER: `mdc-chip-set--filter`
}

object cssClasses {
  @scala.inline
  def apply(
    CHOICE: `mdc-chip-set--choice`,
    FILTER: `mdc-chip-set--filter`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(CHOICE = CHOICE.asInstanceOf[js.Any], FILTER = FILTER.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

