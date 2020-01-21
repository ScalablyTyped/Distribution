package typings.materialTab.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialTab.materialTabStrings.`aria-selected`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ARIA_SELECTED: `aria-selected`
}

object strings {
  @scala.inline
  def apply(ARIA_SELECTED: `aria-selected`, StringDictionary: StringDictionary[String] = null): strings = {
    val __obj = js.Dynamic.literal(ARIA_SELECTED = ARIA_SELECTED.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

