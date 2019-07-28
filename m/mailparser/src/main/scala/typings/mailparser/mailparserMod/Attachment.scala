package typings.mailparser.mailparserMod

import typings.mailparser.mailparserStrings.attachment
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attachment object.
  */
trait Attachment extends AttachmentCommon {
  /**
  	 * A Buffer that contains the attachment contents.
  	 */
  @JSName("content")
  var content_Attachment: Buffer
  /**
  	 * If true then this attachment should not be offered for download
  	 * (at least not in the main attachments list).
  	 */
  @JSName("related")
  var related_Attachment: Boolean
}

object Attachment {
  @scala.inline
  def apply(
    checksum: String,
    content: Buffer,
    contentDisposition: String,
    contentType: String,
    headers: Headers,
    related: Boolean,
    size: Double,
    `type`: attachment,
    cid: String = null,
    contentId: String = null,
    filename: String = null
  ): Attachment = {
    val __obj = js.Dynamic.literal(checksum = checksum, content = content, contentDisposition = contentDisposition, contentType = contentType, headers = headers, related = related, size = size)
    __obj.updateDynamic("type")(`type`)
    if (cid != null) __obj.updateDynamic("cid")(cid)
    if (contentId != null) __obj.updateDynamic("contentId")(contentId)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[Attachment]
  }
}

