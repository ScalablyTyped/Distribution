package typings.atMaterialDialog.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialDialog.atMaterialDialogStrings.`DOTmdc-dialog--open`
import typings.atMaterialDialog.atMaterialDialogStrings.`DOTmdc-dialog__footer__button--accept`
import typings.atMaterialDialog.atMaterialDialogStrings.`DOTmdc-dialog__surface`
import typings.atMaterialDialog.atMaterialDialogStrings.`MDCDialog:accept`
import typings.atMaterialDialog.atMaterialDialogStrings.`MDCDialog:cancel`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ACCEPT_EVENT: `MDCDialog:accept`
  var ACCEPT_SELECTOR: `DOTmdc-dialog__footer__button--accept`
  var CANCEL_EVENT: `MDCDialog:cancel`
  var DIALOG_SURFACE_SELECTOR: `DOTmdc-dialog__surface`
  var OPEN_DIALOG_SELECTOR: `DOTmdc-dialog--open`
}

object strings {
  @scala.inline
  def apply(
    ACCEPT_EVENT: `MDCDialog:accept`,
    ACCEPT_SELECTOR: `DOTmdc-dialog__footer__button--accept`,
    CANCEL_EVENT: `MDCDialog:cancel`,
    DIALOG_SURFACE_SELECTOR: `DOTmdc-dialog__surface`,
    OPEN_DIALOG_SELECTOR: `DOTmdc-dialog--open`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ACCEPT_EVENT = ACCEPT_EVENT, ACCEPT_SELECTOR = ACCEPT_SELECTOR, CANCEL_EVENT = CANCEL_EVENT, DIALOG_SURFACE_SELECTOR = DIALOG_SURFACE_SELECTOR, OPEN_DIALOG_SELECTOR = OPEN_DIALOG_SELECTOR)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

