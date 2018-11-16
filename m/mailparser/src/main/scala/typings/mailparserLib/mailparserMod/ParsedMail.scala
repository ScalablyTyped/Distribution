package typings
package mailparserLib.mailparserMod

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
  var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
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
  var date: js.UndefOr[stdLib.Date] = js.undefined
  /**
  	 * An address object for the `From:` header.
  	 */
  var from: AddressObject
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
  var html: java.lang.String | scala.Boolean
  /**
  	 * The In-Reply-To value string.
  	 */
  var inReplyTo: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The Message-ID value string.
  	 */
  var messageId: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Priority of the e-mail.
  	 */
  var priority: js.UndefOr[
    mailparserLib.mailparserLibStrings.normal | mailparserLib.mailparserLibStrings.low | mailparserLib.mailparserLibStrings.high
  ] = js.undefined
  /**
  	 * An array of referenced Message-ID values.
  	 *
  	 * Not set if no reference values present.
  	 */
  var references: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  	 * An address object for the `Reply-To:` header.
  	 */
  var replyTo: js.UndefOr[AddressObject] = js.undefined
  /**
  	 * The subject line.
  	 */
  var subject: java.lang.String
  /**
  	 * The plaintext body of the message.
  	 */
  var text: java.lang.String
  /**
  	 * The plaintext body of the message formatted as HTML.
  	 */
  var textAsHtml: java.lang.String
  /**
  	 * An address object for the `To:` header.
  	 */
  var to: AddressObject
}

