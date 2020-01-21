package typings.materialDialog.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialDialog.materialDialogStrings.`mdc-dialog--animating`
import typings.materialDialog.materialDialogStrings.`mdc-dialog--open`
import typings.materialDialog.materialDialogStrings.`mdc-dialog-scroll-lock`
import typings.materialDialog.materialDialogStrings.`mdc-dialog__backdrop`
import typings.materialDialog.materialDialogStrings.`mdc-dialog__footer__button--accept`
import typings.materialDialog.materialDialogStrings.`mdc-dialog__footer__button--cancel`
import typings.materialDialog.materialDialogStrings.`mdc-dialog`
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
    val __obj = js.Dynamic.literal(ACCEPT_BTN = ACCEPT_BTN.asInstanceOf[js.Any], ANIMATING = ANIMATING.asInstanceOf[js.Any], BACKDROP = BACKDROP.asInstanceOf[js.Any], CANCEL_BTN = CANCEL_BTN.asInstanceOf[js.Any], OPEN = OPEN.asInstanceOf[js.Any], ROOT = ROOT.asInstanceOf[js.Any], SCROLL_LOCK = SCROLL_LOCK.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

