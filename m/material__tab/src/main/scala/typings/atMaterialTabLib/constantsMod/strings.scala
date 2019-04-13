package typings
package atMaterialTabLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var ARIA_SELECTED: atMaterialTabLib.atMaterialTabLibStrings.`aria-selected`
}

object strings {
  @scala.inline
  def apply(
    ARIA_SELECTED: atMaterialTabLib.atMaterialTabLibStrings.`aria-selected`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_SELECTED = ARIA_SELECTED)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

