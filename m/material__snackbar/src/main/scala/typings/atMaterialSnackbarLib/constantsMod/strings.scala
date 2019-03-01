package typings
package atMaterialSnackbarLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var ACTION_BUTTON_SELECTOR: atMaterialSnackbarLib.atMaterialSnackbarLibStrings.`DOTmdc-snackbar__action-button`
  var ACTION_WRAPPER_SELECTOR: atMaterialSnackbarLib.atMaterialSnackbarLibStrings.`DOTmdc-snackbar__action-wrapper`
  var HIDE_EVENT: atMaterialSnackbarLib.atMaterialSnackbarLibStrings.`MDCSnackbar:hide`
  var SHOW_EVENT: atMaterialSnackbarLib.atMaterialSnackbarLibStrings.`MDCSnackbar:show`
  var TEXT_SELECTOR: atMaterialSnackbarLib.atMaterialSnackbarLibStrings.`DOTmdc-snackbar__text`
}

object strings {
  @scala.inline
  def apply(
    ACTION_BUTTON_SELECTOR: atMaterialSnackbarLib.atMaterialSnackbarLibStrings.`DOTmdc-snackbar__action-button`,
    ACTION_WRAPPER_SELECTOR: atMaterialSnackbarLib.atMaterialSnackbarLibStrings.`DOTmdc-snackbar__action-wrapper`,
    HIDE_EVENT: atMaterialSnackbarLib.atMaterialSnackbarLibStrings.`MDCSnackbar:hide`,
    SHOW_EVENT: atMaterialSnackbarLib.atMaterialSnackbarLibStrings.`MDCSnackbar:show`,
    TEXT_SELECTOR: atMaterialSnackbarLib.atMaterialSnackbarLibStrings.`DOTmdc-snackbar__text`
  ): strings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ACTION_BUTTON_SELECTOR")(ACTION_BUTTON_SELECTOR)
    __obj.updateDynamic("ACTION_WRAPPER_SELECTOR")(ACTION_WRAPPER_SELECTOR)
    __obj.updateDynamic("HIDE_EVENT")(HIDE_EVENT)
    __obj.updateDynamic("SHOW_EVENT")(SHOW_EVENT)
    __obj.updateDynamic("TEXT_SELECTOR")(TEXT_SELECTOR)
    __obj.asInstanceOf[strings]
  }
}

