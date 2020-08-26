package typings.mailparser.mod

import typings.mailparser.mailparserStrings.attachment
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MailParser Attachment object.
  */
@js.native
trait AttachmentStream extends AttachmentCommon {
  /**
    * A Buffer that contains the attachment contents.
    */
  @JSName("content")
  var content_AttachmentStream: Stream = js.native
  /**
    * Method must be called once you have processed the attachment.
    */
  def release(): Unit = js.native
}

object AttachmentStream {
  @scala.inline
  def apply(
    checksum: String,
    content: Stream,
    contentDisposition: String,
    contentType: String,
    headerLines: HeaderLines,
    headers: Headers,
    release: () => Unit,
    size: Double,
    `type`: attachment
  ): AttachmentStream = {
    val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentDisposition = contentDisposition.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], headerLines = headerLines.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], release = js.Any.fromFunction0(release), size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentStream]
  }
  @scala.inline
  implicit class AttachmentStreamOps[Self <: AttachmentStream] (val x: Self) extends AnyVal {
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
    def setContent(value: Stream): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelease(value: () => Unit): Self = this.set("release", js.Any.fromFunction0(value))
  }
  
}

