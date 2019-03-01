package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowButtonClickEvent extends js.Object {
  var dropdown: js.UndefOr[inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.DropdownView] = js.undefined
  var threadRowView: ThreadRowView
}

object ThreadRowButtonClickEvent {
  @scala.inline
  def apply(
    threadRowView: ThreadRowView,
    dropdown: inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.DropdownView = null
  ): ThreadRowButtonClickEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("threadRowView")(threadRowView)
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown)
    __obj.asInstanceOf[ThreadRowButtonClickEvent]
  }
}

