package typings
package atMaterialMenuLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var ARIA_DISABLED_ATTR: atMaterialMenuLib.atMaterialMenuLibStrings.`aria-disabled`
  var CANCEL_EVENT: atMaterialMenuLib.atMaterialMenuLibStrings.`MDCMenu:cancel`
  var ITEMS_SELECTOR: atMaterialMenuLib.atMaterialMenuLibStrings.`DOTmdc-menu__items`
  var SELECTED_EVENT: atMaterialMenuLib.atMaterialMenuLibStrings.`MDCMenu:selected`
}

object strings {
  @scala.inline
  def apply(
    ARIA_DISABLED_ATTR: atMaterialMenuLib.atMaterialMenuLibStrings.`aria-disabled`,
    CANCEL_EVENT: atMaterialMenuLib.atMaterialMenuLibStrings.`MDCMenu:cancel`,
    ITEMS_SELECTOR: atMaterialMenuLib.atMaterialMenuLibStrings.`DOTmdc-menu__items`,
    SELECTED_EVENT: atMaterialMenuLib.atMaterialMenuLibStrings.`MDCMenu:selected`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_DISABLED_ATTR = ARIA_DISABLED_ATTR, CANCEL_EVENT = CANCEL_EVENT, ITEMS_SELECTOR = ITEMS_SELECTOR, SELECTED_EVENT = SELECTED_EVENT)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

