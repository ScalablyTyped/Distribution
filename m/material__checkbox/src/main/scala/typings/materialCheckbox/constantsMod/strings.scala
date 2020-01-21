package typings.materialCheckbox.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialCheckbox.materialCheckboxStrings.`Dotmdc-checkbox__native-control`
import typings.materialCheckbox.materialCheckboxStrings.`aria-checked`
import typings.materialCheckbox.materialCheckboxStrings.checked
import typings.materialCheckbox.materialCheckboxStrings.indeterminate
import typings.materialCheckbox.materialCheckboxStrings.init
import typings.materialCheckbox.materialCheckboxStrings.mixed
import typings.materialCheckbox.materialCheckboxStrings.unchecked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ARIA_CHECKED_ATTR: `aria-checked`
  var ARIA_CHECKED_INDETERMINATE_VALUE: mixed
  var NATIVE_CONTROL_SELECTOR: `Dotmdc-checkbox__native-control`
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
    NATIVE_CONTROL_SELECTOR: `Dotmdc-checkbox__native-control`,
    TRANSITION_STATE_CHECKED: checked,
    TRANSITION_STATE_INDETERMINATE: indeterminate,
    TRANSITION_STATE_INIT: init,
    TRANSITION_STATE_UNCHECKED: unchecked,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_CHECKED_ATTR = ARIA_CHECKED_ATTR.asInstanceOf[js.Any], ARIA_CHECKED_INDETERMINATE_VALUE = ARIA_CHECKED_INDETERMINATE_VALUE.asInstanceOf[js.Any], NATIVE_CONTROL_SELECTOR = NATIVE_CONTROL_SELECTOR.asInstanceOf[js.Any], TRANSITION_STATE_CHECKED = TRANSITION_STATE_CHECKED.asInstanceOf[js.Any], TRANSITION_STATE_INDETERMINATE = TRANSITION_STATE_INDETERMINATE.asInstanceOf[js.Any], TRANSITION_STATE_INIT = TRANSITION_STATE_INIT.asInstanceOf[js.Any], TRANSITION_STATE_UNCHECKED = TRANSITION_STATE_UNCHECKED.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

