package typings
package mailparserLib.mailparserMod

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
  var content_Attachment: nodeLib.Buffer
  /**
  	 * If true then this attachment should not be offered for download
  	 * (at least not in the main attachments list).
  	 */
  @JSName("related")
  var related_Attachment: scala.Boolean
}

object Attachment {
  @scala.inline
  def apply(
    checksum: java.lang.String,
    content: nodeLib.Buffer,
    contentDisposition: java.lang.String,
    contentType: java.lang.String,
    headers: Headers,
    related: scala.Boolean,
    size: scala.Double,
    `type`: mailparserLib.mailparserLibStrings.attachment,
    cid: java.lang.String = null,
    contentId: java.lang.String = null,
    filename: java.lang.String = null
  ): Attachment = {
    val __obj = js.Dynamic.literal(checksum = checksum, content = content, contentDisposition = contentDisposition, contentType = contentType, headers = headers, related = related, size = size)
    __obj.updateDynamic("type")(`type`)
    if (cid != null) __obj.updateDynamic("cid")(cid)
    if (contentId != null) __obj.updateDynamic("contentId")(contentId)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[Attachment]
  }
}

