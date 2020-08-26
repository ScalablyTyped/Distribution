package typings.imagesloaded.ImagesLoaded

import typings.imagesloaded.imagesloadedBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagesLoadedOptions extends js.Object {
  var background: `true` | String = js.native
}

object ImagesLoadedOptions {
  @scala.inline
  def apply(background: `true` | String): ImagesLoadedOptions = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagesLoadedOptions]
  }
  @scala.inline
  implicit class ImagesLoadedOptionsOps[Self <: ImagesLoadedOptions] (val x: Self) extends AnyVal {
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
    def setBackground(value: `true` | String): Self = this.set("background", value.asInstanceOf[js.Any])
  }
  
}

