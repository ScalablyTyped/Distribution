package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageViewLinkDescriptor extends js.Object {
  var element: stdLib.HTMLElement
  var href: java.lang.String
  var html: java.lang.String
  var isInQuotedArea: scala.Boolean
  var text: java.lang.String
}

object MessageViewLinkDescriptor {
  @scala.inline
  def apply(
    element: stdLib.HTMLElement,
    href: java.lang.String,
    html: java.lang.String,
    isInQuotedArea: scala.Boolean,
    text: java.lang.String
  ): MessageViewLinkDescriptor = {
    val __obj = js.Dynamic.literal(element = element, href = href, html = html, isInQuotedArea = isInQuotedArea, text = text)
  
    __obj.asInstanceOf[MessageViewLinkDescriptor]
  }
}

