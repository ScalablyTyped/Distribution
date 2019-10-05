package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxMessagesTools extends js.Object {
  var moveDown: js.UndefOr[String] = js.undefined
  var moveUp: js.UndefOr[String] = js.undefined
  var remove: js.UndefOr[String] = js.undefined
  var transferAllFrom: js.UndefOr[String] = js.undefined
  var transferAllTo: js.UndefOr[String] = js.undefined
  var transferFrom: js.UndefOr[String] = js.undefined
  var transferTo: js.UndefOr[String] = js.undefined
}

object ListBoxMessagesTools {
  @scala.inline
  def apply(
    moveDown: String = null,
    moveUp: String = null,
    remove: String = null,
    transferAllFrom: String = null,
    transferAllTo: String = null,
    transferFrom: String = null,
    transferTo: String = null
  ): ListBoxMessagesTools = {
    val __obj = js.Dynamic.literal()
    if (moveDown != null) __obj.updateDynamic("moveDown")(moveDown)
    if (moveUp != null) __obj.updateDynamic("moveUp")(moveUp)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (transferAllFrom != null) __obj.updateDynamic("transferAllFrom")(transferAllFrom)
    if (transferAllTo != null) __obj.updateDynamic("transferAllTo")(transferAllTo)
    if (transferFrom != null) __obj.updateDynamic("transferFrom")(transferFrom)
    if (transferTo != null) __obj.updateDynamic("transferTo")(transferTo)
    __obj.asInstanceOf[ListBoxMessagesTools]
  }
}

