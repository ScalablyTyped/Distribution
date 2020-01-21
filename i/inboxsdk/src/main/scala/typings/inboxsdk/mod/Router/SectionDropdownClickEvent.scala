package typings.inboxsdk.mod.Router

import typings.inboxsdk.mod.Common.DropdownView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionDropdownClickEvent extends js.Object {
  var dropdown: DropdownView
}

object SectionDropdownClickEvent {
  @scala.inline
  def apply(dropdown: DropdownView): SectionDropdownClickEvent = {
    val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SectionDropdownClickEvent]
  }
}

