package typings.jimpBmp.mod

import typings.jimpBmp.anon.Imagebmp
import typings.jimpBmp.anon.ImagebmpImagexmsbmp
import typings.jimpBmp.anon.Imagexmsbmp
import typings.jimpBmp.anon.MIMEBMP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bmp extends js.Object {
  var constants: MIMEBMP = js.native
  var decoders: Imagexmsbmp = js.native
  var encoders: ImagebmpImagexmsbmp = js.native
  var mime: Imagebmp = js.native
}

object Bmp {
  @scala.inline
  def apply(constants: MIMEBMP, decoders: Imagexmsbmp, encoders: ImagebmpImagexmsbmp, mime: Imagebmp): Bmp = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bmp]
  }
  @scala.inline
  implicit class BmpOps[Self <: Bmp] (val x: Self) extends AnyVal {
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
    def setConstants(value: MIMEBMP): Self = this.set("constants", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecoders(value: Imagexmsbmp): Self = this.set("decoders", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoders(value: ImagebmpImagexmsbmp): Self = this.set("encoders", value.asInstanceOf[js.Any])
    @scala.inline
    def setMime(value: Imagebmp): Self = this.set("mime", value.asInstanceOf[js.Any])
  }
  
}

