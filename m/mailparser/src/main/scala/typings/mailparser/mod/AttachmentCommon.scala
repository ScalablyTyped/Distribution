package typings.mailparser.mod

import typings.mailparser.anon.Key
import typings.mailparser.mailparserStrings.attachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * COmmon part of the Attachment object.
  */
@js.native
trait AttachmentCommon extends js.Object {
  /**
    * A MD5 hash of the message content.
    */
  var checksum: String = js.native
  /**
    * `contentId` without `<` and `>`.
    */
  var cid: js.UndefOr[String] = js.native
  /**
    * Attachment contents.
    */
  var content: js.Any = js.native
  /**
    * Content disposition type for the attachment,
    * most probably `'attachment'`.
    */
  var contentDisposition: String = js.native
  /**
    * The header value from `Content-ID`.
    */
  var contentId: js.UndefOr[String] = js.native
  /**
    * MIME type of the message.
    */
  var contentType: String = js.native
  /**
    * File name of the attachment.
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * An array of raw header lines for the attachment node.
    */
  var headerLines: HeaderLines = js.native
  /**
    * A Map value that holds MIME headers for the attachment node.
    */
  var headers: Headers = js.native
     // e.g. '5.1321281380971@localhost'
  /**
    * If true then this attachment should not be offered for download
    * (at least not in the main attachments list).
    */
  var related: js.UndefOr[Boolean] = js.native
  /**
    * Message size in bytes.
    */
  var size: Double = js.native
  /**
    * Message type.
    */
  var `type`: attachment = js.native
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
    `type`: attachment
  ): AttachmentCommon = {
    val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentDisposition = contentDisposition.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], headerLines = headerLines.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentCommon]
  }
  @scala.inline
  implicit class AttachmentCommonOps[Self <: AttachmentCommon] (val x: Self) extends AnyVal {
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
    def setChecksum(value: String): Self = this.set("checksum", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentDisposition(value: String): Self = this.set("contentDisposition", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderLinesVarargs(value: Key*): Self = this.set("headerLines", js.Array(value :_*))
    @scala.inline
    def setHeaderLines(value: HeaderLines): Self = this.set("headerLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: attachment): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCid(value: String): Self = this.set("cid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCid: Self = this.set("cid", js.undefined)
    @scala.inline
    def setContentId(value: String): Self = this.set("contentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentId: Self = this.set("contentId", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setRelated(value: Boolean): Self = this.set("related", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelated: Self = this.set("related", js.undefined)
  }
  
}

