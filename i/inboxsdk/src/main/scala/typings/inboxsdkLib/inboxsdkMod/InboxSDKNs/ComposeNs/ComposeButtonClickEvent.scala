package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ComposeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeButtonClickEvent extends js.Object {
  var composeView: ComposeView
  var dropdown: inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.DropdownView
}

object ComposeButtonClickEvent {
  @scala.inline
  def apply(composeView: ComposeView, dropdown: inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.DropdownView): ComposeButtonClickEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("composeView")(composeView)
    __obj.updateDynamic("dropdown")(dropdown)
    __obj.asInstanceOf[ComposeButtonClickEvent]
  }
}

