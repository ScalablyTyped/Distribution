package typings.mailgunJs.mod.messages

import typings.mailgunJs.mailgunJsStrings.False
import typings.mailgunJs.mailgunJsStrings.True
import typings.mailgunJs.mailgunJsStrings.false_
import typings.mailgunJs.mailgunJsStrings.htmlonly
import typings.mailgunJs.mailgunJsStrings.no
import typings.mailgunJs.mailgunJsStrings.true_
import typings.mailgunJs.mailgunJsStrings.yes
import typings.mailgunJs.mod.AttachmentData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchData extends SendData {
  var `recipient-variables`: js.UndefOr[BatchSendRecipientVars] = js.undefined
}

object BatchData {
  @scala.inline
  def apply(
    to: String | js.Array[String],
    `amp-html`: String = null,
    attachment: AttachmentData | js.Array[AttachmentData] = null,
    bcc: String | js.Array[String] = null,
    cc: String | js.Array[String] = null,
    from: String = null,
    hColonImportance: String = null,
    `hColonIn-Reply-To`: String = null,
    hColonReferences: String = null,
    `hColonReply-To`: String = null,
    html: String = null,
    `inline`: AttachmentData | js.Array[AttachmentData] = null,
    oColondeliverytime: String = null,
    oColondkim: yes | no | Boolean = null,
    `oColonrequire-tls`: yes | no | True | False = null,
    `oColonskip-verification`: yes | no | True | False = null,
    oColontag: String | js.Array[String] = null,
    oColontestmode: yes | no | true_ | false_ | True | False = null,
    oColontracking: yes | no | Boolean = null,
    `oColontracking-clicks`: yes | no | htmlonly | Boolean = null,
    `oColontracking-opens`: yes | no | Boolean = null,
    `recipient-variables`: BatchSendRecipientVars = null,
    subject: String = null,
    text: String = null
  ): BatchData = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (`amp-html` != null) __obj.updateDynamic("amp-html")(`amp-html`.asInstanceOf[js.Any])
    if (attachment != null) __obj.updateDynamic("attachment")(attachment.asInstanceOf[js.Any])
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (hColonImportance != null) __obj.updateDynamic("h:Importance")(hColonImportance.asInstanceOf[js.Any])
    if (`hColonIn-Reply-To` != null) __obj.updateDynamic("h:In-Reply-To")(`hColonIn-Reply-To`.asInstanceOf[js.Any])
    if (hColonReferences != null) __obj.updateDynamic("h:References")(hColonReferences.asInstanceOf[js.Any])
    if (`hColonReply-To` != null) __obj.updateDynamic("h:Reply-To")(`hColonReply-To`.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (oColondeliverytime != null) __obj.updateDynamic("o:deliverytime")(oColondeliverytime.asInstanceOf[js.Any])
    if (oColondkim != null) __obj.updateDynamic("o:dkim")(oColondkim.asInstanceOf[js.Any])
    if (`oColonrequire-tls` != null) __obj.updateDynamic("o:require-tls")(`oColonrequire-tls`.asInstanceOf[js.Any])
    if (`oColonskip-verification` != null) __obj.updateDynamic("o:skip-verification")(`oColonskip-verification`.asInstanceOf[js.Any])
    if (oColontag != null) __obj.updateDynamic("o:tag")(oColontag.asInstanceOf[js.Any])
    if (oColontestmode != null) __obj.updateDynamic("o:testmode")(oColontestmode.asInstanceOf[js.Any])
    if (oColontracking != null) __obj.updateDynamic("o:tracking")(oColontracking.asInstanceOf[js.Any])
    if (`oColontracking-clicks` != null) __obj.updateDynamic("o:tracking-clicks")(`oColontracking-clicks`.asInstanceOf[js.Any])
    if (`oColontracking-opens` != null) __obj.updateDynamic("o:tracking-opens")(`oColontracking-opens`.asInstanceOf[js.Any])
    if (`recipient-variables` != null) __obj.updateDynamic("recipient-variables")(`recipient-variables`.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchData]
  }
}

