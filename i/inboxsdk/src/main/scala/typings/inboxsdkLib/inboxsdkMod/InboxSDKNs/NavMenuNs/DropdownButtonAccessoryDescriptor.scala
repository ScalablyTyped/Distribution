package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.NavMenuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownButtonAccessoryDescriptor extends js.Object {
  var buttonBackgroundColor: java.lang.String
  var buttonForegroundColor: java.lang.String
  var `type`: inboxsdkLib.inboxsdkLibStrings.DROPDOWN_BUTTON
  def onClick(event: DropdownButtonClickEvent): scala.Unit
}

object DropdownButtonAccessoryDescriptor {
  @scala.inline
  def apply(
    buttonBackgroundColor: java.lang.String,
    buttonForegroundColor: java.lang.String,
    onClick: js.Function1[DropdownButtonClickEvent, scala.Unit],
    `type`: inboxsdkLib.inboxsdkLibStrings.DROPDOWN_BUTTON
  ): DropdownButtonAccessoryDescriptor = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("buttonBackgroundColor")(buttonBackgroundColor)
    __obj.updateDynamic("buttonForegroundColor")(buttonForegroundColor)
    __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[DropdownButtonAccessoryDescriptor]
  }
}

