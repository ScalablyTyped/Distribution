package typings.atMaterialCheckbox.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCNumbers
import typings.atMaterialCheckbox.atMaterialCheckboxNumbers.`250`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait numbers extends MDCNumbers {
  var ANIM_END_LATCH_MS: `250`
}

object numbers {
  @scala.inline
  def apply(ANIM_END_LATCH_MS: `250`, StringDictionary: StringDictionary[Double] = null): numbers = {
    val __obj = js.Dynamic.literal(ANIM_END_LATCH_MS = ANIM_END_LATCH_MS.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[numbers]
  }
}

