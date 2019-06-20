package typings
package mailgunDashJsLib.mailgunDashJsMod.messagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendData extends js.Object {
  var `amp-html`: js.UndefOr[java.lang.String] = js.undefined
  var attachment: js.UndefOr[
    mailgunDashJsLib.mailgunDashJsMod.AttachmentData | js.Array[mailgunDashJsLib.mailgunDashJsMod.AttachmentData]
  ] = js.undefined
  var bcc: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var cc: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var `h:Importance`: js.UndefOr[java.lang.String] = js.undefined
  var `h:In-Reply-To`: js.UndefOr[java.lang.String] = js.undefined
  var `h:References`: js.UndefOr[java.lang.String] = js.undefined
  // Standard email headers
  var `h:Reply-To`: js.UndefOr[java.lang.String] = js.undefined
  var html: js.UndefOr[java.lang.String] = js.undefined
  var `inline`: js.UndefOr[
    mailgunDashJsLib.mailgunDashJsMod.AttachmentData | js.Array[mailgunDashJsLib.mailgunDashJsMod.AttachmentData]
  ] = js.undefined
  var `o:deliverytime`: js.UndefOr[java.lang.String] = js.undefined
  var `o:dkim`: js.UndefOr[
    mailgunDashJsLib.mailgunDashJsLibStrings.yes | mailgunDashJsLib.mailgunDashJsLibStrings.no | scala.Boolean
  ] = js.undefined
  var `o:require-tls`: js.UndefOr[
    mailgunDashJsLib.mailgunDashJsLibStrings.yes | mailgunDashJsLib.mailgunDashJsLibStrings.no | mailgunDashJsLib.mailgunDashJsLibStrings.True | mailgunDashJsLib.mailgunDashJsLibStrings.False
  ] = js.undefined
  var `o:skip-verification`: js.UndefOr[
    mailgunDashJsLib.mailgunDashJsLibStrings.yes | mailgunDashJsLib.mailgunDashJsLibStrings.no | mailgunDashJsLib.mailgunDashJsLibStrings.True | mailgunDashJsLib.mailgunDashJsLibStrings.False
  ] = js.undefined
  // Mailgun options
  var `o:tag`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `o:tracking`: js.UndefOr[
    mailgunDashJsLib.mailgunDashJsLibStrings.yes | mailgunDashJsLib.mailgunDashJsLibStrings.no | scala.Boolean
  ] = js.undefined
  var `o:tracking-clicks`: js.UndefOr[
    mailgunDashJsLib.mailgunDashJsLibStrings.yes | mailgunDashJsLib.mailgunDashJsLibStrings.no | mailgunDashJsLib.mailgunDashJsLibStrings.htmlonly | scala.Boolean
  ] = js.undefined
  var `o:tracking-opens`: js.UndefOr[
    mailgunDashJsLib.mailgunDashJsLibStrings.yes | mailgunDashJsLib.mailgunDashJsLibStrings.no | scala.Boolean
  ] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var to: java.lang.String | js.Array[java.lang.String]
}

object SendData {
  @scala.inline
  def apply(
    to: java.lang.String | js.Array[java.lang.String],
    `amp-html`: java.lang.String = null,
    attachment: mailgunDashJsLib.mailgunDashJsMod.AttachmentData | js.Array[mailgunDashJsLib.mailgunDashJsMod.AttachmentData] = null,
    bcc: java.lang.String | js.Array[java.lang.String] = null,
    cc: java.lang.String | js.Array[java.lang.String] = null,
    from: java.lang.String = null,
    `h:Importance`: java.lang.String = null,
    `h:In-Reply-To`: java.lang.String = null,
    `h:References`: java.lang.String = null,
    `h:Reply-To`: java.lang.String = null,
    html: java.lang.String = null,
    `inline`: mailgunDashJsLib.mailgunDashJsMod.AttachmentData | js.Array[mailgunDashJsLib.mailgunDashJsMod.AttachmentData] = null,
    `o:deliverytime`: java.lang.String = null,
    `o:dkim`: mailgunDashJsLib.mailgunDashJsLibStrings.yes | mailgunDashJsLib.mailgunDashJsLibStrings.no | scala.Boolean = null,
    `o:require-tls`: mailgunDashJsLib.mailgunDashJsLibStrings.yes | mailgunDashJsLib.mailgunDashJsLibStrings.no | mailgunDashJsLib.mailgunDashJsLibStrings.True | mailgunDashJsLib.mailgunDashJsLibStrings.False = null,
    `o:skip-verification`: mailgunDashJsLib.mailgunDashJsLibStrings.yes | mailgunDashJsLib.mailgunDashJsLibStrings.no | mailgunDashJsLib.mailgunDashJsLibStrings.True | mailgunDashJsLib.mailgunDashJsLibStrings.False = null,
    `o:tag`: js.Array[java.lang.String] = null,
    `o:tracking`: mailgunDashJsLib.mailgunDashJsLibStrings.yes | mailgunDashJsLib.mailgunDashJsLibStrings.no | scala.Boolean = null,
    `o:tracking-clicks`: mailgunDashJsLib.mailgunDashJsLibStrings.yes | mailgunDashJsLib.mailgunDashJsLibStrings.no | mailgunDashJsLib.mailgunDashJsLibStrings.htmlonly | scala.Boolean = null,
    `o:tracking-opens`: mailgunDashJsLib.mailgunDashJsLibStrings.yes | mailgunDashJsLib.mailgunDashJsLibStrings.no | scala.Boolean = null,
    subject: java.lang.String = null,
    text: java.lang.String = null
  ): SendData = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (`amp-html` != null) __obj.updateDynamic("amp-html")(`amp-html`)
    if (attachment != null) __obj.updateDynamic("attachment")(attachment.asInstanceOf[js.Any])
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from)
    if (`h:Importance` != null) __obj.updateDynamic("h:Importance")(`h:Importance`)
    if (`h:In-Reply-To` != null) __obj.updateDynamic("h:In-Reply-To")(`h:In-Reply-To`)
    if (`h:References` != null) __obj.updateDynamic("h:References")(`h:References`)
    if (`h:Reply-To` != null) __obj.updateDynamic("h:Reply-To")(`h:Reply-To`)
    if (html != null) __obj.updateDynamic("html")(html)
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (`o:deliverytime` != null) __obj.updateDynamic("o:deliverytime")(`o:deliverytime`)
    if (`o:dkim` != null) __obj.updateDynamic("o:dkim")(`o:dkim`.asInstanceOf[js.Any])
    if (`o:require-tls` != null) __obj.updateDynamic("o:require-tls")(`o:require-tls`.asInstanceOf[js.Any])
    if (`o:skip-verification` != null) __obj.updateDynamic("o:skip-verification")(`o:skip-verification`.asInstanceOf[js.Any])
    if (`o:tag` != null) __obj.updateDynamic("o:tag")(`o:tag`)
    if (`o:tracking` != null) __obj.updateDynamic("o:tracking")(`o:tracking`.asInstanceOf[js.Any])
    if (`o:tracking-clicks` != null) __obj.updateDynamic("o:tracking-clicks")(`o:tracking-clicks`.asInstanceOf[js.Any])
    if (`o:tracking-opens` != null) __obj.updateDynamic("o:tracking-opens")(`o:tracking-opens`.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[SendData]
  }
}

