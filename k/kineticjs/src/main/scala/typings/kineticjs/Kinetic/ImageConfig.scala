package typings.kineticjs.Kinetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageConfig
  extends DrawOptionsConfig
     with ObjectOptionsConfig {
  var crop: js.UndefOr[js.Any] = js.native
  var image: js.Any = js.native
}

object ImageConfig {
  @scala.inline
  def apply(image: js.Any): ImageConfig = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageConfig]
  }
  @scala.inline
  implicit class ImageConfigOps[Self <: ImageConfig] (val x: Self) extends AnyVal {
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
    def setImage(value: js.Any): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrop(value: js.Any): Self = this.set("crop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
  }
  
}

