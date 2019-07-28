package typings.atMaterialChips.chipConstantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialChips.atMaterialChipsStrings.`DOTmdc-chip__checkmark`
import typings.atMaterialChips.atMaterialChipsStrings.`DOTmdc-chip__icon--leading`
import typings.atMaterialChips.atMaterialChipsStrings.`DOTmdc-chip__icon--trailing`
import typings.atMaterialChips.atMaterialChipsStrings.`MDCChip:interaction`
import typings.atMaterialChips.atMaterialChipsStrings.`MDCChip:removal`
import typings.atMaterialChips.atMaterialChipsStrings.`MDCChip:trailingIconInteraction`
import typings.atMaterialChips.atMaterialChipsStrings.`mdc-chip-entry`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var CHECKMARK_SELECTOR: `DOTmdc-chip__checkmark`
  var ENTRY_ANIMATION_NAME: `mdc-chip-entry`
  var INTERACTION_EVENT: `MDCChip:interaction`
  var LEADING_ICON_SELECTOR: `DOTmdc-chip__icon--leading`
  var REMOVAL_EVENT: `MDCChip:removal`
  var TRAILING_ICON_INTERACTION_EVENT: `MDCChip:trailingIconInteraction`
  var TRAILING_ICON_SELECTOR: `DOTmdc-chip__icon--trailing`
}

object strings {
  @scala.inline
  def apply(
    CHECKMARK_SELECTOR: `DOTmdc-chip__checkmark`,
    ENTRY_ANIMATION_NAME: `mdc-chip-entry`,
    INTERACTION_EVENT: `MDCChip:interaction`,
    LEADING_ICON_SELECTOR: `DOTmdc-chip__icon--leading`,
    REMOVAL_EVENT: `MDCChip:removal`,
    TRAILING_ICON_INTERACTION_EVENT: `MDCChip:trailingIconInteraction`,
    TRAILING_ICON_SELECTOR: `DOTmdc-chip__icon--trailing`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(CHECKMARK_SELECTOR = CHECKMARK_SELECTOR, ENTRY_ANIMATION_NAME = ENTRY_ANIMATION_NAME, INTERACTION_EVENT = INTERACTION_EVENT, LEADING_ICON_SELECTOR = LEADING_ICON_SELECTOR, REMOVAL_EVENT = REMOVAL_EVENT, TRAILING_ICON_INTERACTION_EVENT = TRAILING_ICON_INTERACTION_EVENT, TRAILING_ICON_SELECTOR = TRAILING_ICON_SELECTOR)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

