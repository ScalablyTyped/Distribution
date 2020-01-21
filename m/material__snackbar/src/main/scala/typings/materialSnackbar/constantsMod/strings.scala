package typings.materialSnackbar.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialSnackbar.materialSnackbarStrings.MDCSnackbarColonhide
import typings.materialSnackbar.materialSnackbarStrings.MDCSnackbarColonshow
import typings.materialSnackbar.materialSnackbarStrings.`Dotmdc-snackbar__action-button`
import typings.materialSnackbar.materialSnackbarStrings.`Dotmdc-snackbar__action-wrapper`
import typings.materialSnackbar.materialSnackbarStrings.`Dotmdc-snackbar__text`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ACTION_BUTTON_SELECTOR: `Dotmdc-snackbar__action-button`
  var ACTION_WRAPPER_SELECTOR: `Dotmdc-snackbar__action-wrapper`
  var HIDE_EVENT: MDCSnackbarColonhide
  var SHOW_EVENT: MDCSnackbarColonshow
  var TEXT_SELECTOR: `Dotmdc-snackbar__text`
}

object strings {
  @scala.inline
  def apply(
    ACTION_BUTTON_SELECTOR: `Dotmdc-snackbar__action-button`,
    ACTION_WRAPPER_SELECTOR: `Dotmdc-snackbar__action-wrapper`,
    HIDE_EVENT: MDCSnackbarColonhide,
    SHOW_EVENT: MDCSnackbarColonshow,
    TEXT_SELECTOR: `Dotmdc-snackbar__text`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ACTION_BUTTON_SELECTOR = ACTION_BUTTON_SELECTOR.asInstanceOf[js.Any], ACTION_WRAPPER_SELECTOR = ACTION_WRAPPER_SELECTOR.asInstanceOf[js.Any], HIDE_EVENT = HIDE_EVENT.asInstanceOf[js.Any], SHOW_EVENT = SHOW_EVENT.asInstanceOf[js.Any], TEXT_SELECTOR = TEXT_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

