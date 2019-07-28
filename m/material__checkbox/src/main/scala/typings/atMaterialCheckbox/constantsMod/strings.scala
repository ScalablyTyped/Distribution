package typings.atMaterialCheckbox.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialCheckbox.atMaterialCheckboxStrings.`DOTmdc-checkbox__native-control`
import typings.atMaterialCheckbox.atMaterialCheckboxStrings.`aria-checked`
import typings.atMaterialCheckbox.atMaterialCheckboxStrings.checked
import typings.atMaterialCheckbox.atMaterialCheckboxStrings.indeterminate
import typings.atMaterialCheckbox.atMaterialCheckboxStrings.init
import typings.atMaterialCheckbox.atMaterialCheckboxStrings.mixed
import typings.atMaterialCheckbox.atMaterialCheckboxStrings.unchecked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ARIA_CHECKED_ATTR: `aria-checked`
  var ARIA_CHECKED_INDETERMINATE_VALUE: mixed
  var NATIVE_CONTROL_SELECTOR: `DOTmdc-checkbox__native-control`
  var TRANSITION_STATE_CHECKED: checked
  var TRANSITION_STATE_INDETERMINATE: indeterminate
  var TRANSITION_STATE_INIT: init
  var TRANSITION_STATE_UNCHECKED: unchecked
}

object strings {
  @scala.inline
  def apply(
    ARIA_CHECKED_ATTR: `aria-checked`,
    ARIA_CHECKED_INDETERMINATE_VALUE: mixed,
    NATIVE_CONTROL_SELECTOR: `DOTmdc-checkbox__native-control`,
    TRANSITION_STATE_CHECKED: checked,
    TRANSITION_STATE_INDETERMINATE: indeterminate,
    TRANSITION_STATE_INIT: init,
    TRANSITION_STATE_UNCHECKED: unchecked,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_CHECKED_ATTR = ARIA_CHECKED_ATTR, ARIA_CHECKED_INDETERMINATE_VALUE = ARIA_CHECKED_INDETERMINATE_VALUE, NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR, TRANSITION_STATE_CHECKED = TRANSITION_STATE_CHECKED, TRANSITION_STATE_INDETERMINATE = TRANSITION_STATE_INDETERMINATE, TRANSITION_STATE_INIT = TRANSITION_STATE_INIT, TRANSITION_STATE_UNCHECKED = TRANSITION_STATE_UNCHECKED)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

