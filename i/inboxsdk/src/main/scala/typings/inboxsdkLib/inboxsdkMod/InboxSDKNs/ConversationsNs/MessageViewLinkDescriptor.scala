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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("html")(html)
    __obj.updateDynamic("isInQuotedArea")(isInQuotedArea)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[MessageViewLinkDescriptor]
  }
}

