package typings.mailgunJs.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentParams extends js.Object {
  var contentType: js.UndefOr[String] = js.native
  var data: String | Buffer | ReadWriteStream = js.native
  var filename: js.UndefOr[String] = js.native
  var knownLength: js.UndefOr[Double] = js.native
}

object AttachmentParams {
  @scala.inline
  def apply(data: String | Buffer | ReadWriteStream): AttachmentParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentParams]
  }
  @scala.inline
  implicit class AttachmentParamsOps[Self <: AttachmentParams] (val x: Self) extends AnyVal {
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
    def setData(value: String | Buffer | ReadWriteStream): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setKnownLength(value: Double): Self = this.set("knownLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKnownLength: Self = this.set("knownLength", js.undefined)
  }
  
}

