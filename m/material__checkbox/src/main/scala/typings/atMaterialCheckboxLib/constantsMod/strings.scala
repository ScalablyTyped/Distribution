package typings
package atMaterialCheckboxLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var ARIA_CHECKED_ATTR: atMaterialCheckboxLib.atMaterialCheckboxLibStrings.`aria-checked`
  var ARIA_CHECKED_INDETERMINATE_VALUE: atMaterialCheckboxLib.atMaterialCheckboxLibStrings.mixed
  var NATIVE_CONTROL_SELECTOR: atMaterialCheckboxLib.atMaterialCheckboxLibStrings.`DOTmdc-checkbox__native-control`
  var TRANSITION_STATE_CHECKED: atMaterialCheckboxLib.atMaterialCheckboxLibStrings.checked
  var TRANSITION_STATE_INDETERMINATE: atMaterialCheckboxLib.atMaterialCheckboxLibStrings.indeterminate
  var TRANSITION_STATE_INIT: atMaterialCheckboxLib.atMaterialCheckboxLibStrings.init
  var TRANSITION_STATE_UNCHECKED: atMaterialCheckboxLib.atMaterialCheckboxLibStrings.unchecked
}

object strings {
  @scala.inline
  def apply(
    ARIA_CHECKED_ATTR: atMaterialCheckboxLib.atMaterialCheckboxLibStrings.`aria-checked`,
    ARIA_CHECKED_INDETERMINATE_VALUE: atMaterialCheckboxLib.atMaterialCheckboxLibStrings.mixed,
    NATIVE_CONTROL_SELECTOR: atMaterialCheckboxLib.atMaterialCheckboxLibStrings.`DOTmdc-checkbox__native-control`,
    TRANSITION_STATE_CHECKED: atMaterialCheckboxLib.atMaterialCheckboxLibStrings.checked,
    TRANSITION_STATE_INDETERMINATE: atMaterialCheckboxLib.atMaterialCheckboxLibStrings.indeterminate,
    TRANSITION_STATE_INIT: atMaterialCheckboxLib.atMaterialCheckboxLibStrings.init,
    TRANSITION_STATE_UNCHECKED: atMaterialCheckboxLib.atMaterialCheckboxLibStrings.unchecked,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_CHECKED_ATTR = ARIA_CHECKED_ATTR, ARIA_CHECKED_INDETERMINATE_VALUE = ARIA_CHECKED_INDETERMINATE_VALUE, NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR, TRANSITION_STATE_CHECKED = TRANSITION_STATE_CHECKED, TRANSITION_STATE_INDETERMINATE = TRANSITION_STATE_INDETERMINATE, TRANSITION_STATE_INIT = TRANSITION_STATE_INIT, TRANSITION_STATE_UNCHECKED = TRANSITION_STATE_UNCHECKED)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

