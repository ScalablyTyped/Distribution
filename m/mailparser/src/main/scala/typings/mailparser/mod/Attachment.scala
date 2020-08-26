package typings.mailparser.mod

import typings.mailparser.mailparserStrings.attachment
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attachment object.
  */
@js.native
trait Attachment extends AttachmentCommon {
  /**
    * A Buffer that contains the attachment contents.
    */
  @JSName("content")
  var content_Attachment: Buffer = js.native
  /**
    * If true then this attachment should not be offered for download
    * (at least not in the main attachments list).
    */
  @JSName("related")
  var related_Attachment: Boolean = js.native
}

object Attachment {
  @scala.inline
  def apply(
    checksum: String,
    content: Buffer,
    contentDisposition: String,
    contentType: String,
    headerLines: HeaderLines,
    headers: Headers,
    related: Boolean,
    size: Double,
    `type`: attachment
  ): Attachment = {
    val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentDisposition = contentDisposition.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], headerLines = headerLines.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], related = related.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  @scala.inline
  implicit class AttachmentOps[Self <: Attachment] (val x: Self) extends AnyVal {
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
    def setContent(value: Buffer): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelated(value: Boolean): Self = this.set("related", value.asInstanceOf[js.Any])
  }
  
}

