package typings.kineticjs.Kinetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpriteConfig
  extends DrawOptionsConfig
     with ObjectOptionsConfig {
  var animation: js.UndefOr[js.Any] = js.native
  var animations: js.UndefOr[js.Any] = js.native
  var frameRate: js.UndefOr[Double] = js.native
  var image: js.Any = js.native
}

object SpriteConfig {
  @scala.inline
  def apply(image: js.Any): SpriteConfig = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteConfig]
  }
  @scala.inline
  implicit class SpriteConfigOps[Self <: SpriteConfig] (val x: Self) extends AnyVal {
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
    def setAnimation(value: js.Any): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAnimations(value: js.Any): Self = this.set("animations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimations: Self = this.set("animations", js.undefined)
    @scala.inline
    def setFrameRate(value: Double): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
  }
  
}

