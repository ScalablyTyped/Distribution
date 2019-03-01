package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionDropdownClickEvent extends js.Object {
  var dropdown: inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.DropdownView
}

object SectionDropdownClickEvent {
  @scala.inline
  def apply(dropdown: inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.DropdownView): SectionDropdownClickEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dropdown")(dropdown)
    __obj.asInstanceOf[SectionDropdownClickEvent]
  }
}

