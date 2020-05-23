package typings.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Following extends js.Object {
  var following: Boolean
  var pyong: Boolean
}

object Following {
  @scala.inline
  def apply(following: Boolean, pyong: Boolean): Following = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], pyong = pyong.asInstanceOf[js.Any])
    __obj.asInstanceOf[Following]
  }
}

