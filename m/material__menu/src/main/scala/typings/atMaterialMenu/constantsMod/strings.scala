package typings.atMaterialMenu.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialMenu.atMaterialMenuStrings.`DOTmdc-menu__items`
import typings.atMaterialMenu.atMaterialMenuStrings.`MDCMenu:cancel`
import typings.atMaterialMenu.atMaterialMenuStrings.`MDCMenu:selected`
import typings.atMaterialMenu.atMaterialMenuStrings.`aria-disabled`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ARIA_DISABLED_ATTR: `aria-disabled`
  var CANCEL_EVENT: `MDCMenu:cancel`
  var ITEMS_SELECTOR: `DOTmdc-menu__items`
  var SELECTED_EVENT: `MDCMenu:selected`
}

object strings {
  @scala.inline
  def apply(
    ARIA_DISABLED_ATTR: `aria-disabled`,
    CANCEL_EVENT: `MDCMenu:cancel`,
    ITEMS_SELECTOR: `DOTmdc-menu__items`,
    SELECTED_EVENT: `MDCMenu:selected`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_DISABLED_ATTR = ARIA_DISABLED_ATTR.asInstanceOf[js.Any], CANCEL_EVENT = CANCEL_EVENT.asInstanceOf[js.Any], ITEMS_SELECTOR = ITEMS_SELECTOR.asInstanceOf[js.Any], SELECTED_EVENT = SELECTED_EVENT.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

