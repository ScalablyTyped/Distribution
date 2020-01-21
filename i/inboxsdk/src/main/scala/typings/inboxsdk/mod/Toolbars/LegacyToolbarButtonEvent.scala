package typings.inboxsdk.mod.Toolbars

import typings.inboxsdk.mod.Common.DropdownView
import typings.inboxsdk.mod.Conversations.ThreadView
import typings.inboxsdk.mod.Lists.ThreadRowView
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
    val __obj = js.Dynamic.literal(selectedThreadRowViews = selectedThreadRowViews.asInstanceOf[js.Any], threadRowViews = threadRowViews.asInstanceOf[js.Any], threadView = threadView.asInstanceOf[js.Any])
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyToolbarButtonEvent]
  }
}

