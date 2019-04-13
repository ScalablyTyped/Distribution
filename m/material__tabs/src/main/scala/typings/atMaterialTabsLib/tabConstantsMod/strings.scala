package typings
package atMaterialTabsLib.tabConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var SELECTED_EVENT: atMaterialTabsLib.atMaterialTabsLibStrings.`MDCTab:selected`
}

object strings {
  @scala.inline
  def apply(
    SELECTED_EVENT: atMaterialTabsLib.atMaterialTabsLibStrings.`MDCTab:selected`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(SELECTED_EVENT = SELECTED_EVENT)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

