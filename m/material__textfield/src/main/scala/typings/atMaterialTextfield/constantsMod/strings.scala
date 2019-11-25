package typings.atMaterialTextfield.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialTextfield.atMaterialTextfieldStrings.`DOTmdc-floating-label`
import typings.atMaterialTextfield.atMaterialTextfieldStrings.`DOTmdc-line-ripple`
import typings.atMaterialTextfield.atMaterialTextfieldStrings.`DOTmdc-notched-outline`
import typings.atMaterialTextfield.atMaterialTextfieldStrings.`DOTmdc-text-field__icon`
import typings.atMaterialTextfield.atMaterialTextfieldStrings.`DOTmdc-text-field__input`
import typings.atMaterialTextfield.atMaterialTextfieldStrings.`aria-controls`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ARIA_CONTROLS: `aria-controls`
  var ICON_SELECTOR: `DOTmdc-text-field__icon`
  var INPUT_SELECTOR: `DOTmdc-text-field__input`
  var LABEL_SELECTOR: `DOTmdc-floating-label`
  var LINE_RIPPLE_SELECTOR: `DOTmdc-line-ripple`
  var OUTLINE_SELECTOR: `DOTmdc-notched-outline`
}

object strings {
  @scala.inline
  def apply(
    ARIA_CONTROLS: `aria-controls`,
    ICON_SELECTOR: `DOTmdc-text-field__icon`,
    INPUT_SELECTOR: `DOTmdc-text-field__input`,
    LABEL_SELECTOR: `DOTmdc-floating-label`,
    LINE_RIPPLE_SELECTOR: `DOTmdc-line-ripple`,
    OUTLINE_SELECTOR: `DOTmdc-notched-outline`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_CONTROLS = ARIA_CONTROLS.asInstanceOf[js.Any], ICON_SELECTOR = ICON_SELECTOR.asInstanceOf[js.Any], INPUT_SELECTOR = INPUT_SELECTOR.asInstanceOf[js.Any], LABEL_SELECTOR = LABEL_SELECTOR.asInstanceOf[js.Any], LINE_RIPPLE_SELECTOR = LINE_RIPPLE_SELECTOR.asInstanceOf[js.Any], OUTLINE_SELECTOR = OUTLINE_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

