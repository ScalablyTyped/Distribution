package typings.inboxsdk.inboxsdkMod.ToolbarsNs

import typings.inboxsdk.inboxsdkMod.CommonNs.DropdownView
import typings.inboxsdk.inboxsdkMod.ConversationsNs.ThreadView
import typings.inboxsdk.inboxsdkMod.ListsNs.ThreadRowView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacyToolbarButtonEvent extends js.Object {
  var dropdown: js.UndefOr[DropdownView] = js.undefined
  var selectedThreadRowViews: js.Array[ThreadRowView]
  var threadRowViews: js.Array[ThreadRowView]
  var threadView: ThreadView
}

object LegacyToolbarButtonEvent {
  @scala.inline
  def apply(
    selectedThreadRowViews: js.Array[ThreadRowView],
    threadRowViews: js.Array[ThreadRowView],
    threadView: ThreadView,
    dropdown: DropdownView = null
  ): LegacyToolbarButtonEvent = {
    val __obj = js.Dynamic.literal(selectedThreadRowViews = selectedThreadRowViews, threadRowViews = threadRowViews, threadView = threadView)
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown)
    __obj.asInstanceOf[LegacyToolbarButtonEvent]
  }
}

