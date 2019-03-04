package typings
package mailparserLib.mailparserMod

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
  var content_AttachmentStream: nodeLib.streamMod.Stream
  /**
  	 * Method must be called once you have processed the attachment.
  	 */
  def release(): scala.Unit
}

object AttachmentStream {
  @scala.inline
  def apply(
    checksum: java.lang.String,
    content: nodeLib.streamMod.Stream,
    contentDisposition: java.lang.String,
    contentType: java.lang.String,
    headers: Headers,
    release: js.Function0[scala.Unit],
    size: scala.Double,
    `type`: mailparserLib.mailparserLibStrings.attachment,
    cid: java.lang.String = null,
    contentId: java.lang.String = null,
    filename: java.lang.String = null,
    related: js.UndefOr[scala.Boolean] = js.undefined
  ): AttachmentStream = {
    val __obj = js.Dynamic.literal(checksum = checksum, content = content, contentDisposition = contentDisposition, contentType = contentType, headers = headers, release = release, size = size)
    __obj.updateDynamic("type")(`type`)
    if (cid != null) __obj.updateDynamic("cid")(cid)
    if (contentId != null) __obj.updateDynamic("contentId")(contentId)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(related)) __obj.updateDynamic("related")(related)
    __obj.asInstanceOf[AttachmentStream]
  }
}

