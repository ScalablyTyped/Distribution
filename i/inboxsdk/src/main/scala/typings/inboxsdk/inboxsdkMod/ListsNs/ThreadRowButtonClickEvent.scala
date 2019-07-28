package typings.inboxsdk.inboxsdkMod.ListsNs

import typings.inboxsdk.inboxsdkMod.CommonNs.DropdownView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowButtonClickEvent extends js.Object {
  var dropdown: js.UndefOr[DropdownView] = js.undefined
  var threadRowView: ThreadRowView
}

object ThreadRowButtonClickEvent {
  @scala.inline
  def apply(threadRowView: ThreadRowView, dropdown: DropdownView = null): ThreadRowButtonClickEvent = {
    val __obj = js.Dynamic.literal(threadRowView = threadRowView)
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown)
    __obj.asInstanceOf[ThreadRowButtonClickEvent]
  }
}

