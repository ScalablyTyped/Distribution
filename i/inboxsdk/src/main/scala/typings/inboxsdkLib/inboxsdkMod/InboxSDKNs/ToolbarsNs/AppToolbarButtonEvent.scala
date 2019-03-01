package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ToolbarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppToolbarButtonEvent extends js.Object {
  var dropdown: inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.DropdownView
}

object AppToolbarButtonEvent {
  @scala.inline
  def apply(dropdown: inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.DropdownView): AppToolbarButtonEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dropdown")(dropdown)
    __obj.asInstanceOf[AppToolbarButtonEvent]
  }
}

