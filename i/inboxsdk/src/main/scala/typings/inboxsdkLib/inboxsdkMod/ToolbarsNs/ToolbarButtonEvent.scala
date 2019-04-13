package typings
package inboxsdkLib.inboxsdkMod.ToolbarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarButtonEvent extends js.Object {
  var dropdown: js.UndefOr[inboxsdkLib.inboxsdkMod.CommonNs.DropdownView] = js.undefined
  var position: ToolbarButtonPosition
  var selectedThreadRowViews: js.Array[inboxsdkLib.inboxsdkMod.ListsNs.ThreadRowView]
  var selectedThreadViews: js.Array[inboxsdkLib.inboxsdkMod.ConversationsNs.ThreadView]
}

object ToolbarButtonEvent {
  @scala.inline
  def apply(
    position: ToolbarButtonPosition,
    selectedThreadRowViews: js.Array[inboxsdkLib.inboxsdkMod.ListsNs.ThreadRowView],
    selectedThreadViews: js.Array[inboxsdkLib.inboxsdkMod.ConversationsNs.ThreadView],
    dropdown: inboxsdkLib.inboxsdkMod.CommonNs.DropdownView = null
  ): ToolbarButtonEvent = {
    val __obj = js.Dynamic.literal(position = position, selectedThreadRowViews = selectedThreadRowViews, selectedThreadViews = selectedThreadViews)
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown)
    __obj.asInstanceOf[ToolbarButtonEvent]
  }
}

