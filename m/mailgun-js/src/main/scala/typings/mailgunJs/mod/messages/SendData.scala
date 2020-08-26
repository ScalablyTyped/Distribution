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

@js.native
trait SendData extends js.Object {
  var `amp-html`: js.UndefOr[String] = js.native
  var attachment: js.UndefOr[AttachmentData | js.Array[AttachmentData]] = js.native
  var bcc: js.UndefOr[String | js.Array[String]] = js.native
  var cc: js.UndefOr[String | js.Array[String]] = js.native
  var from: js.UndefOr[String] = js.native
  @JSName("h:Importance")
  var hColonImportance: js.UndefOr[String] = js.native
  @JSName("h:In-Reply-To")
  var `hColonIn-Reply-To`: js.UndefOr[String] = js.native
  @JSName("h:References")
  var hColonReferences: js.UndefOr[String] = js.native
  // Standard email headers
  @JSName("h:Reply-To")
  var `hColonReply-To`: js.UndefOr[String] = js.native
  var html: js.UndefOr[String] = js.native
  var `inline`: js.UndefOr[AttachmentData | js.Array[AttachmentData]] = js.native
  @JSName("o:deliverytime")
  var oColondeliverytime: js.UndefOr[String] = js.native
  @JSName("o:dkim")
  var oColondkim: js.UndefOr[yes | no | Boolean] = js.native
  @JSName("o:require-tls")
  var `oColonrequire-tls`: js.UndefOr[yes | no | True | False] = js.native
  @JSName("o:skip-verification")
  var `oColonskip-verification`: js.UndefOr[yes | no | True | False] = js.native
  @JSName("o:tag")
  var oColontag: js.UndefOr[String | js.Array[String]] = js.native
  // Mailgun options
  @JSName("o:testmode")
  var oColontestmode: js.UndefOr[yes | no | true_ | false_ | True | False] = js.native
  @JSName("o:tracking")
  var oColontracking: js.UndefOr[yes | no | Boolean] = js.native
  @JSName("o:tracking-clicks")
  var `oColontracking-clicks`: js.UndefOr[yes | no | htmlonly | Boolean] = js.native
  @JSName("o:tracking-opens")
  var `oColontracking-opens`: js.UndefOr[yes | no | Boolean] = js.native
  var subject: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  var to: String | js.Array[String] = js.native
}

object SendData {
  @scala.inline
  def apply(to: String | js.Array[String]): SendData = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendData]
  }
  @scala.inline
  implicit class SendDataOps[Self <: SendData] (val x: Self) extends AnyVal {
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
    def setToVarargs(value: String*): Self = this.set("to", js.Array(value :_*))
    @scala.inline
    def setTo(value: String | js.Array[String]): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def `setAmp-html`(value: String): Self = this.set("amp-html", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAmp-html`: Self = this.set("amp-html", js.undefined)
    @scala.inline
    def setAttachmentVarargs(value: AttachmentData*): Self = this.set("attachment", js.Array(value :_*))
    @scala.inline
    def setAttachment(value: AttachmentData | js.Array[AttachmentData]): Self = this.set("attachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachment: Self = this.set("attachment", js.undefined)
    @scala.inline
    def setBccVarargs(value: String*): Self = this.set("bcc", js.Array(value :_*))
    @scala.inline
    def setBcc(value: String | js.Array[String]): Self = this.set("bcc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBcc: Self = this.set("bcc", js.undefined)
    @scala.inline
    def setCcVarargs(value: String*): Self = this.set("cc", js.Array(value :_*))
    @scala.inline
    def setCc(value: String | js.Array[String]): Self = this.set("cc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCc: Self = this.set("cc", js.undefined)
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setHColonImportance(value: String): Self = this.set("h:Importance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHColonImportance: Self = this.set("h:Importance", js.undefined)
    @scala.inline
    def `setHColonIn-Reply-To`(value: String): Self = this.set("h:In-Reply-To", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHColonIn-Reply-To`: Self = this.set("h:In-Reply-To", js.undefined)
    @scala.inline
    def setHColonReferences(value: String): Self = this.set("h:References", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHColonReferences: Self = this.set("h:References", js.undefined)
    @scala.inline
    def `setHColonReply-To`(value: String): Self = this.set("h:Reply-To", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHColonReply-To`: Self = this.set("h:Reply-To", js.undefined)
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setInlineVarargs(value: AttachmentData*): Self = this.set("inline", js.Array(value :_*))
    @scala.inline
    def setInline(value: AttachmentData | js.Array[AttachmentData]): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setOColondeliverytime(value: String): Self = this.set("o:deliverytime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOColondeliverytime: Self = this.set("o:deliverytime", js.undefined)
    @scala.inline
    def setOColondkim(value: yes | no | Boolean): Self = this.set("o:dkim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOColondkim: Self = this.set("o:dkim", js.undefined)
    @scala.inline
    def `setOColonrequire-tls`(value: yes | no | True | False): Self = this.set("o:require-tls", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOColonrequire-tls`: Self = this.set("o:require-tls", js.undefined)
    @scala.inline
    def `setOColonskip-verification`(value: yes | no | True | False): Self = this.set("o:skip-verification", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOColonskip-verification`: Self = this.set("o:skip-verification", js.undefined)
    @scala.inline
    def setOColontagVarargs(value: String*): Self = this.set("o:tag", js.Array(value :_*))
    @scala.inline
    def setOColontag(value: String | js.Array[String]): Self = this.set("o:tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOColontag: Self = this.set("o:tag", js.undefined)
    @scala.inline
    def setOColontestmode(value: yes | no | true_ | false_ | True | False): Self = this.set("o:testmode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOColontestmode: Self = this.set("o:testmode", js.undefined)
    @scala.inline
    def setOColontracking(value: yes | no | Boolean): Self = this.set("o:tracking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOColontracking: Self = this.set("o:tracking", js.undefined)
    @scala.inline
    def `setOColontracking-clicks`(value: yes | no | htmlonly | Boolean): Self = this.set("o:tracking-clicks", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOColontracking-clicks`: Self = this.set("o:tracking-clicks", js.undefined)
    @scala.inline
    def `setOColontracking-opens`(value: yes | no | Boolean): Self = this.set("o:tracking-opens", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOColontracking-opens`: Self = this.set("o:tracking-opens", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

