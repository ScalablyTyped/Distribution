package typings.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Features extends js.Object {
  var flash: Boolean = js.native
  var flashVersion: Double = js.native
  var iframe: Boolean = js.native
}

object Features {
  @scala.inline
  def apply(flash: Boolean, flashVersion: Double, iframe: Boolean): Features = {
    val __obj = js.Dynamic.literal(flash = flash.asInstanceOf[js.Any], flashVersion = flashVersion.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  @scala.inline
  implicit class FeaturesOps[Self <: Features] (val x: Self) extends AnyVal {
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
    def setFlash(value: Boolean): Self = this.set("flash", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlashVersion(value: Double): Self = this.set("flashVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setIframe(value: Boolean): Self = this.set("iframe", value.asInstanceOf[js.Any])
  }
  
}

