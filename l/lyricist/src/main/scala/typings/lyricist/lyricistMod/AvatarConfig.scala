package typings.lyricist.lyricistMod

import typings.lyricist.Anon_Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarConfig extends js.Object {
  var bounding_box: Anon_Height
  var url: String
}

object AvatarConfig {
  @scala.inline
  def apply(bounding_box: Anon_Height, url: String): AvatarConfig = {
    val __obj = js.Dynamic.literal(bounding_box = bounding_box, url = url)
  
    __obj.asInstanceOf[AvatarConfig]
  }
}

