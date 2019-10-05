package typings.inboxsdk.inboxsdkMod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomButtonDescriptor extends js.Object {
  var iconUrl: String
  var tooltip: String
  def onClick(event: AttachmentCardClickEvent): Unit
}

object CustomButtonDescriptor {
  @scala.inline
  def apply(iconUrl: String, onClick: AttachmentCardClickEvent => Unit, tooltip: String): CustomButtonDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl, onClick = js.Any.fromFunction1(onClick), tooltip = tooltip)
  
    __obj.asInstanceOf[CustomButtonDescriptor]
  }
}

