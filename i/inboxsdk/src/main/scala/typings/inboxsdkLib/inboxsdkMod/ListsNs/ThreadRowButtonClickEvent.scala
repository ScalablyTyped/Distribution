package typings
package inboxsdkLib.inboxsdkMod.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowButtonClickEvent extends js.Object {
  var dropdown: js.UndefOr[inboxsdkLib.inboxsdkMod.CommonNs.DropdownView] = js.undefined
  var threadRowView: ThreadRowView
}

object ThreadRowButtonClickEvent {
  @scala.inline
  def apply(threadRowView: ThreadRowView, dropdown: inboxsdkLib.inboxsdkMod.CommonNs.DropdownView = null): ThreadRowButtonClickEvent = {
    val __obj = js.Dynamic.literal(threadRowView = threadRowView)
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown)
    __obj.asInstanceOf[ThreadRowButtonClickEvent]
  }
}

