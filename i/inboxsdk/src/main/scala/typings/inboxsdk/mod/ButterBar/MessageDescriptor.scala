package typings.inboxsdk.mod.ButterBar

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.inboxsdk.mod.ButterBar.MessageDescriptorText
  - typings.inboxsdk.mod.ButterBar.MessageDescriptorHtml
  - typings.inboxsdk.mod.ButterBar.MessageDescriptorHtmlElement
*/
trait MessageDescriptor extends js.Object

object MessageDescriptor {
  @scala.inline
  def MessageDescriptorText(text: String): MessageDescriptor = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDescriptor]
  }
  @scala.inline
  def MessageDescriptorHtml(html: String): MessageDescriptor = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDescriptor]
  }
  @scala.inline
  def MessageDescriptorHtmlElement(el: HTMLElement): MessageDescriptor = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDescriptor]
  }
}

