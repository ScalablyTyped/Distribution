package typings
package atMaterialChipsLib.chipDashSetConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var CHIP_SELECTOR: atMaterialChipsLib.atMaterialChipsLibStrings.`DOTmdc-chip`
}

object strings {
  @scala.inline
  def apply(
    CHIP_SELECTOR: atMaterialChipsLib.atMaterialChipsLibStrings.`DOTmdc-chip`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(CHIP_SELECTOR = CHIP_SELECTOR)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

