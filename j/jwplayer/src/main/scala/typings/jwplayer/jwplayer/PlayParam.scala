package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerNumbers.`0`
import typings.jwplayer.jwplayerNumbers.`1`
import typings.jwplayer.jwplayerStrings.buffering
import typings.jwplayer.jwplayerStrings.playing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayParam extends js.Object {
  var oldstate: buffering | playing = js.native
  var viewable: `0` | `1` = js.native
}

object PlayParam {
  @scala.inline
  def apply(oldstate: buffering | playing, viewable: `0` | `1`): PlayParam = {
    val __obj = js.Dynamic.literal(oldstate = oldstate.asInstanceOf[js.Any], viewable = viewable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayParam]
  }
  @scala.inline
  implicit class PlayParamOps[Self <: PlayParam] (val x: Self) extends AnyVal {
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
    def setOldstate(value: buffering | playing): Self = this.set("oldstate", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewable(value: `0` | `1`): Self = this.set("viewable", value.asInstanceOf[js.Any])
  }
  
}

