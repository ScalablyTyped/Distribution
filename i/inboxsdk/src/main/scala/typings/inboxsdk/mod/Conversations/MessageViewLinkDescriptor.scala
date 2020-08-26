package typings.inboxsdk.mod.Conversations

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageViewLinkDescriptor extends js.Object {
  var element: HTMLElement = js.native
  var href: String = js.native
  var html: String = js.native
  var isInQuotedArea: Boolean = js.native
  var text: String = js.native
}

object MessageViewLinkDescriptor {
  @scala.inline
  def apply(element: HTMLElement, href: String, html: String, isInQuotedArea: Boolean, text: String): MessageViewLinkDescriptor = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], isInQuotedArea = isInQuotedArea.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageViewLinkDescriptor]
  }
  @scala.inline
  implicit class MessageViewLinkDescriptorOps[Self <: MessageViewLinkDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsInQuotedArea(value: Boolean): Self = this.set("isInQuotedArea", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

