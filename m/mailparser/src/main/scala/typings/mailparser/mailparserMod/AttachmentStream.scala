package typings.mailparser.mailparserMod

import typings.mailparser.mailparserStrings.attachment
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MailParser Attachment object.
  */
trait AttachmentStream extends AttachmentCommon {
  /**
  	 * A Buffer that contains the attachment contents.
  	 */
  @JSName("content")
  var content_AttachmentStream: Stream
  /**
  	 * Method must be called once you have processed the attachment.
  	 */
  def release(): Unit
}

object AttachmentStream {
  @scala.inline
  def apply(
    checksum: String,
    content: Stream,
    contentDisposition: String,
    contentType: String,
    headers: Headers,
    release: () => Unit,
    size: Double,
    `type`: attachment,
    cid: String = null,
    contentId: String = null,
    filename: String = null,
    related: js.UndefOr[Boolean] = js.undefined
  ): AttachmentStream = {
    val __obj = js.Dynamic.literal(checksum = checksum, content = content, contentDisposition = contentDisposition, contentType = contentType, headers = headers, release = js.Any.fromFunction0(release), size = size)
    __obj.updateDynamic("type")(`type`)
    if (cid != null) __obj.updateDynamic("cid")(cid)
    if (contentId != null) __obj.updateDynamic("contentId")(contentId)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(related)) __obj.updateDynamic("related")(related)
    __obj.asInstanceOf[AttachmentStream]
  }
}

