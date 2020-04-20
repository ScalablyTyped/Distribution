package typings.lyricist.mod

import typings.lyricist.AnonHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarConfig extends js.Object {
  var bounding_box: AnonHeight
  var url: String
}

object AvatarConfig {
  @scala.inline
  def apply(bounding_box: AnonHeight, url: String): AvatarConfig = {
    val __obj = js.Dynamic.literal(bounding_box = bounding_box.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarConfig]
  }
}

