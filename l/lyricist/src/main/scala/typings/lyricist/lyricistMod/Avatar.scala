package typings.lyricist.lyricistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Avatar extends js.Object {
  var medium: AvatarConfig
  var small: AvatarConfig
  var thumb: AvatarConfig
  var tiny: AvatarConfig
}

object Avatar {
  @scala.inline
  def apply(medium: AvatarConfig, small: AvatarConfig, thumb: AvatarConfig, tiny: AvatarConfig): Avatar = {
    val __obj = js.Dynamic.literal(medium = medium, small = small, thumb = thumb, tiny = tiny)
  
    __obj.asInstanceOf[Avatar]
  }
}

