package typings.jestCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsWatchMode extends js.Object {
  var isWatchMode: Boolean = js.native
}

object IsWatchMode {
  @scala.inline
  def apply(isWatchMode: Boolean): IsWatchMode = {
    val __obj = js.Dynamic.literal(isWatchMode = isWatchMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsWatchMode]
  }
  @scala.inline
  implicit class IsWatchModeOps[Self <: IsWatchMode] (val x: Self) extends AnyVal {
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
    def setIsWatchMode(value: Boolean): Self = this.set("isWatchMode", value.asInstanceOf[js.Any])
  }
  
}

