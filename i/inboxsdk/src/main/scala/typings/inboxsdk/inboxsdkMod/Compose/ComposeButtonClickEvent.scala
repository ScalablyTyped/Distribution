package typings.inboxsdk.inboxsdkMod.Compose

import typings.inboxsdk.inboxsdkMod.Common.DropdownView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeButtonClickEvent extends js.Object {
  var composeView: ComposeView
  var dropdown: DropdownView
}

object ComposeButtonClickEvent {
  @scala.inline
  def apply(composeView: ComposeView, dropdown: DropdownView): ComposeButtonClickEvent = {
    val __obj = js.Dynamic.literal(composeView = composeView.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComposeButtonClickEvent]
  }
}

