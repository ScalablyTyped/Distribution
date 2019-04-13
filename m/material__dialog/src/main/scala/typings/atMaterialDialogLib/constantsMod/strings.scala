package typings
package atMaterialDialogLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var ACCEPT_EVENT: atMaterialDialogLib.atMaterialDialogLibStrings.`MDCDialog:accept`
  var ACCEPT_SELECTOR: atMaterialDialogLib.atMaterialDialogLibStrings.`DOTmdc-dialog__footer__button--accept`
  var CANCEL_EVENT: atMaterialDialogLib.atMaterialDialogLibStrings.`MDCDialog:cancel`
  var DIALOG_SURFACE_SELECTOR: atMaterialDialogLib.atMaterialDialogLibStrings.`DOTmdc-dialog__surface`
  var OPEN_DIALOG_SELECTOR: atMaterialDialogLib.atMaterialDialogLibStrings.`DOTmdc-dialog--open`
}

object strings {
  @scala.inline
  def apply(
    ACCEPT_EVENT: atMaterialDialogLib.atMaterialDialogLibStrings.`MDCDialog:accept`,
    ACCEPT_SELECTOR: atMaterialDialogLib.atMaterialDialogLibStrings.`DOTmdc-dialog__footer__button--accept`,
    CANCEL_EVENT: atMaterialDialogLib.atMaterialDialogLibStrings.`MDCDialog:cancel`,
    DIALOG_SURFACE_SELECTOR: atMaterialDialogLib.atMaterialDialogLibStrings.`DOTmdc-dialog__surface`,
    OPEN_DIALOG_SELECTOR: atMaterialDialogLib.atMaterialDialogLibStrings.`DOTmdc-dialog--open`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ACCEPT_EVENT = ACCEPT_EVENT, ACCEPT_SELECTOR = ACCEPT_SELECTOR, CANCEL_EVENT = CANCEL_EVENT, DIALOG_SURFACE_SELECTOR = DIALOG_SURFACE_SELECTOR, OPEN_DIALOG_SELECTOR = OPEN_DIALOG_SELECTOR)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

