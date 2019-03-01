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
    SELECTED_EVENT: atMaterialMenuLib.atMaterialMenuLibStrings.`MDCMenu:selected`
  ): strings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ARIA_DISABLED_ATTR")(ARIA_DISABLED_ATTR)
    __obj.updateDynamic("CANCEL_EVENT")(CANCEL_EVENT)
    __obj.updateDynamic("ITEMS_SELECTOR")(ITEMS_SELECTOR)
    __obj.updateDynamic("SELECTED_EVENT")(SELECTED_EVENT)
    __obj.asInstanceOf[strings]
  }
}

