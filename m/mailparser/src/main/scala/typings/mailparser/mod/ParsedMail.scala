package typings.mailparser.mod

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
trait ParsedMail extends js.Object {
  /**
    * An array of attachments.
    */
  var attachments: js.Array[Attachment]
  /**
    * An address object for the `Bcc:` header (usually not present).
    */
  var bcc: js.UndefOr[AddressObject] = js.undefined
  /**
    * An address object for the `Cc:` header.
    */
  var cc: js.UndefOr[AddressObject] = js.undefined
  /**
    * A Date object for the `Date:` header.
    */
  var date: js.UndefOr[Date] = js.undefined
  /**
    * An address object for the `From:` header.
    */
  var from: js.UndefOr[AddressObject] = js.undefined
  /**
    * An array of raw header lines
    */
  var headerLines: HeaderLines
  /**
    * A Map object with lowercase header keys.
    *
    * - All address headers are converted into address objects.
    * - `references` is a string if only a single reference-id exists or an
    *    array if multiple ids exist.
    * - `date` value is a Date object.
    */
  var headers: Headers
  /**
    * The HTML body of the message.
    *
    * Sets to `false` when there is no HTML body.
    *
    * If the message included embedded images as cid: urls then these are all
    * replaced with base64 formatted data: URIs.
    */
  var html: String | `false`
  /**
    * The In-Reply-To value string.
    */
  var inReplyTo: js.UndefOr[String] = js.undefined
  /**
    * The Message-ID value string.
    */
  var messageId: js.UndefOr[String] = js.undefined
  /**
    * Priority of the e-mail.
    */
  var priority: js.UndefOr[normal | low | high] = js.undefined
  /**
    * An array of referenced Message-ID values.
    *
    * Not set if no reference values present.
    */
  var references: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An address object for the `Reply-To:` header.
    */
  var replyTo: js.UndefOr[AddressObject] = js.undefined
  /**
    * The subject line.
    */
  var subject: js.UndefOr[String] = js.undefined
  /**
    * The plaintext body of the message.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * The plaintext body of the message formatted as HTML.
    */
  var textAsHtml: js.UndefOr[String] = js.undefined
  /**
    * An address object for the `To:` header.
    */
  var to: js.UndefOr[AddressObject] = js.undefined
}

object ParsedMail {
  @scala.inline
  def apply(
    attachments: js.Array[Attachment],
    headerLines: HeaderLines,
    headers: Headers,
    html: String | `false`,
    bcc: AddressObject = null,
    cc: AddressObject = null,
    date: Date = null,
    from: AddressObject = null,
    inReplyTo: String = null,
    messageId: String = null,
    priority: normal | low | high = null,
    references: js.Array[String] = null,
    replyTo: AddressObject = null,
    subject: String = null,
    text: String = null,
    textAsHtml: String = null,
    to: AddressObject = null
  ): ParsedMail = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], headerLines = headerLines.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (inReplyTo != null) __obj.updateDynamic("inReplyTo")(inReplyTo.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAsHtml != null) __obj.updateDynamic("textAsHtml")(textAsHtml.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedMail]
  }
}

