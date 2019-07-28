package typings.atMaterialSnackbar.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialSnackbar.atMaterialSnackbarStrings.`mdc-snackbar--action-on-bottom`
import typings.atMaterialSnackbar.atMaterialSnackbarStrings.`mdc-snackbar--active`
import typings.atMaterialSnackbar.atMaterialSnackbarStrings.`mdc-snackbar--multiline`
import typings.atMaterialSnackbar.atMaterialSnackbarStrings.`mdc-snackbar__action-button`
import typings.atMaterialSnackbar.atMaterialSnackbarStrings.`mdc-snackbar__action-wrapper`
import typings.atMaterialSnackbar.atMaterialSnackbarStrings.`mdc-snackbar__text`
import typings.atMaterialSnackbar.atMaterialSnackbarStrings.`mdc-snackbar`
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
    val __obj = js.Dynamic.literal(ACTION_BUTTON = ACTION_BUTTON, ACTION_ON_BOTTOM = ACTION_ON_BOTTOM, ACTION_WRAPPER = ACTION_WRAPPER, ACTIVE = ACTIVE, MULTILINE = MULTILINE, ROOT = ROOT, TEXT = TEXT)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

