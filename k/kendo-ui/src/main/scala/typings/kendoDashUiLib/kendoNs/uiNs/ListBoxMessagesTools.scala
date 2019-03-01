package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxMessagesTools extends js.Object {
  var moveDown: js.UndefOr[java.lang.String] = js.undefined
  var moveUp: js.UndefOr[java.lang.String] = js.undefined
  var remove: js.UndefOr[java.lang.String] = js.undefined
  var transferAllFrom: js.UndefOr[java.lang.String] = js.undefined
  var transferAllTo: js.UndefOr[java.lang.String] = js.undefined
  var transferFrom: js.UndefOr[java.lang.String] = js.undefined
  var transferTo: js.UndefOr[java.lang.String] = js.undefined
}

object ListBoxMessagesTools {
  @scala.inline
  def apply(
    moveDown: java.lang.String = null,
    moveUp: java.lang.String = null,
    remove: java.lang.String = null,
    transferAllFrom: java.lang.String = null,
    transferAllTo: java.lang.String = null,
    transferFrom: java.lang.String = null,
    transferTo: java.lang.String = null
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

