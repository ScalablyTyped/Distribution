package typings
package atMaterialToolbarLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var CHANGE_EVENT: atMaterialToolbarLib.atMaterialToolbarLibStrings.`MDCToolbar:change`
  var FIRST_ROW_SELECTOR: atMaterialToolbarLib.atMaterialToolbarLibStrings.`DOTmdc-toolbar__row:first-child`
  var ICON_SELECTOR: atMaterialToolbarLib.atMaterialToolbarLibStrings.`DOTmdc-toolbar__icon`
  var TITLE_SELECTOR: atMaterialToolbarLib.atMaterialToolbarLibStrings.`DOTmdc-toolbar__title`
}

object strings {
  @scala.inline
  def apply(
    CHANGE_EVENT: atMaterialToolbarLib.atMaterialToolbarLibStrings.`MDCToolbar:change`,
    FIRST_ROW_SELECTOR: atMaterialToolbarLib.atMaterialToolbarLibStrings.`DOTmdc-toolbar__row:first-child`,
    ICON_SELECTOR: atMaterialToolbarLib.atMaterialToolbarLibStrings.`DOTmdc-toolbar__icon`,
    TITLE_SELECTOR: atMaterialToolbarLib.atMaterialToolbarLibStrings.`DOTmdc-toolbar__title`
  ): strings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CHANGE_EVENT")(CHANGE_EVENT)
    __obj.updateDynamic("FIRST_ROW_SELECTOR")(FIRST_ROW_SELECTOR)
    __obj.updateDynamic("ICON_SELECTOR")(ICON_SELECTOR)
    __obj.updateDynamic("TITLE_SELECTOR")(TITLE_SELECTOR)
    __obj.asInstanceOf[strings]
  }
}

