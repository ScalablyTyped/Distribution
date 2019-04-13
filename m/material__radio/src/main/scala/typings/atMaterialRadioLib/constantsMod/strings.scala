package typings
package atMaterialRadioLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var NATIVE_CONTROL_SELECTOR: atMaterialRadioLib.atMaterialRadioLibStrings.`DOTmdc-radio__native-control`
}

object strings {
  @scala.inline
  def apply(
    NATIVE_CONTROL_SELECTOR: atMaterialRadioLib.atMaterialRadioLibStrings.`DOTmdc-radio__native-control`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

