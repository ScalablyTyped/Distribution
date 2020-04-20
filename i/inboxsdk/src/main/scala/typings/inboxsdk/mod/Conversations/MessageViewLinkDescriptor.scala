package typings.inboxsdk.mod.Conversations

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageViewLinkDescriptor extends js.Object {
  var element: HTMLElement
  var href: String
  var html: String
  var isInQuotedArea: Boolean
  var text: String
}

object MessageViewLinkDescriptor {
  @scala.inline
  def apply(element: HTMLElement, href: String, html: String, isInQuotedArea: Boolean, text: String): MessageViewLinkDescriptor = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], isInQuotedArea = isInQuotedArea.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageViewLinkDescriptor]
  }
}

