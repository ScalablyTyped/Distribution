package typings.inboxsdk.mod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.inboxsdk.mod.Lists.ThreadRowAttachmentIconUrlDescriptor
  - typings.inboxsdk.mod.Lists.ThreadRowAttachmentIconHtmlDescriptor
*/
trait ThreadRowAttachmentIconDescriptor extends js.Object

object ThreadRowAttachmentIconDescriptor {
  @scala.inline
  def ThreadRowAttachmentIconUrlDescriptor(iconUrl: String): ThreadRowAttachmentIconDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowAttachmentIconDescriptor]
  }
  @scala.inline
  def ThreadRowAttachmentIconHtmlDescriptor(iconHtml: String): ThreadRowAttachmentIconDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowAttachmentIconDescriptor]
  }
}

