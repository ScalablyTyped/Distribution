package typings
package inboxsdkLib.inboxsdkMod.ComposeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeButtonClickEvent extends js.Object {
  var composeView: ComposeView
  var dropdown: inboxsdkLib.inboxsdkMod.CommonNs.DropdownView
}

object ComposeButtonClickEvent {
  @scala.inline
  def apply(composeView: ComposeView, dropdown: inboxsdkLib.inboxsdkMod.CommonNs.DropdownView): ComposeButtonClickEvent = {
    val __obj = js.Dynamic.literal(composeView = composeView, dropdown = dropdown)
  
    __obj.asInstanceOf[ComposeButtonClickEvent]
  }
}

