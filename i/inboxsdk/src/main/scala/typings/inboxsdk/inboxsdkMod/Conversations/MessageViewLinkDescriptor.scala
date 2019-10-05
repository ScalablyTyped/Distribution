package typings.inboxsdk.inboxsdkMod.Conversations

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
    val __obj = js.Dynamic.literal(element = element, href = href, html = html, isInQuotedArea = isInQuotedArea, text = text)
  
    __obj.asInstanceOf[MessageViewLinkDescriptor]
  }
}

