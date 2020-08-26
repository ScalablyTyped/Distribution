package typings.mailparser.mod

import typings.mailparser.anon.Key
import typings.mailparser.mailparserBooleans.`false`
import typings.mailparser.mailparserStrings.high
import typings.mailparser.mailparserStrings.low
import typings.mailparser.mailparserStrings.normal
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parsed mail object.
  */
@js.native
trait ParsedMail extends js.Object {
  /**
    * An array of attachments.
    */
  var attachments: js.Array[Attachment] = js.native
  /**
    * An address object for the `Bcc:` header (usually not present).
    */
  var bcc: js.UndefOr[AddressObject] = js.native
  /**
    * An address object for the `Cc:` header.
    */
  var cc: js.UndefOr[AddressObject] = js.native
  /**
    * A Date object for the `Date:` header.
    */
  var date: js.UndefOr[Date] = js.native
  /**
    * An address object for the `From:` header.
    */
  var from: js.UndefOr[AddressObject] = js.native
  /**
    * An array of raw header lines
    */
  var headerLines: HeaderLines = js.native
  /**
    * A Map object with lowercase header keys.
    *
    * - All address headers are converted into address objects.
    * - `references` is a string if only a single reference-id exists or an
    *    array if multiple ids exist.
    * - `date` value is a Date object.
    */
  var headers: Headers = js.native
  /**
    * The HTML body of the message.
    *
    * Sets to `false` when there is no HTML body.
    *
    * If the message included embedded images as cid: urls then these are all
    * replaced with base64 formatted data: URIs.
    */
  var html: String | `false` = js.native
  /**
    * The In-Reply-To value string.
    */
  var inReplyTo: js.UndefOr[String] = js.native
  /**
    * The Message-ID value string.
    */
  var messageId: js.UndefOr[String] = js.native
  /**
    * Priority of the e-mail.
    */
  var priority: js.UndefOr[normal | low | high] = js.native
  /**
    * An array of referenced Message-ID values.
    *
    * Not set if no reference values present.
    */
  var references: js.UndefOr[js.Array[String]] = js.native
  /**
    * An address object for the `Reply-To:` header.
    */
  var replyTo: js.UndefOr[AddressObject] = js.native
  /**
    * The subject line.
    */
  var subject: js.UndefOr[String] = js.native
  /**
    * The plaintext body of the message.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * The plaintext body of the message formatted as HTML.
    */
  var textAsHtml: js.UndefOr[String] = js.native
  /**
    * An address object for the `To:` header.
    */
  var to: js.UndefOr[AddressObject] = js.native
}

object ParsedMail {
  @scala.inline
  def apply(
    attachments: js.Array[Attachment],
    headerLines: HeaderLines,
    headers: Headers,
    html: String | `false`
  ): ParsedMail = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], headerLines = headerLines.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedMail]
  }
  @scala.inline
  implicit class ParsedMailOps[Self <: ParsedMail] (val x: Self) extends AnyVal {
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
    def setAttachmentsVarargs(value: Attachment*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[Attachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderLinesVarargs(value: Key*): Self = this.set("headerLines", js.Array(value :_*))
    @scala.inline
    def setHeaderLines(value: HeaderLines): Self = this.set("headerLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml(value: String | `false`): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setBcc(value: AddressObject): Self = this.set("bcc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBcc: Self = this.set("bcc", js.undefined)
    @scala.inline
    def setCc(value: AddressObject): Self = this.set("cc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCc: Self = this.set("cc", js.undefined)
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setFrom(value: AddressObject): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setInReplyTo(value: String): Self = this.set("inReplyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInReplyTo: Self = this.set("inReplyTo", js.undefined)
    @scala.inline
    def setMessageId(value: String): Self = this.set("messageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageId: Self = this.set("messageId", js.undefined)
    @scala.inline
    def setPriority(value: normal | low | high): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setReferencesVarargs(value: String*): Self = this.set("references", js.Array(value :_*))
    @scala.inline
    def setReferences(value: js.Array[String]): Self = this.set("references", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
    @scala.inline
    def setReplyTo(value: AddressObject): Self = this.set("replyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplyTo: Self = this.set("replyTo", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextAsHtml(value: String): Self = this.set("textAsHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAsHtml: Self = this.set("textAsHtml", js.undefined)
    @scala.inline
    def setTo(value: AddressObject): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

