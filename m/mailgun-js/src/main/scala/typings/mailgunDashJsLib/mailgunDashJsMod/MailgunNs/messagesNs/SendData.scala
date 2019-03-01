package typings
package mailgunDashJsLib.mailgunDashJsMod.MailgunNs.messagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendData extends js.Object {
  var attachment: js.UndefOr[
    mailgunDashJsLib.mailgunDashJsMod.MailgunNs.AttachmentData | js.Array[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.AttachmentData]
  ] = js.undefined
  var bcc: js.UndefOr[java.lang.String] = js.undefined
  var cc: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var html: js.UndefOr[java.lang.String] = js.undefined
  var `inline`: js.UndefOr[
    mailgunDashJsLib.mailgunDashJsMod.MailgunNs.AttachmentData | js.Array[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.AttachmentData]
  ] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var to: java.lang.String | js.Array[java.lang.String]
}

object SendData {
  @scala.inline
  def apply(
    to: java.lang.String | js.Array[java.lang.String],
    attachment: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.AttachmentData | js.Array[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.AttachmentData] = null,
    bcc: java.lang.String = null,
    cc: java.lang.String = null,
    from: java.lang.String = null,
    html: java.lang.String = null,
    `inline`: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.AttachmentData | js.Array[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.AttachmentData] = null,
    subject: java.lang.String = null,
    text: java.lang.String = null
  ): SendData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (attachment != null) __obj.updateDynamic("attachment")(attachment.asInstanceOf[js.Any])
    if (bcc != null) __obj.updateDynamic("bcc")(bcc)
    if (cc != null) __obj.updateDynamic("cc")(cc)
    if (from != null) __obj.updateDynamic("from")(from)
    if (html != null) __obj.updateDynamic("html")(html)
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[SendData]
  }
}

