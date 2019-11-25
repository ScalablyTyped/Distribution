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
    if (moveDown != null) __obj.updateDynamic("moveDown")(moveDown.asInstanceOf[js.Any])
    if (moveUp != null) __obj.updateDynamic("moveUp")(moveUp.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (transferAllFrom != null) __obj.updateDynamic("transferAllFrom")(transferAllFrom.asInstanceOf[js.Any])
    if (transferAllTo != null) __obj.updateDynamic("transferAllTo")(transferAllTo.asInstanceOf[js.Any])
    if (transferFrom != null) __obj.updateDynamic("transferFrom")(transferFrom.asInstanceOf[js.Any])
    if (transferTo != null) __obj.updateDynamic("transferTo")(transferTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBoxMessagesTools]
  }
}

