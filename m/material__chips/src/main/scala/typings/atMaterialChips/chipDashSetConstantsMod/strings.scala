package typings.atMaterialChips.chipDashSetConstantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialChips.atMaterialChipsStrings.`DOTmdc-chip`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var CHIP_SELECTOR: `DOTmdc-chip`
}

object strings {
  @scala.inline
  def apply(CHIP_SELECTOR: `DOTmdc-chip`, StringDictionary: StringDictionary[String] = null): strings = {
    val __obj = js.Dynamic.literal(CHIP_SELECTOR = CHIP_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

