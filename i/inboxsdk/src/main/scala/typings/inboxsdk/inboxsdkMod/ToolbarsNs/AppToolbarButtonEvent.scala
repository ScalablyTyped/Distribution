package typings.inboxsdk.inboxsdkMod.ToolbarsNs

import typings.inboxsdk.inboxsdkMod.CommonNs.DropdownView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppToolbarButtonEvent extends js.Object {
  var dropdown: DropdownView
}

object AppToolbarButtonEvent {
  @scala.inline
  def apply(dropdown: DropdownView): AppToolbarButtonEvent = {
    val __obj = js.Dynamic.literal(dropdown = dropdown)
  
    __obj.asInstanceOf[AppToolbarButtonEvent]
  }
}

