package typings.atMaterialSelect.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialSelect.atMaterialSelectStrings.MDCSelectColonchange
import typings.atMaterialSelect.atMaterialSelectStrings.`Dotmdc-floating-label`
import typings.atMaterialSelect.atMaterialSelectStrings.`Dotmdc-line-ripple`
import typings.atMaterialSelect.atMaterialSelectStrings.`Dotmdc-select__native-control`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var CHANGE_EVENT: MDCSelectColonchange
  var LABEL_SELECTOR: `Dotmdc-floating-label`
  var LINE_RIPPLE_SELECTOR: `Dotmdc-line-ripple`
  var NATIVE_CONTROL_SELECTOR: `Dotmdc-select__native-control`
}

object strings {
  @scala.inline
  def apply(
    CHANGE_EVENT: MDCSelectColonchange,
    LABEL_SELECTOR: `Dotmdc-floating-label`,
    LINE_RIPPLE_SELECTOR: `Dotmdc-line-ripple`,
    NATIVE_CONTROL_SELECTOR: `Dotmdc-select__native-control`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], LABEL_SELECTOR = LABEL_SELECTOR.asInstanceOf[js.Any], LINE_RIPPLE_SELECTOR = LINE_RIPPLE_SELECTOR.asInstanceOf[js.Any], NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

