package typings.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animationdelay extends js.Object {
  var `animation-delay`: String = js.native
  var left: String = js.native
  var top: String = js.native
}

object Animationdelay {
  @scala.inline
  def apply(`animation-delay`: String, left: String, top: String): Animationdelay = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("animation-delay")(`animation-delay`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animationdelay]
  }
  @scala.inline
  implicit class AnimationdelayOps[Self <: Animationdelay] (val x: Self) extends AnyVal {
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
    def `setAnimation-delay`(value: String): Self = this.set("animation-delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

