package typings
package mailparserLib.mailparserMod

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
  var checksum: java.lang.String
  /**
  	 * `contentId` without `<` and `>`.
  	 */
  var cid: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Attachment contents.
  	 */
  var content: js.Any
  /**
  	 * Content disposition type for the attachment,
  	 * most probably `'attachment'`.
  	 */
  var contentDisposition: java.lang.String
  /**
  	 * The header value from `Content-ID`.
  	 */
  var contentId: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * MIME type of the message.
  	 */
  var contentType: java.lang.String
  /**
  	 * File name of the attachment.
  	 */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A Map value that holds MIME headers for the attachment node.
  	 */
  var headers: Headers
     // e.g. '5.1321281380971@localhost'
  /**
  	 * If true then this attachment should not be offered for download
  	 * (at least not in the main attachments list).
  	 */
  var related: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Message size in bytes.
  	 */
  var size: scala.Double
  /**
  	 * Message type.
  	 */
  var `type`: mailparserLib.mailparserLibStrings.attachment
}

object AttachmentCommon {
  @scala.inline
  def apply(
    checksum: java.lang.String,
    content: js.Any,
    contentDisposition: java.lang.String,
    contentType: java.lang.String,
    headers: Headers,
    size: scala.Double,
    `type`: mailparserLib.mailparserLibStrings.attachment,
    cid: java.lang.String = null,
    contentId: java.lang.String = null,
    filename: java.lang.String = null,
    related: js.UndefOr[scala.Boolean] = js.undefined
  ): AttachmentCommon = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("checksum")(checksum)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("contentDisposition")(contentDisposition)
    __obj.updateDynamic("contentType")(contentType)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("size")(size)
    if (cid != null) __obj.updateDynamic("cid")(cid)
    if (contentId != null) __obj.updateDynamic("contentId")(contentId)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(related)) __obj.updateDynamic("related")(related)
    __obj.asInstanceOf[AttachmentCommon]
  }
}

