package typings.mailgunDashJs.mailgunDashJsMod.messages

import typings.mailgunDashJs.mailgunDashJsMod.AttachmentData
import typings.mailgunDashJs.mailgunDashJsStrings.False
import typings.mailgunDashJs.mailgunDashJsStrings.True
import typings.mailgunDashJs.mailgunDashJsStrings.htmlonly
import typings.mailgunDashJs.mailgunDashJsStrings.no
import typings.mailgunDashJs.mailgunDashJsStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendData extends js.Object {
  var `amp-html`: js.UndefOr[String] = js.undefined
  var attachment: js.UndefOr[AttachmentData | js.Array[AttachmentData]] = js.undefined
  var bcc: js.UndefOr[String | js.Array[String]] = js.undefined
  var cc: js.UndefOr[String | js.Array[String]] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var `h:Importance`: js.UndefOr[String] = js.undefined
  var `h:In-Reply-To`: js.UndefOr[String] = js.undefined
  var `h:References`: js.UndefOr[String] = js.undefined
  // Standard email headers
  var `h:Reply-To`: js.UndefOr[String] = js.undefined
  var html: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[AttachmentData | js.Array[AttachmentData]] = js.undefined
  var `o:deliverytime`: js.UndefOr[String] = js.undefined
  var `o:dkim`: js.UndefOr[yes | no | Boolean] = js.undefined
  var `o:require-tls`: js.UndefOr[yes | no | True | False] = js.undefined
  var `o:skip-verification`: js.UndefOr[yes | no | True | False] = js.undefined
  // Mailgun options
  var `o:tag`: js.UndefOr[String | js.Array[String]] = js.undefined
  var `o:tracking`: js.UndefOr[yes | no | Boolean] = js.undefined
  var `o:tracking-clicks`: js.UndefOr[yes | no | htmlonly | Boolean] = js.undefined
  var `o:tracking-opens`: js.UndefOr[yes | no | Boolean] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var to: String | js.Array[String]
}

object SendData {
  @scala.inline
  def apply(
    to: String | js.Array[String],
    `amp-html`: String = null,
    attachment: AttachmentData | js.Array[AttachmentData] = null,
    bcc: String | js.Array[String] = null,
    cc: String | js.Array[String] = null,
    from: String = null,
    `h:Importance`: String = null,
    `h:In-Reply-To`: String = null,
    `h:References`: String = null,
    `h:Reply-To`: String = null,
    html: String = null,
    `inline`: AttachmentData | js.Array[AttachmentData] = null,
    `o:deliverytime`: String = null,
    `o:dkim`: yes | no | Boolean = null,
    `o:require-tls`: yes | no | True | False = null,
    `o:skip-verification`: yes | no | True | False = null,
    `o:tag`: String | js.Array[String] = null,
    `o:tracking`: yes | no | Boolean = null,
    `o:tracking-clicks`: yes | no | htmlonly | Boolean = null,
    `o:tracking-opens`: yes | no | Boolean = null,
    subject: String = null,
    text: String = null
  ): SendData = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (`amp-html` != null) __obj.updateDynamic("amp-html")(`amp-html`.asInstanceOf[js.Any])
    if (attachment != null) __obj.updateDynamic("attachment")(attachment.asInstanceOf[js.Any])
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (`h:Importance` != null) __obj.updateDynamic("h:Importance")(`h:Importance`.asInstanceOf[js.Any])
    if (`h:In-Reply-To` != null) __obj.updateDynamic("h:In-Reply-To")(`h:In-Reply-To`.asInstanceOf[js.Any])
    if (`h:References` != null) __obj.updateDynamic("h:References")(`h:References`.asInstanceOf[js.Any])
    if (`h:Reply-To` != null) __obj.updateDynamic("h:Reply-To")(`h:Reply-To`.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (`o:deliverytime` != null) __obj.updateDynamic("o:deliverytime")(`o:deliverytime`.asInstanceOf[js.Any])
    if (`o:dkim` != null) __obj.updateDynamic("o:dkim")(`o:dkim`.asInstanceOf[js.Any])
    if (`o:require-tls` != null) __obj.updateDynamic("o:require-tls")(`o:require-tls`.asInstanceOf[js.Any])
    if (`o:skip-verification` != null) __obj.updateDynamic("o:skip-verification")(`o:skip-verification`.asInstanceOf[js.Any])
    if (`o:tag` != null) __obj.updateDynamic("o:tag")(`o:tag`.asInstanceOf[js.Any])
    if (`o:tracking` != null) __obj.updateDynamic("o:tracking")(`o:tracking`.asInstanceOf[js.Any])
    if (`o:tracking-clicks` != null) __obj.updateDynamic("o:tracking-clicks")(`o:tracking-clicks`.asInstanceOf[js.Any])
    if (`o:tracking-opens` != null) __obj.updateDynamic("o:tracking-opens")(`o:tracking-opens`.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendData]
  }
}

