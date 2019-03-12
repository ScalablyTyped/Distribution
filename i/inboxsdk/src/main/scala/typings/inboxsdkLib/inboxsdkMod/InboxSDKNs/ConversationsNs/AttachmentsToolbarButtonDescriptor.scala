package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsToolbarButtonDescriptor extends js.Object {
  var iconUrl: java.lang.String
  var tooltip: java.lang.String
  def onClick(event: AttachmentsToolbarButtonEvent): scala.Unit
}

object AttachmentsToolbarButtonDescriptor {
  @scala.inline
  def apply(
    iconUrl: java.lang.String,
    onClick: AttachmentsToolbarButtonEvent => scala.Unit,
    tooltip: java.lang.String
  ): AttachmentsToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl, onClick = js.Any.fromFunction1(onClick), tooltip = tooltip)
  
    __obj.asInstanceOf[AttachmentsToolbarButtonDescriptor]
  }
}

