package typings.atMaterialSnackbar.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialSnackbar.atMaterialSnackbarStrings.`DOTmdc-snackbar__action-button`
import typings.atMaterialSnackbar.atMaterialSnackbarStrings.`DOTmdc-snackbar__action-wrapper`
import typings.atMaterialSnackbar.atMaterialSnackbarStrings.`DOTmdc-snackbar__text`
import typings.atMaterialSnackbar.atMaterialSnackbarStrings.`MDCSnackbar:hide`
import typings.atMaterialSnackbar.atMaterialSnackbarStrings.`MDCSnackbar:show`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ACTION_BUTTON_SELECTOR: `DOTmdc-snackbar__action-button`
  var ACTION_WRAPPER_SELECTOR: `DOTmdc-snackbar__action-wrapper`
  var HIDE_EVENT: `MDCSnackbar:hide`
  var SHOW_EVENT: `MDCSnackbar:show`
  var TEXT_SELECTOR: `DOTmdc-snackbar__text`
}

object strings {
  @scala.inline
  def apply(
    ACTION_BUTTON_SELECTOR: `DOTmdc-snackbar__action-button`,
    ACTION_WRAPPER_SELECTOR: `DOTmdc-snackbar__action-wrapper`,
    HIDE_EVENT: `MDCSnackbar:hide`,
    SHOW_EVENT: `MDCSnackbar:show`,
    TEXT_SELECTOR: `DOTmdc-snackbar__text`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ACTION_BUTTON_SELECTOR = ACTION_BUTTON_SELECTOR.asInstanceOf[js.Any], ACTION_WRAPPER_SELECTOR = ACTION_WRAPPER_SELECTOR.asInstanceOf[js.Any], HIDE_EVENT = HIDE_EVENT.asInstanceOf[js.Any], SHOW_EVENT = SHOW_EVENT.asInstanceOf[js.Any], TEXT_SELECTOR = TEXT_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

