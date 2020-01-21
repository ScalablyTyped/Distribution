package typings.materialSnackbar.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialSnackbar.materialSnackbarStrings.`mdc-snackbar--action-on-bottom`
import typings.materialSnackbar.materialSnackbarStrings.`mdc-snackbar--active`
import typings.materialSnackbar.materialSnackbarStrings.`mdc-snackbar--multiline`
import typings.materialSnackbar.materialSnackbarStrings.`mdc-snackbar__action-button`
import typings.materialSnackbar.materialSnackbarStrings.`mdc-snackbar__action-wrapper`
import typings.materialSnackbar.materialSnackbarStrings.`mdc-snackbar__text`
import typings.materialSnackbar.materialSnackbarStrings.`mdc-snackbar`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var ACTION_BUTTON: `mdc-snackbar__action-button`
  var ACTION_ON_BOTTOM: `mdc-snackbar--action-on-bottom`
  var ACTION_WRAPPER: `mdc-snackbar__action-wrapper`
  var ACTIVE: `mdc-snackbar--active`
  var MULTILINE: `mdc-snackbar--multiline`
  var ROOT: `mdc-snackbar`
  var TEXT: `mdc-snackbar__text`
}

object cssClasses {
  @scala.inline
  def apply(
    ACTION_BUTTON: `mdc-snackbar__action-button`,
    ACTION_ON_BOTTOM: `mdc-snackbar--action-on-bottom`,
    ACTION_WRAPPER: `mdc-snackbar__action-wrapper`,
    ACTIVE: `mdc-snackbar--active`,
    MULTILINE: `mdc-snackbar--multiline`,
    ROOT: `mdc-snackbar`,
    TEXT: `mdc-snackbar__text`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(ACTION_BUTTON = ACTION_BUTTON.asInstanceOf[js.Any], ACTION_ON_BOTTOM = ACTION_ON_BOTTOM.asInstanceOf[js.Any], ACTION_WRAPPER = ACTION_WRAPPER.asInstanceOf[js.Any], ACTIVE = ACTIVE.asInstanceOf[js.Any], MULTILINE = MULTILINE.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any], TEXT = TEXT.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

