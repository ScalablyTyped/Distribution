package typings.materialChips.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialChips.materialChipsStrings.`Dotmdc-chip`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var CHIP_SELECTOR: `Dotmdc-chip`
}

object strings {
  @scala.inline
  def apply(CHIP_SELECTOR: `Dotmdc-chip`, StringDictionary: StringDictionary[String] = null): strings = {
    val __obj = js.Dynamic.literal(CHIP_SELECTOR = CHIP_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

