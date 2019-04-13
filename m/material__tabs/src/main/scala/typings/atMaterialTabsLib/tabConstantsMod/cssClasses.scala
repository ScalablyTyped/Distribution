package typings
package atMaterialTabsLib.tabConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var ACTIVE: atMaterialTabsLib.atMaterialTabsLibStrings.`mdc-tab--active`
}

object cssClasses {
  @scala.inline
  def apply(
    ACTIVE: atMaterialTabsLib.atMaterialTabsLibStrings.`mdc-tab--active`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

