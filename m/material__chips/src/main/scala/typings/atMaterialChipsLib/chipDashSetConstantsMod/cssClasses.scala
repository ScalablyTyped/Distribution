package typings
package atMaterialChipsLib.chipDashSetConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var CHOICE: atMaterialChipsLib.atMaterialChipsLibStrings.`mdc-chip-set--choice`
  var FILTER: atMaterialChipsLib.atMaterialChipsLibStrings.`mdc-chip-set--filter`
}

object cssClasses {
  @scala.inline
  def apply(
    CHOICE: atMaterialChipsLib.atMaterialChipsLibStrings.`mdc-chip-set--choice`,
    FILTER: atMaterialChipsLib.atMaterialChipsLibStrings.`mdc-chip-set--filter`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(CHOICE = CHOICE, FILTER = FILTER)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

