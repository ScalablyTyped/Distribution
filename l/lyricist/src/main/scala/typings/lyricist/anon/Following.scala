package typings.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Following extends js.Object {
  var following: Boolean = js.native
  var pyong: Boolean = js.native
}

object Following {
  @scala.inline
  def apply(following: Boolean, pyong: Boolean): Following = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], pyong = pyong.asInstanceOf[js.Any])
    __obj.asInstanceOf[Following]
  }
  @scala.inline
  implicit class FollowingOps[Self <: Following] (val x: Self) extends AnyVal {
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
    def setFollowing(value: Boolean): Self = this.set("following", value.asInstanceOf[js.Any])
    @scala.inline
    def setPyong(value: Boolean): Self = this.set("pyong", value.asInstanceOf[js.Any])
  }
  
}

