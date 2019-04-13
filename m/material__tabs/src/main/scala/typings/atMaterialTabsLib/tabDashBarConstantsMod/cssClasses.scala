package typings
package atMaterialTabsLib.tabDashBarConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var UPGRADED: atMaterialTabsLib.atMaterialTabsLibStrings.`mdc-tab-bar-upgraded`
}

object cssClasses {
  @scala.inline
  def apply(
    UPGRADED: atMaterialTabsLib.atMaterialTabsLibStrings.`mdc-tab-bar-upgraded`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(UPGRADED = UPGRADED)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

