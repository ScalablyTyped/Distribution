package typings
package atMaterialNotchedDashOutlineLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var OUTLINE_NOTCHED: atMaterialNotchedDashOutlineLib.atMaterialNotchedDashOutlineLibStrings.`mdc-notched-outline--notched`
}

object cssClasses {
  @scala.inline
  def apply(
    OUTLINE_NOTCHED: atMaterialNotchedDashOutlineLib.atMaterialNotchedDashOutlineLibStrings.`mdc-notched-outline--notched`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(OUTLINE_NOTCHED = OUTLINE_NOTCHED)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

