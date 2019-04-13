package typings
package lyricistLib.lyricistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarConfig extends js.Object {
  var bounding_box: lyricistLib.Anon_Height
  var url: java.lang.String
}

object AvatarConfig {
  @scala.inline
  def apply(bounding_box: lyricistLib.Anon_Height, url: java.lang.String): AvatarConfig = {
    val __obj = js.Dynamic.literal(bounding_box = bounding_box, url = url)
  
    __obj.asInstanceOf[AvatarConfig]
  }
}

