package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomButtonDescriptor extends js.Object {
  var iconUrl: java.lang.String
  var tooltip: java.lang.String
  def onClick(event: AttachmentCardClickEvent): scala.Unit
}

object CustomButtonDescriptor {
  @scala.inline
  def apply(
    iconUrl: java.lang.String,
    onClick: js.Function1[AttachmentCardClickEvent, scala.Unit],
    tooltip: java.lang.String
  ): CustomButtonDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iconUrl")(iconUrl)
    __obj.updateDynamic("onClick")(onClick)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[CustomButtonDescriptor]
  }
}

