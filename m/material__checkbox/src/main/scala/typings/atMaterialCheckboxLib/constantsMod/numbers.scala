package typings
package atMaterialCheckboxLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait numbers
  extends atMaterialBaseLib.foundationMod.MDCNumbers {
  var ANIM_END_LATCH_MS: atMaterialCheckboxLib.atMaterialCheckboxLibNumbers.`250`
}

object numbers {
  @scala.inline
  def apply(
    ANIM_END_LATCH_MS: atMaterialCheckboxLib.atMaterialCheckboxLibNumbers.`250`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): numbers = {
    val __obj = js.Dynamic.literal(ANIM_END_LATCH_MS = ANIM_END_LATCH_MS)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[numbers]
  }
}

