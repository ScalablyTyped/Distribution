package typings.jimpBmp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Imagebmp extends js.Object {
  @JSName("image/bmp")
  var imageSlashbmp: js.Array[String] = js.native
}

object Imagebmp {
  @scala.inline
  def apply(imageSlashbmp: js.Array[String]): Imagebmp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/bmp")(imageSlashbmp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imagebmp]
  }
  @scala.inline
  implicit class ImagebmpOps[Self <: Imagebmp] (val x: Self) extends AnyVal {
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
    def setImageSlashbmpVarargs(value: String*): Self = this.set("image/bmp", js.Array(value :_*))
    @scala.inline
    def setImageSlashbmp(value: js.Array[String]): Self = this.set("image/bmp", value.asInstanceOf[js.Any])
  }
  
}

