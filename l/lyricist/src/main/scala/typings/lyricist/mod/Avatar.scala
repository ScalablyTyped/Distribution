package typings.lyricist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Avatar extends js.Object {
  var medium: AvatarConfig = js.native
  var small: AvatarConfig = js.native
  var thumb: AvatarConfig = js.native
  var tiny: AvatarConfig = js.native
}

object Avatar {
  @scala.inline
  def apply(medium: AvatarConfig, small: AvatarConfig, thumb: AvatarConfig, tiny: AvatarConfig): Avatar = {
    val __obj = js.Dynamic.literal(medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any], tiny = tiny.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatar]
  }
  @scala.inline
  implicit class AvatarOps[Self <: Avatar] (val x: Self) extends AnyVal {
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
    def setMedium(value: AvatarConfig): Self = this.set("medium", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmall(value: AvatarConfig): Self = this.set("small", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumb(value: AvatarConfig): Self = this.set("thumb", value.asInstanceOf[js.Any])
    @scala.inline
    def setTiny(value: AvatarConfig): Self = this.set("tiny", value.asInstanceOf[js.Any])
  }
  
}

