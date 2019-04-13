package typings
package atMaterialFormDashFieldLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var LABEL_SELECTOR: atMaterialFormDashFieldLib.atMaterialFormDashFieldLibStrings.`DOTmdc-form-field > label`
}

object strings {
  @scala.inline
  def apply(
    LABEL_SELECTOR: atMaterialFormDashFieldLib.atMaterialFormDashFieldLibStrings.`DOTmdc-form-field > label`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(LABEL_SELECTOR = LABEL_SELECTOR)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

