package typings.inboxsdk.mod.Conversations

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.inboxsdk.mod.Conversations.MessageAttachmentIconUrlDescriptor
  - typings.inboxsdk.mod.Conversations.MessageAttachmentIconHtmlDescriptor
*/
trait MessageAttachmentIconDescriptor extends js.Object

object MessageAttachmentIconDescriptor {
  @scala.inline
  def MessageAttachmentIconUrlDescriptor(iconUrl: String, tooltip: String | HTMLElement): MessageAttachmentIconDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAttachmentIconDescriptor]
  }
  @scala.inline
  def MessageAttachmentIconHtmlDescriptor(iconHtml: String, tooltip: String | HTMLElement): MessageAttachmentIconDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAttachmentIconDescriptor]
  }
}

