package typings.mailparser.mailparserMod

import typings.mailparser.mailparserStrings.attachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * COmmon part of the Attachment object.
  */
trait AttachmentCommon extends js.Object {
  /**
  	 * A MD5 hash of the message content.
  	 */
  var checksum: String
  /**
  	 * `contentId` without `<` and `>`.
  	 */
  var cid: js.UndefOr[String] = js.undefined
  /**
  	 * Attachment contents.
  	 */
  var content: js.Any
  /**
  	 * Content disposition type for the attachment,
  	 * most probably `'attachment'`.
  	 */
  var contentDisposition: String
  /**
  	 * The header value from `Content-ID`.
  	 */
  var contentId: js.UndefOr[String] = js.undefined
  /**
  	 * MIME type of the message.
  	 */
  var contentType: String
  /**
  	 * File name of the attachment.
  	 */
  var filename: js.UndefOr[String] = js.undefined
  /**
  	 * An array of raw header lines for the attachment node.
  	 */
  var headerLines: HeaderLines
  /**
  	 * A Map value that holds MIME headers for the attachment node.
  	 */
  var headers: Headers
     // e.g. '5.1321281380971@localhost'
  /**
  	 * If true then this attachment should not be offered for download
  	 * (at least not in the main attachments list).
  	 */
  var related: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Message size in bytes.
  	 */
  var size: Double
  /**
  	 * Message type.
  	 */
  var `type`: attachment
}

object AttachmentCommon {
  @scala.inline
  def apply(
    checksum: String,
    content: js.Any,
    contentDisposition: String,
    contentType: String,
    headerLines: HeaderLines,
    headers: Headers,
    size: Double,
    `type`: attachment,
    cid: String = null,
    contentId: String = null,
    filename: String = null,
    related: js.UndefOr[Boolean] = js.undefined
  ): AttachmentCommon = {
    val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentDisposition = contentDisposition.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], headerLines = headerLines.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cid != null) __obj.updateDynamic("cid")(cid.asInstanceOf[js.Any])
    if (contentId != null) __obj.updateDynamic("contentId")(contentId.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(related)) __obj.updateDynamic("related")(related.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentCommon]
  }
}

