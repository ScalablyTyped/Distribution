package typings.inboxsdk.inboxsdkMod.Toolbars

import typings.inboxsdk.inboxsdkMod.Common.DropdownView
import typings.inboxsdk.inboxsdkMod.Conversations.ThreadView
import typings.inboxsdk.inboxsdkMod.Lists.ThreadRowView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarButtonEvent extends js.Object {
  var dropdown: js.UndefOr[DropdownView] = js.undefined
  var position: ToolbarButtonPosition
  var selectedThreadRowViews: js.Array[ThreadRowView]
  var selectedThreadViews: js.Array[ThreadView]
}

object ToolbarButtonEvent {
  @scala.inline
  def apply(
    position: ToolbarButtonPosition,
    selectedThreadRowViews: js.Array[ThreadRowView],
    selectedThreadViews: js.Array[ThreadView],
    dropdown: DropdownView = null
  ): ToolbarButtonEvent = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], selectedThreadRowViews = selectedThreadRowViews.asInstanceOf[js.Any], selectedThreadViews = selectedThreadViews.asInstanceOf[js.Any])
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarButtonEvent]
  }
}

