package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The body of a single MIME message part.
  */
@js.native
trait SchemaMessagePartBody extends js.Object {
  /**
    * When present, contains the ID of an external attachment that can be
    * retrieved in a separate messages.attachments.get request. When not
    * present, the entire content of the message part body is contained in the
    * data field.
    */
  var attachmentId: js.UndefOr[String] = js.native
  /**
    * The body data of a MIME message part as a base64url encoded string. May
    * be empty for MIME container types that have no message body or when the
    * body data is sent as a separate attachment. An attachment ID is present
    * if the body data is contained in a separate attachment.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * Number of bytes for the message part data (encoding notwithstanding).
    */
  var size: js.UndefOr[Double] = js.native
}

object SchemaMessagePartBody {
  @scala.inline
  def apply(): SchemaMessagePartBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessagePartBody]
  }
  @scala.inline
  implicit class SchemaMessagePartBodyOps[Self <: SchemaMessagePartBody] (val x: Self) extends AnyVal {
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
    def setAttachmentId(value: String): Self = this.set("attachmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachmentId: Self = this.set("attachmentId", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

