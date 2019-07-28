package typings.atMaterialFormDashField.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialFormDashField.atMaterialFormDashFieldStrings.`DOTmdc-form-field > label`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var LABEL_SELECTOR: `DOTmdc-form-field > label`
}

object strings {
  @scala.inline
  def apply(LABEL_SELECTOR: `DOTmdc-form-field > label`, StringDictionary: StringDictionary[String] = null): strings = {
    val __obj = js.Dynamic.literal(LABEL_SELECTOR = LABEL_SELECTOR)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

