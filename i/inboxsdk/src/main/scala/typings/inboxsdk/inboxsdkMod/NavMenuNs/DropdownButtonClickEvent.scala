package typings.inboxsdk.inboxsdkMod.NavMenuNs

import typings.inboxsdk.inboxsdkMod.CommonNs.DropdownView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownButtonClickEvent extends js.Object {
  var dropdown: DropdownView
}

object DropdownButtonClickEvent {
  @scala.inline
  def apply(dropdown: DropdownView): DropdownButtonClickEvent = {
    val __obj = js.Dynamic.literal(dropdown = dropdown)
  
    __obj.asInstanceOf[DropdownButtonClickEvent]
  }
}

