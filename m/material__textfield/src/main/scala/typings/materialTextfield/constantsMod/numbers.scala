package typings.materialTextfield.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCNumbers
import typings.materialTextfield.materialTextfieldNumbers.`0.75`
import typings.materialTextfield.materialTextfieldNumbers.`0.923`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait numbers extends MDCNumbers {
  var DENSE_LABEL_SCALE: `0.923`
  var LABEL_SCALE: `0.75`
}

object numbers {
  @scala.inline
  def apply(DENSE_LABEL_SCALE: `0.923`, LABEL_SCALE: `0.75`, StringDictionary: StringDictionary[Double] = null): numbers = {
    val __obj = js.Dynamic.literal(DENSE_LABEL_SCALE = DENSE_LABEL_SCALE.asInstanceOf[js.Any], LABEL_SCALE = LABEL_SCALE.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[numbers]
  }
}

