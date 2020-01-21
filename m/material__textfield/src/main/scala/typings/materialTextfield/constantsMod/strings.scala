package typings.materialTextfield.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialTextfield.materialTextfieldStrings.`Dotmdc-floating-label`
import typings.materialTextfield.materialTextfieldStrings.`Dotmdc-line-ripple`
import typings.materialTextfield.materialTextfieldStrings.`Dotmdc-notched-outline`
import typings.materialTextfield.materialTextfieldStrings.`Dotmdc-text-field__icon`
import typings.materialTextfield.materialTextfieldStrings.`Dotmdc-text-field__input`
import typings.materialTextfield.materialTextfieldStrings.`aria-controls`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ARIA_CONTROLS: `aria-controls`
  var ICON_SELECTOR: `Dotmdc-text-field__icon`
  var INPUT_SELECTOR: `Dotmdc-text-field__input`
  var LABEL_SELECTOR: `Dotmdc-floating-label`
  var LINE_RIPPLE_SELECTOR: `Dotmdc-line-ripple`
  var OUTLINE_SELECTOR: `Dotmdc-notched-outline`
}

object strings {
  @scala.inline
  def apply(
    ARIA_CONTROLS: `aria-controls`,
    ICON_SELECTOR: `Dotmdc-text-field__icon`,
    INPUT_SELECTOR: `Dotmdc-text-field__input`,
    LABEL_SELECTOR: `Dotmdc-floating-label`,
    LINE_RIPPLE_SELECTOR: `Dotmdc-line-ripple`,
    OUTLINE_SELECTOR: `Dotmdc-notched-outline`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_CONTROLS = ARIA_CONTROLS.asInstanceOf[js.Any], ICON_SELECTOR = ICON_SELECTOR.asInstanceOf[js.Any], INPUT_SELECTOR = INPUT_SELECTOR.asInstanceOf[js.Any], LABEL_SELECTOR = LABEL_SELECTOR.asInstanceOf[js.Any], LINE_RIPPLE_SELECTOR = LINE_RIPPLE_SELECTOR.asInstanceOf[js.Any], OUTLINE_SELECTOR = OUTLINE_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

