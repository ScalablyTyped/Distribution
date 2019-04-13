package typings
package atMaterialSliderLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait numbers
  extends atMaterialBaseLib.foundationMod.MDCNumbers {
  var PAGE_FACTOR: atMaterialSliderLib.atMaterialSliderLibNumbers.`4`
}

object numbers {
  @scala.inline
  def apply(
    PAGE_FACTOR: atMaterialSliderLib.atMaterialSliderLibNumbers.`4`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): numbers = {
    val __obj = js.Dynamic.literal(PAGE_FACTOR = PAGE_FACTOR)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[numbers]
  }
}

