package typings.atMaterialToolbar.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialToolbar.atMaterialToolbarStrings.`DOTmdc-toolbar__icon`
import typings.atMaterialToolbar.atMaterialToolbarStrings.`DOTmdc-toolbar__row:first-child`
import typings.atMaterialToolbar.atMaterialToolbarStrings.`DOTmdc-toolbar__title`
import typings.atMaterialToolbar.atMaterialToolbarStrings.`MDCToolbar:change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var CHANGE_EVENT: `MDCToolbar:change`
  var FIRST_ROW_SELECTOR: `DOTmdc-toolbar__row:first-child`
  var ICON_SELECTOR: `DOTmdc-toolbar__icon`
  var TITLE_SELECTOR: `DOTmdc-toolbar__title`
}

object strings {
  @scala.inline
  def apply(
    CHANGE_EVENT: `MDCToolbar:change`,
    FIRST_ROW_SELECTOR: `DOTmdc-toolbar__row:first-child`,
    ICON_SELECTOR: `DOTmdc-toolbar__icon`,
    TITLE_SELECTOR: `DOTmdc-toolbar__title`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(CHANGE_EVENT = CHANGE_EVENT, FIRST_ROW_SELECTOR = FIRST_ROW_SELECTOR, ICON_SELECTOR = ICON_SELECTOR, TITLE_SELECTOR = TITLE_SELECTOR)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

