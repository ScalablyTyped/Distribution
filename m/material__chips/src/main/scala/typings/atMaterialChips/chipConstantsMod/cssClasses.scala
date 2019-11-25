package typings.atMaterialChips.chipConstantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialChips.atMaterialChipsStrings.`mdc-chip--exit`
import typings.atMaterialChips.atMaterialChipsStrings.`mdc-chip--selected`
import typings.atMaterialChips.atMaterialChipsStrings.`mdc-chip__checkmark`
import typings.atMaterialChips.atMaterialChipsStrings.`mdc-chip__icon--leading-hidden`
import typings.atMaterialChips.atMaterialChipsStrings.`mdc-chip__icon--leading`
import typings.atMaterialChips.atMaterialChipsStrings.`mdc-chip__icon--trailing`
import typings.atMaterialChips.atMaterialChipsStrings.`mdc-chip__text`
import typings.atMaterialChips.atMaterialChipsStrings.`mdc-chip`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var CHECKMARK: `mdc-chip__checkmark`
  var CHIP: `mdc-chip`
  var CHIP_EXIT: `mdc-chip--exit`
  var HIDDEN_LEADING_ICON: `mdc-chip__icon--leading-hidden`
  var LEADING_ICON: `mdc-chip__icon--leading`
  var SELECTED: `mdc-chip--selected`
  var TEXT: `mdc-chip__text`
  var TRAILING_ICON: `mdc-chip__icon--trailing`
}

object cssClasses {
  @scala.inline
  def apply(
    CHECKMARK: `mdc-chip__checkmark`,
    CHIP: `mdc-chip`,
    CHIP_EXIT: `mdc-chip--exit`,
    HIDDEN_LEADING_ICON: `mdc-chip__icon--leading-hidden`,
    LEADING_ICON: `mdc-chip__icon--leading`,
    SELECTED: `mdc-chip--selected`,
    TEXT: `mdc-chip__text`,
    TRAILING_ICON: `mdc-chip__icon--trailing`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(CHECKMARK = CHECKMARK.asInstanceOf[js.Any], CHIP = CHIP.asInstanceOf[js.Any], CHIP_EXIT = CHIP_EXIT.asInstanceOf[js.Any], HIDDEN_LEADING_ICON = HIDDEN_LEADING_ICON.asInstanceOf[js.Any], LEADING_ICON = LEADING_ICON.asInstanceOf[js.Any], SELECTED = SELECTED.asInstanceOf[js.Any], TEXT = TEXT.asInstanceOf[js.Any], TRAILING_ICON = TRAILING_ICON.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

