package typings
package mailgunDashJsLib.mailgunDashJsMod.MailgunNs.messagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchData extends SendData {
  var `recipient-variables`: js.UndefOr[BatchSendRecipientVars] = js.undefined
}

object BatchData {
  @scala.inline
  def apply(
    to: java.lang.String | js.Array[java.lang.String],
    attachment: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.AttachmentData | js.Array[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.AttachmentData] = null,
    bcc: java.lang.String = null,
    cc: java.lang.String = null,
    from: java.lang.String = null,
    html: java.lang.String = null,
    `inline`: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.AttachmentData | js.Array[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.AttachmentData] = null,
    `recipient-variables`: BatchSendRecipientVars = null,
    subject: java.lang.String = null,
    text: java.lang.String = null
  ): BatchData = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (attachment != null) __obj.updateDynamic("attachment")(attachment.asInstanceOf[js.Any])
    if (bcc != null) __obj.updateDynamic("bcc")(bcc)
    if (cc != null) __obj.updateDynamic("cc")(cc)
    if (from != null) __obj.updateDynamic("from")(from)
    if (html != null) __obj.updateDynamic("html")(html)
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (`recipient-variables` != null) __obj.updateDynamic("recipient-variables")(`recipient-variables`)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[BatchData]
  }
}

