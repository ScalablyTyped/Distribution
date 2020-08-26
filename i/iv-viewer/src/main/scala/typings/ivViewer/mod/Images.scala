package typings.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Images extends js.Object {
  var hiResImageSrc: IVImage = js.native
  var imageSrc: IVImage = js.native
}

object Images {
  @scala.inline
  def apply(): Images = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Images]
  }
  @scala.inline
  implicit class ImagesOps[Self <: Images] (val x: Self) extends AnyVal {
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
    def setHiResImageSrc(value: IVImage): Self = this.set("hiResImageSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def setHiResImageSrcNull: Self = this.set("hiResImageSrc", null)
    @scala.inline
    def setImageSrc(value: IVImage): Self = this.set("imageSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageSrcNull: Self = this.set("imageSrc", null)
  }
  
}

