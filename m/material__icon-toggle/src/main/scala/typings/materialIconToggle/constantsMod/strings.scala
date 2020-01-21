package typings.materialIconToggle.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialIconToggle.materialIconToggleStrings.MDCIconToggleColonchange
import typings.materialIconToggle.materialIconToggleStrings.`aria-disabled`
import typings.materialIconToggle.materialIconToggleStrings.`aria-label`
import typings.materialIconToggle.materialIconToggleStrings.`aria-pressed`
import typings.materialIconToggle.materialIconToggleStrings.`data-toggle-off`
import typings.materialIconToggle.materialIconToggleStrings.`data-toggle-on`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ARIA_DISABLED: `aria-disabled`
  var ARIA_LABEL: `aria-label`
  var ARIA_PRESSED: `aria-pressed`
  var CHANGE_EVENT: MDCIconToggleColonchange
  var DATA_TOGGLE_OFF: `data-toggle-off`
  var DATA_TOGGLE_ON: `data-toggle-on`
}

object strings {
  @scala.inline
  def apply(
    ARIA_DISABLED: `aria-disabled`,
    ARIA_LABEL: `aria-label`,
    ARIA_PRESSED: `aria-pressed`,
    CHANGE_EVENT: MDCIconToggleColonchange,
    DATA_TOGGLE_OFF: `data-toggle-off`,
    DATA_TOGGLE_ON: `data-toggle-on`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_DISABLED = ARIA_DISABLED.asInstanceOf[js.Any], ARIA_LABEL = ARIA_LABEL.asInstanceOf[js.Any], ARIA_PRESSED = ARIA_PRESSED.asInstanceOf[js.Any], CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], DATA_TOGGLE_OFF = DATA_TOGGLE_OFF.asInstanceOf[js.Any], DATA_TOGGLE_ON = DATA_TOGGLE_ON.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

