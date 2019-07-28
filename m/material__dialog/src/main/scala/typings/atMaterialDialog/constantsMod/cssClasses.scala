package typings.atMaterialDialog.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialDialog.atMaterialDialogStrings.`mdc-dialog--animating`
import typings.atMaterialDialog.atMaterialDialogStrings.`mdc-dialog--open`
import typings.atMaterialDialog.atMaterialDialogStrings.`mdc-dialog-scroll-lock`
import typings.atMaterialDialog.atMaterialDialogStrings.`mdc-dialog__backdrop`
import typings.atMaterialDialog.atMaterialDialogStrings.`mdc-dialog__footer__button--accept`
import typings.atMaterialDialog.atMaterialDialogStrings.`mdc-dialog__footer__button--cancel`
import typings.atMaterialDialog.atMaterialDialogStrings.`mdc-dialog`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var ACCEPT_BTN: `mdc-dialog__footer__button--accept`
  var ANIMATING: `mdc-dialog--animating`
  var BACKDROP: `mdc-dialog__backdrop`
  var CANCEL_BTN: `mdc-dialog__footer__button--cancel`
  var OPEN: `mdc-dialog--open`
  var ROOT: `mdc-dialog`
  var SCROLL_LOCK: `mdc-dialog-scroll-lock`
}

object cssClasses {
  @scala.inline
  def apply(
    ACCEPT_BTN: `mdc-dialog__footer__button--accept`,
    ANIMATING: `mdc-dialog--animating`,
    BACKDROP: `mdc-dialog__backdrop`,
    CANCEL_BTN: `mdc-dialog__footer__button--cancel`,
    OPEN: `mdc-dialog--open`,
    ROOT: `mdc-dialog`,
    SCROLL_LOCK: `mdc-dialog-scroll-lock`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(ACCEPT_BTN = ACCEPT_BTN, ANIMATING = ANIMATING, BACKDROP = BACKDROP, CANCEL_BTN = CANCEL_BTN, OPEN = OPEN, ROOT = ROOT, SCROLL_LOCK = SCROLL_LOCK)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

