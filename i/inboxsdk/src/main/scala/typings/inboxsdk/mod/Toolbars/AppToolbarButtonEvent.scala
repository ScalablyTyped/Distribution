package typings.inboxsdk.mod.Toolbars

import typings.inboxsdk.mod.Common.DropdownView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppToolbarButtonEvent extends js.Object {
  var dropdown: DropdownView
}

object AppToolbarButtonEvent {
  @scala.inline
  def apply(dropdown: DropdownView): AppToolbarButtonEvent = {
    val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppToolbarButtonEvent]
  }
}

