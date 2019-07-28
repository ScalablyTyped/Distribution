package typings.atMaterialTextfield.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCNumbers
import typings.atMaterialTextfield.atMaterialTextfieldNumbers.`0DOT75`
import typings.atMaterialTextfield.atMaterialTextfieldNumbers.`0DOT923`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait numbers extends MDCNumbers {
  var DENSE_LABEL_SCALE: `0DOT923`
  var LABEL_SCALE: `0DOT75`
}

object numbers {
  @scala.inline
  def apply(
    DENSE_LABEL_SCALE: `0DOT923`,
    LABEL_SCALE: `0DOT75`,
    StringDictionary: StringDictionary[Double] = null
  ): numbers = {
    val __obj = js.Dynamic.literal(DENSE_LABEL_SCALE = DENSE_LABEL_SCALE, LABEL_SCALE = LABEL_SCALE)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[numbers]
  }
}

