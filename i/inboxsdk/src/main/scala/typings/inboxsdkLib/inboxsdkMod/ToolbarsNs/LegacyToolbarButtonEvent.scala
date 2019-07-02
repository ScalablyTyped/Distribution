package typings
package inboxsdkLib.inboxsdkMod.ToolbarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacyToolbarButtonEvent extends js.Object {
  var dropdown: js.UndefOr[inboxsdkLib.inboxsdkMod.CommonNs.DropdownView] = js.undefined
  var selectedThreadRowViews: js.Array[inboxsdkLib.inboxsdkMod.ListsNs.ThreadRowView]
  var threadRowViews: js.Array[inboxsdkLib.inboxsdkMod.ListsNs.ThreadRowView]
  var threadView: inboxsdkLib.inboxsdkMod.ConversationsNs.ThreadView
}

object LegacyToolbarButtonEvent {
  @scala.inline
  def apply(
    selectedThreadRowViews: js.Array[inboxsdkLib.inboxsdkMod.ListsNs.ThreadRowView],
    threadRowViews: js.Array[inboxsdkLib.inboxsdkMod.ListsNs.ThreadRowView],
    threadView: inboxsdkLib.inboxsdkMod.ConversationsNs.ThreadView,
    dropdown: inboxsdkLib.inboxsdkMod.CommonNs.DropdownView = null
  ): LegacyToolbarButtonEvent = {
    val __obj = js.Dynamic.literal(selectedThreadRowViews = selectedThreadRowViews, threadRowViews = threadRowViews, threadView = threadView)
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown)
    __obj.asInstanceOf[LegacyToolbarButtonEvent]
  }
}

