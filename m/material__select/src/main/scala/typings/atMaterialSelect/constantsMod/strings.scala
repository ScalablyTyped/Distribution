package typings.atMaterialSelect.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialSelect.atMaterialSelectStrings.`DOTmdc-floating-label`
import typings.atMaterialSelect.atMaterialSelectStrings.`DOTmdc-line-ripple`
import typings.atMaterialSelect.atMaterialSelectStrings.`DOTmdc-select__native-control`
import typings.atMaterialSelect.atMaterialSelectStrings.`MDCSelect:change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var CHANGE_EVENT: `MDCSelect:change`
  var LABEL_SELECTOR: `DOTmdc-floating-label`
  var LINE_RIPPLE_SELECTOR: `DOTmdc-line-ripple`
  var NATIVE_CONTROL_SELECTOR: `DOTmdc-select__native-control`
}

object strings {
  @scala.inline
  def apply(
    CHANGE_EVENT: `MDCSelect:change`,
    LABEL_SELECTOR: `DOTmdc-floating-label`,
    LINE_RIPPLE_SELECTOR: `DOTmdc-line-ripple`,
    NATIVE_CONTROL_SELECTOR: `DOTmdc-select__native-control`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], LABEL_SELECTOR = LABEL_SELECTOR.asInstanceOf[js.Any], LINE_RIPPLE_SELECTOR = LINE_RIPPLE_SELECTOR.asInstanceOf[js.Any], NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

