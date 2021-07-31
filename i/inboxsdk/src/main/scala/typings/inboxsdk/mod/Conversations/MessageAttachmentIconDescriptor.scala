package typings.inboxsdk.mod.Conversations

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.inboxsdk.mod.Conversations.MessageAttachmentIconUrlDescriptor
  - typings.inboxsdk.mod.Conversations.MessageAttachmentIconHtmlDescriptor
*/
trait MessageAttachmentIconDescriptor extends StObject
object MessageAttachmentIconDescriptor {
  
  @scala.inline
  def MessageAttachmentIconHtmlDescriptor(iconHtml: String, tooltip: String | HTMLElement): typings.inboxsdk.mod.Conversations.MessageAttachmentIconHtmlDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.inboxsdk.mod.Conversations.MessageAttachmentIconHtmlDescriptor]
  }
  
  @scala.inline
  def MessageAttachmentIconUrlDescriptor(iconUrl: String, tooltip: String | HTMLElement): typings.inboxsdk.mod.Conversations.MessageAttachmentIconUrlDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.inboxsdk.mod.Conversations.MessageAttachmentIconUrlDescriptor]
  }
}
