package typings.jimpJpeg.anon

import typings.jimpJpeg.jimpJpegStrings.imageSlashjpeg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIMEJPEG extends js.Object {
  var MIME_JPEG: imageSlashjpeg = js.native
}

object MIMEJPEG {
  @scala.inline
  def apply(MIME_JPEG: imageSlashjpeg): MIMEJPEG = {
    val __obj = js.Dynamic.literal(MIME_JPEG = MIME_JPEG.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIMEJPEG]
  }
  @scala.inline
  implicit class MIMEJPEGOps[Self <: MIMEJPEG] (val x: Self) extends AnyVal {
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
    def setMIME_JPEG(value: imageSlashjpeg): Self = this.set("MIME_JPEG", value.asInstanceOf[js.Any])
  }
  
}

