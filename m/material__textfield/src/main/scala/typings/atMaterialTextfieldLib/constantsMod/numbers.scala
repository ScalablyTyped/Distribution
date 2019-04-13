package typings
package atMaterialTextfieldLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait numbers
  extends atMaterialBaseLib.foundationMod.MDCNumbers {
  var DENSE_LABEL_SCALE: atMaterialTextfieldLib.atMaterialTextfieldLibNumbers.`0DOT923`
  var LABEL_SCALE: atMaterialTextfieldLib.atMaterialTextfieldLibNumbers.`0DOT75`
}

object numbers {
  @scala.inline
  def apply(
    DENSE_LABEL_SCALE: atMaterialTextfieldLib.atMaterialTextfieldLibNumbers.`0DOT923`,
    LABEL_SCALE: atMaterialTextfieldLib.atMaterialTextfieldLibNumbers.`0DOT75`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): numbers = {
    val __obj = js.Dynamic.literal(DENSE_LABEL_SCALE = DENSE_LABEL_SCALE, LABEL_SCALE = LABEL_SCALE)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[numbers]
  }
}

